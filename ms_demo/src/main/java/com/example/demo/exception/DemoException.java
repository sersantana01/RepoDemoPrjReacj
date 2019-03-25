package com.example.demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)	
public class DemoException   extends RuntimeException{

  private static final long serialVersionUID = 1L;
	
	public DemoException(){
		super();
		
	}
	
	public DemoException(String message, Throwable cause){
		super(message, cause);
		
	}
	
	public DemoException(String message){
		super(message);
		
	}
	
	public DemoException(Throwable throwable){
		super(throwable);
	}

	

}
