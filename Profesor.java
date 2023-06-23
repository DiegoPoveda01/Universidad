package org.example;

import java.util.ArrayList;

public class Profesor extends Trabajador {
	private String tipoJornada;
	public ArrayList<Facultad> facultades = new ArrayList<Facultad>();

	public Profesor(String titulo, String nombre, String direccion, String estadoCivil, String horario, String rut, String tipoJornada) {
		super(titulo, nombre, direccion, estadoCivil, horario, rut);
		this.tipoJornada = tipoJornada;
	}


	public String getTipoJornada() {
		return this.tipoJornada;
	}

	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}

	public ArrayList<Facultad> getFacultades() {
		return facultades;
	}

	public void setFacultades(ArrayList<Facultad> facultades) {
		this.facultades = facultades;
	}

	public void getTipo() {
		throw new UnsupportedOperationException();
	}
}