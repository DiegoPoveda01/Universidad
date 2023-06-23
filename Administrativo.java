package org.example;

import java.util.ArrayList;

public class Administrativo extends Profesor {
	private String horarioAtencion;
	public ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public Administrativo(String titulo, String nombre, String direccion, String estadoCivil, String horario, String rut, String tipoJornada, String horarioAtencion) {
		super(titulo, nombre, direccion, estadoCivil, horario, rut, tipoJornada);
		this.horarioAtencion = horarioAtencion;
	}


	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public void getTipo() {
		throw new UnsupportedOperationException();
	}
}