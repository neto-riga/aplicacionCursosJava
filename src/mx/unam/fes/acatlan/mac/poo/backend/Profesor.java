package mx.unam.fes.acatlan.mac.poo.backend;

import java.util.Date;

public class Profesor extends Persona{
	private Integer noTrabajador;
	private String cedula;
	
	public Profesor(Date fechaNac, Genero genero, String nombre, String paterno, String materno,
			Integer noTrabajador, String cedula) {
		super(fechaNac, genero, nombre, paterno, materno);
		this.noTrabajador = noTrabajador;
		this.cedula = cedula;
	}
	
	public Integer getNoTrabajador() {
		return noTrabajador;
	}
	public void setNoTrabajador(Integer noTrabajador) {
		this.noTrabajador = noTrabajador;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	@Override
	public String toString() {
		return nombre+" "+paterno+" "+materno;
	}
}
