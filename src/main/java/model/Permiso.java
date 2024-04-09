package model;

import java.util.Date;

public abstract class Permiso {
	protected Date fechaEmision;
	protected Date fechaVencimiento;
	protected String id;
	protected double costo;
	private Municipalidad municipalidad;


	//Constructor
	public Permiso(Date fechaEmision, Date fechaVencimiento, String id, double costo) {
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
		this.id = id;
		this.costo = costo;
	}


	public abstract String getTipo();

	public Date getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCosto() {
		return this.costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public abstract double costoPermiso();
}