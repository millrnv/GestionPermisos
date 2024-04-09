package model;

public class Negocio extends Permiso {
	private String tipoNegocio;
	private double tamanioLocal;
	private int cantEmpleados;

	public String getTipo() {
		throw new UnsupportedOperationException();
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
		throw new UnsupportedOperationException();
	}
}