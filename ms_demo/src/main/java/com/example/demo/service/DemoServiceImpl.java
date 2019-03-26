package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.demo.exception.DemoException;
import com.example.demo.form.EmpleadosForm;
import com.example.demo.form.ParametrosDataDto;
import com.google.gson.Gson;


@Service
public class DemoServiceImpl implements DemoService {

	
	@Autowired	
	@LoadBalanced
	private RestTemplate restTemplate;
	

	@Override
	public String obtenerEeventos(ParametrosDataDto parametrosDataDto )  {
		
		
			
	
	
		
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	     
	      
	      Gson gson=new Gson();
	      
	       
	   ResponseEntity<String> response = restTemplate.postForEntity("http://MS-DATA-Q/solicitarDatosDataSO",  gson.toJson(parametrosDataDto) ,   String.class) ;

		
	  return response.getBody();
	}
	

	
	
	
	
	
}
