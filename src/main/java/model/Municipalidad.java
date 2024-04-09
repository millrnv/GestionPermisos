package model;

import java.util.ArrayList;

public class Municipalidad {

	private String nombre;
	public GestionMunicipal GestionMunicipal;

	public Municipalidad(String nombre){
		this.nombre = nombre;

	}
	private ArrayList<Permiso> permisos = new ArrayList<Permiso>();
	private ArrayList<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();

	public model.GestionMunicipal getGestionMunicipal() {
		return GestionMunicipal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setGestionMunicipal(model.GestionMunicipal gestionMunicipal) {
		GestionMunicipal = gestionMunicipal;
	}

	public ArrayList<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(ArrayList<Permiso> permisos) {
		this.permisos = permisos;
	}

	public ArrayList<Ciudadano> getCiudadanos() {
		return ciudadanos;
	}

	public void setCiudadanos(ArrayList<Ciudadano> ciudadanos) {
		this.ciudadanos = ciudadanos;
	}

}