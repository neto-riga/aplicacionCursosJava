package mx.unam.fes.acatlan.mac.poo.frontend;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import mx.unam.fes.acatlan.mac.poo.backend.Curso;
import mx.unam.fes.acatlan.mac.poo.backend.Profesor;

public class PanelRegistro extends JPanel implements ActionListener{
	private JLabel lbCurso;
	private JComboBox<Curso> cbCurso;
	
	private JLabel lbTutor;
	private JComboBox<Profesor> cbTutor;
	
	private JButton btnRegistrarCurso;
	private static final String REGISTRAR_CURSO = "REGISTRAR_CURSO";
	
	private JButton btnEliminarCurso;
	private static final String ELIMINAR_CURSO = "ELIMINAR_CURSO";
	
	private JButton btnRegistrarTutor;
	private static final String REGISTRAR_TUTOR = "REGISTRAR_TUTOR";
	
	private JButton btnEliminarTutor;
	private static final String ELIMINAR_TUTOR = "ELIMINAR_TUTOR";
	
	private InterfazAplicacionCurso ventanaPrincipal;
	
	public PanelRegistro(InterfazAplicacionCurso ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		
		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("Registro a Cursos");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		lbCurso = new JLabel("Curso: ");
		lbTutor = new JLabel("Tutor: ");
		
		cbCurso = new JComboBox();
		cbCurso.setModel(new DefaultComboBoxModel(ventanaPrincipal.getCursos().toArray()));
//		cbCurso.addItem("Derecho");
//		cbCurso.addItem("Física");
//		cbCurso.addItem("Química");
//		cbCurso.addItem("Progra");
		
		
		cbTutor = new JComboBox();
		cbTutor.setModel(new DefaultComboBoxModel(ventanaPrincipal.getProfesores().toArray()));
//		cbTutor.addItem("Lic. Mariana");
//		cbTutor.addItem("Ernesto");
//		cbTutor.addItem("Tutor 3");
		
		btnRegistrarCurso = new JButton("Registrar Curso");
		btnRegistrarCurso.setActionCommand(REGISTRAR_CURSO);
		btnRegistrarCurso.addActionListener(this);
		
		btnEliminarCurso = new JButton("Eliminar Curso");
		btnEliminarCurso.setActionCommand(ELIMINAR_CURSO);
		btnEliminarCurso.addActionListener(this);
		
		btnRegistrarTutor = new JButton("Registrar Tutor");
		btnRegistrarTutor.setActionCommand(REGISTRAR_TUTOR);
		btnRegistrarTutor.addActionListener(this);
		
		btnEliminarTutor = new JButton("Eliminar Tutor");
		btnEliminarTutor.setActionCommand(ELIMINAR_TUTOR);
		btnEliminarTutor.addActionListener(this);
		
		lbCurso.setBounds(5, 50, 50, 20);
		cbCurso.setBounds(60, 50, 200, 20);
		lbTutor.setBounds(5, 100, 500, 20);
		cbTutor.setBounds(60, 100, 200, 20);
		
		btnRegistrarCurso.setBounds(10, 150, 140, 20);
		btnEliminarCurso.setBounds(160, 150, 140, 20);
		btnRegistrarTutor.setBounds(310, 150, 140, 20);
		btnEliminarTutor.setBounds(460, 150, 140, 20);
		
		add(lbCurso);
		add(cbCurso);
		add(lbTutor);
		add(cbTutor);
		add(btnRegistrarCurso);
		add(btnEliminarCurso);
		add(btnRegistrarTutor);
		add(btnEliminarTutor);
		// add();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String nombreEvento=e.getActionCommand();
		
		if (nombreEvento.equals(REGISTRAR_CURSO)){
			Curso c = (Curso) cbCurso.getSelectedItem();
			ventanaPrincipal.agregarCurso(c);
			
		}else if(nombreEvento.equals(ELIMINAR_CURSO)) {
			ventanaPrincipal.eliminarCurso();
			
		}else if(nombreEvento.equals(REGISTRAR_TUTOR)) {
			Profesor p = (Profesor) cbTutor.getSelectedItem();
			ventanaPrincipal.agregarTutor(p);
			
		}else if(nombreEvento.equals(ELIMINAR_TUTOR)) {
			ventanaPrincipal.eliminarTutor();
		}
		
	}
	
}