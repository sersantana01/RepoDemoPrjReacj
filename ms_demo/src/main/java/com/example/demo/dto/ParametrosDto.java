package com.example.demo.dto;

public class ParametrosDto {
	
	String nombreParametro;
	String tipo;
	String valor;


	public ParametrosDto() {
		
	}
	public String getNombreParametro() {
		return nombreParametro;
	}
	public void setNombreParametro(String nombreParametro) {
		this.nombreParametro = nombreParametro;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "ParametrosDto [nombreParametro=" + nombreParametro + ", tipo=" + tipo + ", valor=" + valor + "]";
	}
}
