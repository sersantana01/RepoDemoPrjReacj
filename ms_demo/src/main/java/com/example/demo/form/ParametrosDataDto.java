package com.example.demo.form;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "All details about the ParametrosDataDto. ")
public class ParametrosDataDto {
	
	@ApiModelProperty(notes = "Nombre del paquete")
	@NotEmpty
	@NotBlank
	@NotNull
	String nombrePaquete;
	
	@ApiModelProperty(notes = "nombre del store procedure")
	@NotEmpty
	@NotBlank
	@NotNull
	String nombreStoreProcedure;
	
	@ApiModelProperty(notes = "Nombre del microservicio")
	@NotEmpty
	@NotBlank
	@NotNull
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
