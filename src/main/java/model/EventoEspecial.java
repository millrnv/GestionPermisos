package model;

import java.util.Date;

public class EventoEspecial extends Permiso {
	private String tipoEvento;
	private int cantEsperada;
	private String mSeguridad;

	//Constructor
	public EventoEspecial(Date fechaEmision, Date fechaVencimiento, String id, double costo, String tipoEvento, int cantEsperada, String mSeguridad) {
		super(fechaEmision, fechaVencimiento, id, costo);
		this.tipoEvento = tipoEvento;
		this.cantEsperada = cantEsperada;
		this.mSeguridad = mSeguridad;
	}

	public String getTipo() {
		return "Evento Especial";
	}

	public String getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getCantEsperada() {
		return this.cantEsperada;
	}

	public void setCantEsperada(int cantEsperada) {
		this.cantEsperada = cantEsperada;
	}

	public String getMSeguridad() {
		return this.mSeguridad;
	}

	public void setMSeguridad(String mSeguridad) {
		this.mSeguridad = mSeguridad;
	}

	public double costoPermiso() {
		return costo+(cantEsperada/(100*100000));
	}
}