package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.DemoException;
import com.example.demo.service.DemoService;
import com.example.demo.service.DemoServiceImpl;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class DemoController {
	
    @Autowired
	DemoService demoService;

	@RequestMapping(value="/getDirecciones", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> obtenerDireccion() {
		
		try {

			String resultado = demoService.obtenerDireccion("");
			return new ResponseEntity<String>(resultado, HttpStatus.OK);
			
		}catch(DemoException e) {	
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NO_CONTENT);
			
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NO_CONTENT);
		}
		
	}

}