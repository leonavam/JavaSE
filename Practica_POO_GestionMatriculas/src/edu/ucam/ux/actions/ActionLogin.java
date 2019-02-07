package edu.ucam.ux.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.ucam.beans.Administrativo;
import edu.ucam.beans.Alumno;
import edu.ucam.beans.User;
import edu.ucam.dao.InterfaceAdministrativo;
import edu.ucam.dao.InterfaceAlumno;
import edu.ucam.dao.implement.AdministrativoImplement;
import edu.ucam.dao.implement.AlumnoImplement;
import edu.ucam.tablas.Tablas;
import edu.ucam.ux.WindowLogin;
import edu.ucam.ux.PanelAsignatura;
import edu.ucam.ux.PanelMatricula;
import edu.ucam.ux.PanelRegistro;
import edu.ucam.ux.WindowEmpty;

public class ActionLogin implements ActionListener {
	
	private WindowLogin frame;
	private PanelRegistro panel;
	private User user;
	private WindowEmpty window, windowSecond;
	private InterfaceAlumno alumno;
	private InterfaceAdministrativo administrativo;

	
	public ActionLogin(WindowLogin frame) {
		this.frame = frame;
	}
	
	public ActionLogin(PanelRegistro panel) {
		this.setPanel(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if (command.equals("LOGIN")) {
			String txtDni = frame.getTxtDni().getText().toUpperCase().trim();
			user = Tablas.getUsuarios().get(txtDni);
			
			if ( user instanceof Alumno) {
				window = new WindowEmpty(new PanelMatricula());
				window.makeWindow();
			}else if (user instanceof Administrativo) {
				window = new WindowEmpty(new PanelAsignatura());
				window.makeWindow();
			}else {
				JOptionPane.showMessageDialog(null, "DNI incorrecto!", command , JOptionPane.ERROR_MESSAGE);

			}
			
		}
		
		if (command.equals("REGISTRO")) {
			setWindow(getPanel());
			getWindow().makeWindow();
		}
		
		if (command.equals("CLEAN")) {
			limpiar(panel.getTxtDNI());
			limpiar(panel.getTxtNombre());
			limpiar(panel.getTxtApellido());
			limpiar(panel.getTxtDireccion());
			limpiar(panel.getTxtTelefono());
			panel.getButtonGroup().clearSelection();
		}
		
		if (command.equals("CREAR-REGISTRO")) {
			String tipo = getPanel().getButtonGroup().getSelection().getActionCommand();
			String dni = getPanel().getTxtDNI().getText().toUpperCase();
			String nombre = getPanel().getTxtNombre().getText();
			String apellido = getPanel().getTxtApellido().getText();
			String direccion = getPanel().getTxtDireccion().getText();
			int telefono = Integer.parseInt(getPanel().getTxtTelefono().getText());
			
			if (tipo.equals("ALUMNO")) {
				alumno = new AlumnoImplement();
				alumno.createAlumno(dni, nombre, apellido, direccion, telefono);
			}else {
				String pass = JOptionPane.showInputDialog(null, "Inserte una contraseña: ", "Password" , JOptionPane.INFORMATION_MESSAGE);
				administrativo = new AdministrativoImplement();
				administrativo.createAdministrativo(dni, nombre, apellido, direccion, telefono, pass);
			}
		}
		
	}
	
	private void limpiar(JTextField txt) {
		txt.setText("");
	}
	
	private WindowEmpty getWindow() {
		return window;
	}

	private WindowEmpty setWindow(JPanel panel) {
		window = new WindowEmpty(panel);
		return window;
	}
	private PanelRegistro getPanel() {
		if (panel == null) {
			panel = new PanelRegistro();
		}
		return panel;
	}

	private void setPanel(PanelRegistro panel) {
		this.panel = panel;
	}
	
	

}
