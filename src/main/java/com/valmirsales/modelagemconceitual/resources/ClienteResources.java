package com.valmirsales.modelagemconceitual.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valmirsales.modelagemconceitual.domain.Cliente;
import com.valmirsales.modelagemconceitual.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResources {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
