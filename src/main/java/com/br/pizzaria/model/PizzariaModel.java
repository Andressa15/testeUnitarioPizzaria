package com.br.pizzaria.model;

public class PizzariaModel {

	private String sabor;
	private String massa;
	private String borda;
	private double valor;

	public PizzariaModel() {

	}

	public PizzariaModel(String sabor, String massa, String borda, double valor) {
		super();
		this.sabor = sabor;
		this.massa = massa;
		this.borda = borda;
		this.valor = valor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}