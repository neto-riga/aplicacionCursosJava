package mx.unam.fes.acatlan.mac.poo.backend;

import java.util.ArrayList; 
import java.util.Date; 

public class AplicacionCurso {
	private ArrayList<Curso> cursos;
	private ArrayList<Alumno> alumnos;
	private ArrayList<Profesor> profesores;
	private Integer posicionAlumnoActual;
	
	public AplicacionCurso() {
		cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso(101, 100, "Programacion 1"));
		cursos.add(new Curso(102, 90, "Diseño 1"));
		cursos.add(new Curso(103, 110, "Derecho 1"));
		cursos.add(new Curso(104, 100, "Diseño Base de Datos"));
		
		profesores = new ArrayList<Profesor>();
		
		profesores.add(new Profesor(new Date(), Genero.MACULINO, "Ernesto", "Rivera", "Galvez", (Integer) 1104, "1001"));
		profesores.add(new Profesor(new Date(), Genero.MACULINO, "Raúl", "Sexy", "Venegas", (Integer) 1105, "1002"));
		profesores.add(new Profesor(new Date(), Genero.MACULINO, "Yago", "de Rivera", "Huerta", (Integer) 1106, "1003"));
		profesores.add(new Profesor(new Date(), Genero.FEMENINO, "Mariana", "Cervantes", "Chimichanga", (Integer) 1107, "1004"));
		profesores.add(new Profesor(new Date(), Genero.FEMENINO, "Mondany", "Rivers", "Torres", (Integer) 1108, "1005"));

		alumnos = new ArrayList<Alumno>();
		
		alumnos.add(new Alumno(new Date(), Genero.FEMENINO, "Karla", "Romero", "Cruz", "mujer.png", "9.4", "110422"));
		alumnos.add(new Alumno(new Date(), Genero.MACULINO, "Ignacio", "Luna", "Rojas", "hombre.png", "7.4", "101010"));
		alumnos.add(new Alumno(new Date(), Genero.MACULINO, "Alfredo", "Jimenez", "Terrazas", "hombre.png", "8.5", "101011"));
		alumnos.add(new Alumno(new Date(), Genero.FEMENINO, "Verónica", "Rosas", "Ternera", "mujer.png", "8.2", "101012"));
		alumnos.add(new Alumno(new Date(), Genero.FEMENINO, "Lizbeth", "Perez", "Canaria", "mujer.png", "8.8", "101013"));
		alumnos.add(new Alumno(new Date(), Genero.MACULINO, "Rogelio", "Fernandez", "Nieto", "hombre.png", "9.6", "101014"));

		posicionAlumnoActual = 0;
	}
	
	public Alumno getAlumnoActual() {
		return alumnos.get(posicionAlumnoActual);
	}
	public Alumno getAlumnoAnterior() {
		if (posicionAlumnoActual == 0) {
			posicionAlumnoActual = alumnos.size() - 1;
			return alumnos.get(posicionAlumnoActual);
		}
		
		posicionAlumnoActual--;
		return alumnos.get(posicionAlumnoActual);
	}
	public Alumno getAlumnoSiguiente() {
		if (posicionAlumnoActual == alumnos.size() - 1) {
			posicionAlumnoActual = 0;
			return alumnos.get(posicionAlumnoActual);
		}
		posicionAlumnoActual++;
		return alumnos.get(posicionAlumnoActual);
	}
	
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}
	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}
	public Integer getPosicionAlumnoActual() {
		return posicionAlumnoActual;
	}
	public void setPosicionAlumnoActual(Integer posicionAlumnoActual) {
		this.posicionAlumnoActual = posicionAlumnoActual;
	}
}
