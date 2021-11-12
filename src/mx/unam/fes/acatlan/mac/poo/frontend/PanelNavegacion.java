package mx.unam.fes.acatlan.mac.poo.frontend;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class PanelNavegacion extends JPanel implements ActionListener{
	private JButton btnSiguiente;
	private static final String SIGUIENTE = "SIGUIENTE";
	
	private JButton btnAnterior;
	private static final String ANTERIOR = "ANTERIOR";
	
	private InterfazAplicacionCurso ventanaPrincipal;
	
	public PanelNavegacion(InterfazAplicacionCurso ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		
		setLayout( new FlowLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Navegación");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.setActionCommand(SIGUIENTE);
		btnSiguiente.addActionListener(this);
		
		btnAnterior = new JButton("<");
		btnAnterior.setActionCommand(ANTERIOR);
		btnAnterior.addActionListener(this);
		
		add(btnAnterior);
		add(btnSiguiente);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombreEvento = e.getActionCommand();
		
		if(nombreEvento.equals(SIGUIENTE)) {
			ventanaPrincipal.siguiente();
			
		}else if(nombreEvento.equals(ANTERIOR)) {
			ventanaPrincipal.anterior();
			
		}
		
	}
	
}