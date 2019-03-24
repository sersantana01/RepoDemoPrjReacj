package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.ParametrosDataDto;
import com.example.demo.dto.ParametrosDto;
import com.example.demo.exception.DemoException;
import com.google.gson.Gson;


@Service
public class DemoServiceImpl implements DemoService {

	
	@Autowired
	@LoadBalanced
	private RestTemplate restTemplate;
	

	@Override
	public String obtenerDireccion(String json) throws DemoException {
		
		ParametrosDataDto paramDat=new ParametrosDataDto();
		
		paramDat.setNombreMs("demo");
		paramDat.setNombrePaquete("PXC50001.PRUEBAS");
		paramDat.setNombreStoreProcedure("p_pruebasp");
		
		ParametrosDto  parametro=new ParametrosDto();
		parametro.setNombreParametro("P_id_evento");
		parametro.setTipo("string");
		parametro.setValor("999");
		
		ParametrosDto  parametro2=new ParametrosDto();
		parametro2.setNombreParametro("p_folio");
		parametro2.setTipo("string");
		parametro2.setValor("999");
		
		ArrayList<ParametrosDto> listParam=new ArrayList<ParametrosDto>();
		listParam.add(parametro2);
		listParam.add(parametro);
		
		paramDat.setParam(listParam);
		
		
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	     
	      
	      Gson gson=new Gson();
	      
	       
	   ResponseEntity<List> response = restTemplate.postForEntity("http://MS-DATA-SQ/solicitarDatos",  gson.toJson(paramDat) ,   List.class) ;


	      
	   List<String> resul=(List<String>)response.getBody();
	      
	   String resultadoJso="[";
	     int a=1;
	   for(String d: resul) {
		   System.out.println( d);
		   
		   
		   resultadoJso=resultadoJso+d;
		   
		   if(resul.size()>1 && resul.size()!=a) {
			   resultadoJso=resultadoJso+",";
		   }
		   a++;
	   }
	   
	       
	      
	   resultadoJso=resultadoJso+"]";
	      
	      
	
		
	return resultadoJso  ;
		
	
	}
	
	
	
	
	
}
