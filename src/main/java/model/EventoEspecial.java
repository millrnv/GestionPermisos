package model;

public class EventoEspecial extends Permiso {
	private String tipoEvento;
	private int cantEsperada;
	private String mSeguridad;

	public String getTipo() {
		throw new UnsupportedOperationException();
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
		throw new UnsupportedOperationException();
	}
}