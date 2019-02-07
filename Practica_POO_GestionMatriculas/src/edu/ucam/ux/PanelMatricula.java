package edu.ucam.ux;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

import edu.ucam.beans.Asignatura;

public class PanelMatricula extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JList<Asignatura> asignaturasDisponibles, asignaturasMatriculadas;
	private JButton btnAddMatricula;
	private JPanel panelMain;
	
	public PanelMatricula() {
		setSize(500, 300);
		add(getAsignaturasDisponibles());
		add(getBtnAddMatricula(), FlowLayout.CENTER);
		add(getAsignaturasMatriculadas());
		
	}
	
	public JPanel getPanelMain() {
		if (panelMain == null) {
			panelMain = new JPanel();
			
			panelMain.add(getAsignaturasDisponibles());
			panelMain.add(getBtnAddMatricula());
			panelMain.add(getAsignaturasMatriculadas());
		}
		return panelMain;
	}
	

	public JList<Asignatura> getAsignaturasDisponibles() {
		if (asignaturasDisponibles == null) {
			asignaturasDisponibles = new JList<>();
		}
		return asignaturasDisponibles;
	}

	public JList<Asignatura> getAsignaturasMatriculadas() {
		if (asignaturasMatriculadas == null) {
			asignaturasMatriculadas = new JList<>();
		}
		return asignaturasMatriculadas;
	}

	public JButton getBtnAddMatricula() {
		if (btnAddMatricula == null) {
			btnAddMatricula = new JButton(">>");
			
			btnAddMatricula.setActionCommand("addMatricula");
		}
		return btnAddMatricula;
	}
	
	
	
}
