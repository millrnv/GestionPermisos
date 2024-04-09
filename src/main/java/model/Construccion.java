package model;

public class Construccion extends Permiso {
	private String tipoConstruccion;
	private double mCuadrados;
	private String ubicacion;

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public String getTipoConstruccion() {
		return this.tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	public double getMCuadrados() {
		return this.mCuadrados;
	}

	public void setMCuadrados(double mCuadrados) {
		this.mCuadrados = mCuadrados;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double costoPermiso() {
		throw new UnsupportedOperationException();
	}
}