package model;

import java.util.Date;

public class Construccion extends Permiso {
	private String tipoConstruccion;
	private double m2AConstruir;
	private String ubicacion;

	//Constructor
	public Construccion(Date fechaEmision, Date fechaVencimiento, String id, double costo, String tipoConstruccion, double mCuadrados, String ubicacion) {
		super(fechaEmision, fechaVencimiento, id, costo);
		this.tipoConstruccion = tipoConstruccion;
		this.m2AConstruir = mCuadrados;
		this.ubicacion = ubicacion;


	}

	public String getTipo() {
		return "Construccion";
	}

	public String getTipoConstruccion() {
		return this.tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	public double getMCuadrados() {
		return this.m2AConstruir;
	}

	public void setMCuadrados(double mCuadrados) {
		this.m2AConstruir = mCuadrados;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double costoPermiso() {
		return costo+(m2AConstruir*150000);
	}


}