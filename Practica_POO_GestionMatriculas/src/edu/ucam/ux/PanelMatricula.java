package edu.ucam.ux;


import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import edu.ucam.beans.Asignatura;
import edu.ucam.dao.InterfaceAsignatura;
import edu.ucam.dao.InterfaceExpediente;
import edu.ucam.dao.implement.AsignaturaImplement;
import edu.ucam.dao.implement.ExpedienteImplement;
import edu.ucam.ux.actions.ActionLogin;
import edu.ucam.ux.actions.ActionPanelMatricula;

public class PanelMatricula extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JList<String> listAsignaturasDisponibles, listAsignaturasMatriculadas;
	private DefaultListModel<String> listMDisponibles, listMMatriculadas;
	
	private JScrollPane jscrollDisponibles, jscrollMatriculadas;
	private JButton btnAddMatricula;
	private JPanel panelMain, panelDisponibles, panelMatriculadas;
	
	public PanelMatricula() {
		setSize(600, 300);
		
		add(getPanelDisponibles());
		add(getBtnAddMatricula());
		add(getPanelMatriculadas());
		System.out.println("El usuario logeado es: " + ActionLogin.getAlumnoIdentify().getDni());
	}
	
	public JPanel getPanelMain() {
		if (panelMain == null) {
			panelMain = new JPanel();
			
			panelMain.add(getPanelDisponibles());
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
			listAsignaturasMatriculadas = new JList<>(getListMMatriculadas());
			listAsignaturasDisponibles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listAsignaturasDisponibles.setVisibleRowCount(8);
		}
		return listAsignaturasMatriculadas;
	}

	public JButton getBtnAddMatricula() {
		if (btnAddMatricula == null) {
			btnAddMatricula = new JButton(">>");
			
			btnAddMatricula.setActionCommand("addMatricula");
			
			btnAddMatricula.addActionListener(new ActionPanelMatricula(this));
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
			InterfaceExpediente expediente = new ExpedienteImplement();
			List<Asignatura> list = expediente.getAsignaturasMatriculadas(ActionLogin.getAlumnoIdentify());
			for (Asignatura a : list) {
				listMMatriculadas.addElement(a.getName());
			}
		}
		return listMMatriculadas;
	}

	public JPanel getPanelDisponibles() {
		if (panelDisponibles == null) {
			panelDisponibles = new JPanel();
			panelDisponibles.setLayout(new BoxLayout(panelDisponibles, BoxLayout.Y_AXIS));
			
			panelDisponibles.add(new JLabel("Asignaturas Disponibles"));
			panelDisponibles.add(getJscrollDisponibles());
		}
		
		return panelDisponibles;
	}

	public JPanel getPanelMatriculadas() {
		if (panelMatriculadas == null) {
			panelMatriculadas = new JPanel();
			panelMatriculadas.setLayout(new BoxLayout(panelMatriculadas, BoxLayout.Y_AXIS));
			
			panelMatriculadas.add(new JLabel("Matriculadas"));
			panelMatriculadas.add(getJscrollMatriculadas());
		}
		
		return panelMatriculadas;
	}
	
	
	
}
