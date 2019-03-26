package com.example.demo.form;

import java.util.List;

import javax.validation.constraints.NotEmpty;

public class ParametrosDataDto {
	
	@NotEmpty
	String nombrePaquete;
	@NotEmpty
	String nombreStoreProcedure;	
	@NotEmpty
	String nombreMs;
	
	
	List<ParametrosDto> param;
	
	
	
	public String getNombreMs() {
		return nombreMs;
	}

	public void setNombreMs(String nombreMs) {
		this.nombreMs = nombreMs;
	}

	
	
	
	public ParametrosDataDto() {
		
	}

	public String getNombrePaquete() {
		return nombrePaquete;
	}

	public void setNombrePaquete(String nombrePaquete) {
		this.nombrePaquete = nombrePaquete;
	}

	public String getNombreStoreProcedure() {
		return nombreStoreProcedure;
	}

	public void setNombreStoreProcedure(String nombreStoreProcedure) {
		this.nombreStoreProcedure = nombreStoreProcedure;
	}

	public List<ParametrosDto> getParam() {
		return param;
	}

	public void setParam(List<ParametrosDto> param) {
		this.param = param;
	}

	@Override
	public String toString() {
		return "ParametrosDataDto [nombrePaquete=" + nombrePaquete + ", nombreStoreProcedure=" + nombreStoreProcedure +"NombreMS="+getNombreMs()
				+ ", param=" + param + ", getNombrePaquete()=" + getNombrePaquete() + ", getNombreStoreProcedure()="
				+ getNombreStoreProcedure() + ", getParam()=" + getParam().toString().toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
