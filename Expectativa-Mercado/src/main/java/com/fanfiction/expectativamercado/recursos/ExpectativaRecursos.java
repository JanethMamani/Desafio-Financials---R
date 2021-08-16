package com.fanfiction.expectativamercado.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fanfiction.expectativamercado.entidades.ExpectativaMercado;
import com.fanfiction.expectativamercado.repositorios.ExpectativaRepositorio;

@RestController
@RequestMapping(value = "/expectativas")
public class ExpectativaRecursos {
	
	@Autowired
	private ExpectativaRepositorio repo;
	
	@GetMapping
	public ResponseEntity<List<ExpectativaMercado>> Encontre() {
		List<ExpectativaMercado> situacao = repo.findAll();
		return ResponseEntity.ok(situacao);
	}

}
