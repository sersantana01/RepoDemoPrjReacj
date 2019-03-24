package com.example.demo.exception;

public class DemoException   extends Exception{
	
	
	
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
