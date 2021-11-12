package mx.unam.fes.acatlan.mac.poo.frontend;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mx.unam.fes.acatlan.mac.poo.backend.Alumno;
import mx.unam.fes.acatlan.mac.poo.backend.AplicacionCurso;
import mx.unam.fes.acatlan.mac.poo.backend.Curso;
import mx.unam.fes.acatlan.mac.poo.backend.Profesor;

public class InterfazAplicacionCurso extends JFrame{
	
	private AplicacionCurso aplicacionCurso;
	
	private PanelDatos panelDatos;
	private PanelRegistro panelRegistro;
	private PanelNavegacion panelNavegacion;

	public InterfazAplicacionCurso() {
		setTitle("Aplicación Cursos");
		setSize(700, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout( new BorderLayout());
		
		aplicacionCurso = new AplicacionCurso();
		
		panelDatos = new PanelDatos();
		panelRegistro = new PanelRegistro(this);
		panelNavegacion = new PanelNavegacion(this);
		
		add(panelDatos, BorderLayout.NORTH);
		add(panelRegistro, BorderLayout.CENTER);
		add(panelNavegacion, BorderLayout.SOUTH);
		
		mostrarInformacionAlumno(aplicacionCurso.getAlumnoActual());
	}
	
	public void mostrarInformacionAlumno(Alumno alu) {
		panelDatos.actualizarPanel(alu);
	}
	public void siguiente() {
		Alumno alumno = aplicacionCurso.getAlumnoSiguiente();
		mostrarInformacionAlumno(alumno);
	}
	public void anterior() {
		Alumno alumno = aplicacionCurso.getAlumnoAnterior();
		mostrarInformacionAlumno(alumno);
	}
	public void agregarCurso(Curso curso) {
		JOptionPane.showMessageDialog(this, "Se agregará el curso: " + curso.toString());
		aplicacionCurso.getAlumnoActual().registrarCurso(curso);
	}
	public void agregarTutor(Profesor prof) {
		JOptionPane.showMessageDialog(this, "Se agregará el curso: " + prof.toString());
		aplicacionCurso.getAlumnoActual().agregarTutor(prof);
	}
	public void eliminarCurso() {
		aplicacionCurso.getAlumnoActual().eliminarCurso();
	}
	public void eliminarTutor() {
		aplicacionCurso.getAlumnoActual().eliminarTutor();
	}
	public ArrayList<Curso> getCursos(){
		return aplicacionCurso.getCursos();
	}
	public ArrayList<Profesor> getProfesores(){
		return aplicacionCurso.getProfesores();
	}
	
	public static void main(String[] args) {
		InterfazAplicacionCurso interfaz = new InterfazAplicacionCurso();
		interfaz.setVisible(true);
	}

}
