package com.api.response.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.api.response.dto.ApiResponse;
import com.api.response.service.IPruebaConsultaService;

@Service
public class PruebaConsultaServiceImpl implements IPruebaConsultaService {

	@Override
	public ApiResponse consulta() {
		return ApiResponse.builder().data("hola mundo").status(HttpStatus.NOT_FOUND).build();
	}

}
