package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.DemoException;
import com.example.demo.form.EmpleadosForm;
import com.example.demo.form.ParametrosDataDto;
import com.example.demo.service.DemoService;
import com.example.demo.service.DemoServiceImpl;
import com.example.demo.service.MapValidarFormService;

//Controllador de prueba 

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class DemoController {

    @Autowired
	DemoService demoService;

    @Autowired
    MapValidarFormService validarFormService;

	@RequestMapping(value="/getEvento", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> obtenerEvento(@Valid @RequestBody ParametrosDataDto parametrosDataDto,
			                                       BindingResult result  ) {



			ResponseEntity<?> errorMap = validarFormService.valdarFormService(result);
			if(errorMap!=null) return errorMap;

			String resultado = demoService.obtenerEeventos(parametrosDataDto);
			return new ResponseEntity<String>(resultado, HttpStatus.OK);





	}

}
