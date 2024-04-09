package model;

import java.util.Date;

public class Negocio extends Permiso {
	private String tipoNegocio;
	private double tamanioLocal;
	private int cantEmpleados;

	//Constructor
	public Negocio(Date fechaEmision, Date fechaVencimiento, String id, double costo, String tipoNegocio, double tamanioLocal, int cantEmpleados) {
		super(fechaEmision, fechaVencimiento, id, costo);
		this.tipoNegocio = tipoNegocio;
		this.tamanioLocal = tamanioLocal;
		this.cantEmpleados = cantEmpleados;
	}

	public String getTipo() {
		return "Negocio";
	}

	public String getTipoNegocio() {
		return this.tipoNegocio;
	}

	public void setTipoNegocio(String tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public double getTamanioLocal() {
		return this.tamanioLocal;
	}

	public void setTamanioLocal(double tamanioLocal) {
		this.tamanioLocal = tamanioLocal;
	}

	public int getCantEmpleados() {
		return this.cantEmpleados;
	}

	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}

	public double costoPermiso() {
		return costo+(tamanioLocal*150000)+(cantEmpleados*20000);
	}
}