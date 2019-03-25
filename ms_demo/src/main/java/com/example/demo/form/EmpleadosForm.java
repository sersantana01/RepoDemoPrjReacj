package com.example.demo.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.Positive;


public class EmpleadosForm {
	
	
	
	public String  nombreEmpleado;
	
	@Positive
	public int edad;
	
	@Email
	public String mail;

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	

}
