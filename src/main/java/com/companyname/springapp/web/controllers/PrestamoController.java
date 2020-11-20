package com.companyname.springapp.web.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.business.entities.Libro;
import com.companyname.springapp.business.entities.Prestamo;
import com.companyname.springapp.business.services.AsociadoManager;
import com.companyname.springapp.business.services.LibrosManager;
import com.companyname.springapp.business.services.PrestamoManager;

@Controller
public class PrestamoController {

	@Autowired 
	private AsociadoManager asociadomanager;
	
	@Autowired 
	private LibrosManager librosmanager;
	
	@Autowired 
	private PrestamoManager prestamomanager;
	
	//Esta acción lista el historial de préstamos concluidos (Devueltos)
	@RequestMapping(value = "/historialPrestamosDevueltos", method = RequestMethod.GET)
	public ModelAndView displayHistorialPrestamos() {
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("prestamosdevueltos",prestamomanager.getPrestamosDevueltos());
		return new ModelAndView("historialPrestamosDevueltos", "model", myModel);
	}
	
	//Esta acción devuelve el formulario para cargar un nuevo préstamo
	@RequestMapping(value = "/addPrestamo", method = RequestMethod.GET)
	public ModelAndView displayAddPrestamoForm() {
		Map<String, Object> myModel = new HashMap<String, Object>();
    	myModel.put("asociados", asociadomanager.getAsociados());
    	myModel.put("libros", librosmanager.getLibros());
    	
    	return new ModelAndView("addPrestamo", "model", myModel);
	}
	//Esta acción crea el nuevo préstamo en base a los parámetros del formulario
	@RequestMapping(value = "/addPrestamo", method = RequestMethod.POST)
	public ModelAndView savePrestamo(@RequestParam Map<String,String> allParams) {
		try {
			//Se crea un nuevo Prestamo y se le asignan los datos que vienen del POST
			Prestamo nuevoPrestamo = new Prestamo();
			nuevoPrestamo.setAsociado(asociadomanager.getAsociadoById(Integer.parseInt(allParams.get("asociado"))));
			Libro libro = librosmanager.getLibroById(Integer.parseInt(allParams.get("libro")));
			if(libro.getCantidad() < 1) {
				throw new Exception();
			}
			libro.setCantidad(libro.getCantidad() - 1);
			librosmanager.insertar(libro);
			nuevoPrestamo.setLibro(librosmanager.getLibroById(Integer.parseInt(allParams.get("libro"))));
			//La fecha del prestamo es la fecha de hoy
			nuevoPrestamo.setFechaPrestamo(new Date());
			//Aqui ponemos formato a la fecha de vencimiento que viene del server
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaDeVencimiento;
			try {
				fechaDeVencimiento = df.parse(allParams.get("fechaDeVencimiento"));
			} catch (ParseException e) {
				fechaDeVencimiento = new Date();
			}
			nuevoPrestamo.setFechaVencimiento(fechaDeVencimiento);
			//Finalmente usamos el servicio insertar
			prestamomanager.insertar(nuevoPrestamo);
			//y volvemos a home
			return new ModelAndView("redirect:/home");
		}
		catch(Exception e) {
			return new ModelAndView("noMoreUnitsError");
		}
	}
	
	//Esta acción concreta la devolución y por ende cierre de un préstamo
	@RequestMapping(value = "/devolverPrestamo/{idPrestamo}", method = RequestMethod.GET)
	public ModelAndView devolverPrestamo(@PathVariable Integer idPrestamo) {
		try {
			Prestamo prestamo = prestamomanager.getPrestamoById(idPrestamo);
			if(prestamo.getFechaDevolucion()!=null) {
				throw new Exception();
			}
			prestamo.getLibro().setCantidad(prestamo.getLibro().getCantidad() + 1);
			librosmanager.insertar(prestamo.getLibro());
			prestamo.setFechaDevolucion(new Date());
			prestamomanager.insertar(prestamo);
			ModelAndView mv = new ModelAndView("devolverPrestamo");
			mv.addObject("prestamo", prestamo);
			return mv;
		}
		catch(Exception e) {
			return new ModelAndView("yaDevueltoError");
		}
	}
	
	//Eliminar el registro de un préstamo (Debe haber sido Devuelto primero)
	@RequestMapping(value = "/deletePrestamo/{idPrestamo}", method = RequestMethod.GET)
	public ModelAndView deleteAsociadoById(@PathVariable Integer idPrestamo) {
		try {
			if(prestamomanager.getPrestamoById(idPrestamo).getFechaDevolucion()==null) {
				throw new Exception();
			}
			boolean isDeleted = prestamomanager.deletePrestamoById(idPrestamo);
			System.out.println("Prestamo deletion respone: " + isDeleted);
			ModelAndView mv = new ModelAndView("redirect:/historialPrestamosDevueltos");
			return mv;
		}
		catch(Exception e){
			return new ModelAndView("prestamoNoCerradoError");
		}
	}
}
	
