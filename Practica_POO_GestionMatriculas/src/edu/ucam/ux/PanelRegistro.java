package edu.ucam.ux;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import edu.ucam.ux.actions.ActionLogin;

public class PanelRegistro extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField txtDNI;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private ButtonGroup buttonGroup;
	private JRadioButton rbtnAlumno;
	private JRadioButton rbtnAdministrativo;
	private JPanel panelLabels, panelRadioButtons;
	private JButton btnCrearRegistro;
	private JButton btnCancelar;
	private JPanel panelBotones;
	
	
	public PanelRegistro() {
		this.setSize(500, 350);
		this.add(getPanelLabels());
		this.add(getPanelBotones());

	}

	// Crea componentes
	
	public JTextField getTxtDNI() {
		if (txtDNI == null) {
			txtDNI = new JTextField(10);
		}
		return txtDNI;
	}

	public JTextField getTxtNombre() {
		if (txtNombre == null) {
			txtNombre = new JTextField(10);
		}

		return txtNombre;
	}

	public JTextField getTxtApellido() {
		if (txtApellido == null) {
			txtApellido = new JTextField(10);
		}
		return txtApellido;
	}

	public JTextField getTxtDireccion() {
		if (txtDireccion == null) {
			txtDireccion = new JTextField(10);
		}
		return txtDireccion;
	}

	public JTextField getTxtTelefono() {
		if (txtTelefono == null) {
			txtTelefono = new JTextField(10);
		}
		return txtTelefono;
	}

	public ButtonGroup getButtonGroup() {
		if (buttonGroup == null) {
			buttonGroup = new ButtonGroup();

			buttonGroup.add(getRbtnAlumno());
			buttonGroup.add(getRbtnAdministrativo());
		}
		return buttonGroup;
	}

	public JRadioButton getRbtnAlumno() {
		if (rbtnAlumno == null) {
			rbtnAlumno = new JRadioButton("Alumno");
			rbtnAlumno.setActionCommand("ALUMNO");
		}
		return rbtnAlumno;
	}

	public JRadioButton getRbtnAdministrativo() {
		if (rbtnAdministrativo == null) {
			rbtnAdministrativo = new JRadioButton("Administrativo");
			rbtnAdministrativo.setActionCommand("ADMINISTRATIVO");
		}
		return rbtnAdministrativo;
	}

	public JButton getBtnCrearRegistro() {
		if (btnCrearRegistro == null) {
			btnCrearRegistro = new JButton("Crear Registro");
			
			btnCrearRegistro.addActionListener(new ActionLogin(this));
			btnCrearRegistro.setActionCommand("CREAR-REGISTRO");
		}
		
		return btnCrearRegistro;
	}

	public JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("BORRAR");
			
			btnCancelar.addActionListener(new ActionLogin(this));
			btnCancelar.setActionCommand("CLEAN");
		}
		

		return btnCancelar;
	}
	
	// Panel con layouts para mostrar
	
	public JPanel getPanelLabels() {
		if (panelLabels == null) {
			panelLabels = new JPanel(new GridLayout(6, 2, 5, 10));
			panelLabels.add(new JLabel("DNI: "));
			panelLabels.add(getTxtDNI());
			panelLabels.add(new JLabel("Nombre: "));
			panelLabels.add(getTxtNombre());
			panelLabels.add(new JLabel("Apellido: "));
			panelLabels.add(getTxtApellido());
			panelLabels.add(new JLabel("Dirección: "));
			panelLabels.add(getTxtDireccion());
			panelLabels.add(new JLabel("Teléfono: "));
			panelLabels.add(getTxtTelefono());
			panelLabels.add(new JLabel("Tipo de usuario: "));
			panelLabels.add(getPanelRadioButtons());

		}

		return panelLabels;
	}

	public JPanel getPanelRadioButtons() {
		if (panelRadioButtons == null) {
			panelRadioButtons = new JPanel();

			panelRadioButtons.add(getRbtnAlumno());
			panelRadioButtons.add(getRbtnAdministrativo());
			getButtonGroup();
		}
		return panelRadioButtons;
	}

	
	public JPanel getPanelBotones() {
		if (panelBotones == null) {
			panelBotones = new JPanel();
			panelBotones.add(getBtnCrearRegistro());
			panelBotones.add(getBtnCancelar());
		}
		
		return panelBotones;
	}
	
}






