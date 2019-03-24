package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class ParametrosDataDto {
	
	String nombrePaquete;
	String nombreStoreProcedure;	
	String nombreMs;
	
	
	
	public String getNombreMs() {
		return nombreMs;
	}

	public void setNombreMs(String nombreMs) {
		this.nombreMs = nombreMs;
	}

	List<ParametrosDto> param;
	
	
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

	public void setParam(ArrayList<ParametrosDto> param) {
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
