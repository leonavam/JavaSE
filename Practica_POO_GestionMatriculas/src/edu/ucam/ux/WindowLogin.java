package edu.ucam.ux;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.ucam.ux.actions.ActionLogin;

public class WindowLogin extends JFrame{
	
	private JTextField txtDni;
	private JButton btnLogin, btnRegistro;
	private JPanel panelBotones, panelDNI;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WindowLogin() {
		this.setTitle("Gestión de Matriculas");
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		
		this.setContentPane(new JPanel(new BorderLayout()));
		this.getContentPane().add(getPanelDni(), BorderLayout.NORTH);
		this.getContentPane().add(getPanelBotones(), BorderLayout.SOUTH);
		
	}
	
	public void runMatriculas() {
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}
	
	public JPanel getPanelDni() {
		if (panelDNI == null) {
			panelDNI = new JPanel();
			
			panelDNI.add(new JLabel("Inserta DNI: "));
			panelDNI.add(getTxtDni());
		}
		return panelDNI;
	}
	
	
	public JPanel getPanelBotones() {
		if (panelBotones == null) {
			panelBotones = new JPanel();	//Utiliza flowLayout x defecto
			
			// Add components
			panelBotones.add(getBtnLogin());
			panelBotones.add(getBtnRegistro());
		}
		return panelBotones;
	}

	public JTextField getTxtDni() {
		if (txtDni == null) {
			txtDni = new JTextField(10);
			
			txtDni.addActionListener(new ActionLogin(this));
			txtDni.setActionCommand("LOGIN");
		}
		
		return txtDni;
	}

	public JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("LOGIN");
			btnLogin.setBackground(Color.GREEN);
			btnLogin.setActionCommand("LOGIN");
			
			btnLogin.addActionListener(new ActionLogin(this));
		}
		return btnLogin;
	}

	public JButton getBtnRegistro() {
		if (btnRegistro == null) {
			btnRegistro = new JButton("REGISTRO");
			btnRegistro.setActionCommand("REGISTRO");
			
			btnRegistro.addActionListener(new ActionLogin(this));
		}
		
		return btnRegistro;
	}
	
}
