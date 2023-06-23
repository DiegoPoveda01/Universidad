package org.example;

import java.util.ArrayList;

public class CarreraUniversitaria {
	private String nombre;
	public ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	public CarreraUniversitaria(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}