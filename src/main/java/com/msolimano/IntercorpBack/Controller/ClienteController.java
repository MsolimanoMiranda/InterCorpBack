package com.msolimano.IntercorpBack.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.msolimano.IntercorpBack.Entity.Cliente;
import com.msolimano.IntercorpBack.Entity.KpiCliente;
import com.msolimano.IntercorpBack.Entity.ViewCliente;
import com.msolimano.IntercorpBack.Service.IClienteService;
import java.math.BigDecimal;






@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ClienteController {
	
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping(path="/listclientes", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<ViewCliente> index() {

		List<ViewCliente> datos= new ArrayList<ViewCliente>();
		Iterator<?> iterador  = clienteService.ListViewClientes().iterator();
		while(iterador.hasNext()) {
			ViewCliente m= new ViewCliente();
	        Object obj[] = (Object[]) iterador.next();
	        m.setId((int) obj[0]);
	        m.setNombres((String) obj[1]);
	        m.setApellidos((String) obj[2]);
	        m.setEdad((int) obj[3]);
	        m.setFecha_nacimiento((Date) obj[4]);
	        m.setfecha_muerte((Date) obj[5]);
	        datos.add(m);   
	    }
		
		return datos;
	}

	
	@GetMapping(path="/kpiclientes", produces=MediaType.APPLICATION_JSON_VALUE)
	public KpiCliente kpi_clientes() {

		KpiCliente datos= new KpiCliente();
		Iterator<?> iterador  = clienteService.FindKpi().iterator();
		while(iterador.hasNext()) {
	        Object obj[] = (Object[]) iterador.next();
	        datos.setMedia((BigDecimal) obj[0]);
	        datos.setDesviacion((BigDecimal) obj[1]);    
	        
	    }
		
		return datos;
	}

	
	@PostMapping("/crearcliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		
		return clienteService.save(cliente);
	}
	
	

	

	
	
	

}
