package model;

import java.util.ArrayList;

public class Municipalidad {
	public GestionMunicipal GestionMunicipal;
	private ArrayList<Permiso> permisos = new ArrayList<Permiso>();
	private ArrayList<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();

	public model.GestionMunicipal getGestionMunicipal() {
		return GestionMunicipal;
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