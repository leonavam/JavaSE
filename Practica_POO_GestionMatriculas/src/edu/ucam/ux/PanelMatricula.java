package edu.ucam.ux;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import edu.ucam.beans.Asignatura;
import edu.ucam.dao.InterfaceAsignatura;
import edu.ucam.dao.implement.AsignaturaImplement;
import edu.ucam.ux.actions.ActionLogin;

public class PanelMatricula extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JList<String> listAsignaturasDisponibles, listAsignaturasMatriculadas;
	private DefaultListModel<String> listMDisponibles, listMMatriculadas;
	
	private JScrollPane jscrollDisponibles, jscrollMatriculadas;
	private JButton btnAddMatricula;
	private JPanel panelMain;
	
	public PanelMatricula() {
		setSize(500, 300);
		
		add(getJscrollDisponibles());
		add(getBtnAddMatricula());
		add(getJscrollMatriculadas());
		System.out.println("El usuario logeado es: " + ActionLogin.getAlumnoIdentify().getDni());
	}
	
	public JPanel getPanelMain() {
		if (panelMain == null) {
			panelMain = new JPanel();
			
			panelMain.add(getlistAsignaturasDisponibles());
			panelMain.add(getBtnAddMatricula());
			panelMain.add(getlistAsignaturasMatriculadas());
		}
		return panelMain;
	}
	

	public JList<String> getlistAsignaturasDisponibles() {
		if (listAsignaturasDisponibles == null) {
			listAsignaturasDisponibles = new JList<>(getListMDisponibles());
			listAsignaturasDisponibles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listAsignaturasDisponibles.setVisibleRowCount(5);
		}
		return listAsignaturasDisponibles;
	}

	public JList<String> getlistAsignaturasMatriculadas() {
		if (listAsignaturasMatriculadas == null) {
			listAsignaturasMatriculadas = new JList<>();
			listAsignaturasDisponibles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		return listAsignaturasMatriculadas;
	}

	public JButton getBtnAddMatricula() {
		if (btnAddMatricula == null) {
			btnAddMatricula = new JButton(">>");
			
			btnAddMatricula.setActionCommand("addMatricula");
		}
		return btnAddMatricula;
	}

	public JScrollPane getJscrollDisponibles() {
		if (jscrollDisponibles == null) {
			jscrollDisponibles = new JScrollPane(getlistAsignaturasDisponibles());
		}
		return jscrollDisponibles;
	}

	public JScrollPane getJscrollMatriculadas() {
		if (jscrollMatriculadas == null) {
			jscrollMatriculadas = new JScrollPane(getlistAsignaturasMatriculadas());
		}
		return jscrollMatriculadas;
	}
	
	public DefaultListModel<String> getListMDisponibles(){
		if (listMDisponibles == null) {
			listMDisponibles = new DefaultListModel<>();
			InterfaceAsignatura as = new AsignaturaImplement();
			for (Asignatura a: as.getOnlyAsignaturas()) {
				listMDisponibles.addElement(a.getName());
			}
		}
		return listMDisponibles;
	}

	public DefaultListModel<String> getListMMatriculadas() {
		if (listMMatriculadas == null) {
			listMMatriculadas = new DefaultListModel<>();
			
			
		}
		return listMMatriculadas;
	}
	
	
	
}
