package mx.unam.fes.acatlan.mac.poo.backend;

import java.util.Date;

public class Alumno extends Persona{
	private String foto;
	private String promedio;
	private String cuenta;
	private Profesor profesor;
	private Curso curso;
	
	public Alumno(Date fechaNac, Genero genero, String nombre, String paterno, String materno,
			String foto, String promedio, String cuenta) {
		super(fechaNac, genero, nombre, paterno, materno);
		this.foto = foto;
		this.promedio = promedio;
		this.cuenta = cuenta;
	}
	
	public void registrarCurso(Curso curso) {
		this.curso = curso;
	}
	public void eliminarCurso() {
		curso = null;
	}
	public void agregarTutor(Profesor prof) {
		profesor = prof;
	}
	public void eliminarTutor() {
		profesor = null;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getPromedio() {
		return promedio;
	}
	public void setPromedio(String promedio) {
		this.promedio = promedio;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
