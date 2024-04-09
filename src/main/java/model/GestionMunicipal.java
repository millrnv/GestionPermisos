package model;

import java.util.ArrayList;
import java.util.Date;
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

	//Metodo para buscar permisos por fechaEmision
	public List<Permiso> buscarPermisosFechaEmision(Date fechaEmision){
		List<Permiso> permisosPorFechaEmision = new ArrayList<>();

		for(Permiso permiso : municipalidad.getPermisos()){
			if(permiso.getFechaEmision().equals(fechaEmision)){
				permisosPorFechaEmision.add(permiso);

			}

		}
		return permisosPorFechaEmision;
	}

	//Metodo para buscar permiso por fechaVencimiento
	public List<Permiso> buscarPermisoFechaVencimiento(Date fechaVencimiento) {
		List<Permiso> permisosPorFechaVencimiento = new ArrayList<>();

		for(Permiso permiso : municipalidad.getPermisos()){
			if(permiso.getFechaVencimiento().equals(fechaVencimiento)){
				permisosPorFechaVencimiento.add(permiso);
			}
		}
		return permisosPorFechaVencimiento;

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

	//Metodo para registrar ciudadanos
	public void registrarCiudadano(Ciudadano ciudadano){
		ciudadanos.add(ciudadano);

	}




	//Metodo para buscar todos los permisos municipales de un ciudadano
	public List<Permiso> buscarTodosLosPermisosMunicipales(Ciudadano ciudadano){
		return null;


	}




	//Metodo para mostrar todos los permisos municipales de un ciudadano
	public void mostrarTodosLosPermisosMunicipales(Ciudadano ciudadano){



	}





	//Obtener informacion completa de un permiso municipal
	public String informacionCompletaPermisoMunicipal(Permiso permiso){
		return permiso.toString() + "\n" + "El coste del permiso es: " + permiso.costoPermiso();

	}




	public void solicitarNuevosPermisos() {
		throw new UnsupportedOperationException();
	}



}