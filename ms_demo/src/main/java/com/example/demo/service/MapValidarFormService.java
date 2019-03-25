package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Service
public class MapValidarFormService {
	
	
	public MapValidarFormService() {
		
	}
	
	
	public ResponseEntity<?> valdarFormService(BindingResult result){
		
		
		ResponseEntity<?> mapValidacion=null;
		if(result.hasErrors()) {
			System.out.print("Validar datos" +  result.hasErrors());
			
			
			Map<String, String> erroMap=new HashMap<>();
			for (FieldError field:result.getFieldErrors()) {
				erroMap.put(field.getField(), field.getDefaultMessage());
				
			}
			
			mapValidacion= new ResponseEntity<Map<String,String>>(erroMap, HttpStatus.BAD_REQUEST);
		}
		
		
		 return mapValidacion;
	}

}
