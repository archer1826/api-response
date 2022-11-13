package com.api.response.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.response.dto.ApiResponse;
import com.api.response.service.IPruebaConsultaService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/prueba")
public class PruebaController {

	@Autowired
	private IPruebaConsultaService service;
	
	@GetMapping
	public ResponseEntity<ApiResponse> consulta() {
		ApiResponse response = service.consulta();
		return new ResponseEntity<>(response, response.getStatus());
	}
	
}

