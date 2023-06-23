package org.example;

import java.util.ArrayList;

public class Facultad {
	private String nombre;
	private String localidad;
	public ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	public ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	public Facultad(String nombre, String localidad){
		this.nombre = nombre;
		this.localidad = localidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}
}