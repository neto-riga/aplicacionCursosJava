package mx.unam.fes.acatlan.mac.poo.frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import java.text.SimpleDateFormat;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import mx.unam.fes.acatlan.mac.poo.backend.Alumno;

public class PanelDatos extends JPanel{
	// Etiquetas y zonas de texto
	private JLabel lbNombre;
	private JTextField txtNombre;
	
	private JLabel lbPaterno;
	private JTextField txtPaterno;
	
	private JLabel lbMaterno;
	private JTextField txtMaterno;
	
	private JLabel lbGenero;
	private JTextField txtGenero;
	
	private JLabel lbFechaNac;
	private JTextField txtFechaNac;
	
	private JLabel lbImagen;
	
//	public String cargarPropiedad(String propiedad) {
//    	Properties propiedades = new Properties();
//    	InputStream is;
//    	String valor="";
//    	
//		try {
//			is=ClassLoader.getSystemResourceAsStream("mx/unam/fes/acatlan/mac/poo/backend/configuracion/configuracion.properties");
//			propiedades.load(is);
//			is.close();
//			is = null;
//			
//			valor=propiedades.getProperty(propiedad);
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return 	valor;    	
//    }

	
	
	
	public PanelDatos() {
		setLayout( new BorderLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Datos Alumno");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		JPanel panelDatosAlumno = new JPanel();
		JPanel panelFotoAlumno = new JPanel();
		
		add(panelDatosAlumno, BorderLayout.CENTER);
		add(panelFotoAlumno, BorderLayout.EAST);
		
		lbNombre = new JLabel("Nombre: ");
		lbPaterno = new JLabel("Apellido Paterno: ");
		lbMaterno = new JLabel("Apellido Materno: ");
		lbGenero = new JLabel("Genero: ");
		lbFechaNac = new JLabel("Fecha de Nacimiento: ");
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setBackground(Color.LIGHT_GRAY);
		txtNombre.setForeground(Color.BLUE);

		txtPaterno = new JTextField();
		txtPaterno.setEditable(false);
		txtPaterno.setBackground(Color.LIGHT_GRAY);
		txtPaterno.setForeground(Color.BLUE);

		txtMaterno = new JTextField();
		txtMaterno.setEditable(false);
		txtMaterno.setBackground(Color.LIGHT_GRAY);
		txtMaterno.setForeground(Color.BLUE);
		
		txtGenero = new JTextField();
		txtGenero.setEditable(false);
		txtGenero.setBackground(Color.LIGHT_GRAY);
		txtGenero.setForeground(Color.BLUE);

		txtFechaNac = new JTextField();
		txtFechaNac.setEditable(false);
		txtFechaNac.setBackground(Color.LIGHT_GRAY);
		txtFechaNac.setForeground(Color.BLUE);

		panelDatosAlumno.setLayout(new GridLayout(7, 2)); // Distribuidor Gráfico
		
		panelDatosAlumno.add(lbNombre);
		panelDatosAlumno.add(txtNombre);
		panelDatosAlumno.add(lbPaterno);
		panelDatosAlumno.add(txtPaterno);
		panelDatosAlumno.add(lbMaterno);
		panelDatosAlumno.add(txtMaterno);
		panelDatosAlumno.add(lbGenero);
		panelDatosAlumno.add(txtGenero);
		panelDatosAlumno.add(lbFechaNac);
		panelDatosAlumno.add(txtFechaNac);
		
		lbImagen = new JLabel("FOTO ALUMNO");
		panelFotoAlumno.add(lbImagen);
	}
	
	public void actualizarPanel(Alumno a) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		txtNombre.setText(a.getNombre());
		txtPaterno.setText(a.getPaterno());
		txtMaterno.setText(a.getMaterno());
		txtGenero.setText(a.getGenero().toString());
		txtFechaNac.setText(sdf.format(a.getFechaNac()));
		
//		ImageIcon imagenOriginal = new ImageIcon(cargarPropiedad("rutaFotos")+a.getFoto());//para imagenes dinamicas que el usuario cargue fuera del jar
		ImageIcon imagenOriginal = new ImageIcon("fotos/"+a.getFoto());
		Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(90,
				100, Image.SCALE_SMOOTH);
		
		lbImagen.setText("");
		lbImagen.setIcon(new ImageIcon(imagenAjustada));
		
		
	}
}
