package model;

import java.util.ArrayList;
import java.util.List;

public class GestionMunicipal {
	private Municipalidad municipalidad;
	private ArrayList<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();

	public void registrarCiudadano() {
		throw new UnsupportedOperationException();
	}

	//Metodo para buscar permisos por tipo
	public List<Permiso> buscarPermisosPorTipo(String tipo) {
		List<Permiso> permisosPorTipo = new ArrayList<Permiso>();
		for(Permiso permiso : municipalidad.getPermisos()) {
			if (permiso.getTipo().equals(tipo)) {
				permisosPorTipo.add(permiso);
			}
		}return permisosPorTipo;

	}

	//Metodo para ver si permiso existe
	public boolean permisoExiste(Permiso permiso) {
		for(Permiso vpermiso : municipalidad.getPermisos()) {
			if (permiso.getId().equals(vpermiso.getId())) {
				return true;
			}
		}return false;
	}

	//Metodo para agregar permiso
	public boolean agregarPermiso(Permiso permiso) {
		if (!permisoExiste(permiso)) {
			municipalidad.getPermisos().add(permiso);
			return true;
		}return false;
	}

	//Metodo para eliminar permiso
	public boolean eliminarPermiso(Permiso permiso) {
		if (permisoExiste(permiso)) {
			municipalidad.getPermisos().remove(permiso);
			return true;
		}return false;
	}


	public void solicitarNuevosPermisos() {
		throw new UnsupportedOperationException();
	}



}