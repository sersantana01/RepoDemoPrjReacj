package com.example.demo.service;

import com.example.demo.exception.DemoException;
import com.example.demo.form.EmpleadosForm;
import com.example.demo.form.ParametrosDataDto;

public interface DemoService {
	
	public String obtenerEeventos(ParametrosDataDto parametrosDataDto )  ;

	public String operacionInformacion(ParametrosDataDto parametrosDataDto );
}
