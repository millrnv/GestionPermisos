package model;

public class Ciudadano {
	private String nombre;
	private String rut;

	//Constructor
	public Ciudadano(String nombre, String rut) {
		this.nombre = nombre;
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
}