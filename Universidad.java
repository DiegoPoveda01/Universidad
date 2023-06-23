package org.example;

import java.util.ArrayList;

public class Universidad {
	private String nombre;
	private String direcciones;
	private String tipoUniversidad;
	public ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	public ArrayList<Facultad> facultades = new ArrayList<Facultad>();

	public Universidad(String nombre, String direcciones, String tipoUniversidad){
		this.nombre = nombre;
		this.direcciones = direcciones;
		this.tipoUniversidad = tipoUniversidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirecciones() {
		return this.direcciones;
	}

	public void setDirecciones(String direcciones) {
		this.direcciones = direcciones;
	}

	public String getTipoUniversidad() {
		return this.tipoUniversidad;
	}

	public void setTipoUniversidad(String tipoUniversidad) {
		this.tipoUniversidad = tipoUniversidad;
	}

	public int cantidadProfesores() {
		return trabajadores.size();
	}

	public int cantidadCarreras() {
		return facultades.size();
	}

	public int cantidadProfesoresJornadaParcial() {
		int contador = 0;
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Profesor && ((Profesor) trabajador).getTipoJornada().equals("Parcial")) {
				contador++;
			}
		}
		return contador;
	}

	public int cantidadProfesoresJornadaMedia() {
		int contador = 0;
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Profesor && ((Profesor) trabajador).getTipoJornada().equals("Media")) {
				contador++;
			}
		}
		return contador;
	}

	public int cantidadProfesoresJornadaCompleta() {
		int contador = 0;
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Profesor && ((Profesor) trabajador).getTipoJornada().equals("Completa")) {
				contador++;
			}
		}
		return contador;
	}

	public int cantidadProfesoresFacultad(Facultad facultad) {
		int contador = 0;
		for (Profesor profesor : facultad.getProfesores()) {
			if (profesor.getFacultades().contains(facultad)) {
				contador++;
			}
		}
		return contador;
	}


	public Trabajador buscarProfesor(String rutProfesor) {
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Profesor && ((Profesor) trabajador).getRut().equals(rutProfesor)) {
				return trabajador;
			}
		}
		return null;
	}

	public int cantidadAdministrativos() {
		int contador = 0;
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Administrativo) {
				contador++;
			}
		}
		return contador;
	}
}
