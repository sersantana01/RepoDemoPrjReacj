package com.example.demo.repository;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.form.ParametrosDataDto;
import com.google.gson.Gson;

@Component
public class  RepositoryServiceDO{
	
	@Autowired	
	@LoadBalanced
	private RestTemplate restTemplate;
	
	
	
	public String obtenerEventoData(ParametrosDataDto parametrosDataDto) {
		
		return obtenerInformacionOracleORDS(parametrosDataDto);
		
	}
	

	
	
	
	 private String obtenerInformacionOracleORDS(ParametrosDataDto parametrosDataDto  ){
		 
		 HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	     
	      
	      Gson gson=new Gson();
	      
	       
	   ResponseEntity<String> response = restTemplate.postForEntity("http://MS-DATA-Q/solicitarDatosDataSO",  gson.toJson(parametrosDataDto) ,   String.class) ;

	   return response.getBody();
	 }
}
