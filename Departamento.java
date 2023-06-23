package org.example;

import java.util.ArrayList;

public class Departamento {
	private String nombre;
	public ArrayList<Facultad> facultades = new ArrayList<Facultad>();
	public ArrayList<CarreraUniversitaria> carreras = new ArrayList<CarreraUniversitaria>();
	public ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	public ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	public Departamento(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}