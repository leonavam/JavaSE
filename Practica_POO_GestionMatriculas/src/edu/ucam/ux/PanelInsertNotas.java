package edu.ucam.ux;

import java.util.Enumeration;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import edu.ucam.beans.Alumno;
import edu.ucam.tablas.Tablas;
import edu.ucam.ux.actions.ActionPanelNotas;

public class PanelInsertNotas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JList<String> listAlumnos, listAsignaturas;
	private DefaultListModel<String> listMAlumnos, listMAsignaturas;
	private JButton btnShowMatriculadas, btnSetNota;
	private JPanel panelAsignaturas;
	private JScrollPane scrollAsignaturas;
	
	private Alumno dni;
	
	public PanelInsertNotas() {
		setSize(500, 300);
		
		add(getListAlumnos());
		add(getBtnShowMatriculadas());
		add(getPanelAsignaturas());

	}

	public JList<String> getListAlumnos() {
		if (listAlumnos == null) {
			listAlumnos = new JList<>(getListMAlumnos());
			listAlumnos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listAlumnos.setVisibleRowCount(10);
		}
		return listAlumnos;
	}
	
	public DefaultListModel<String> getListMAlumnos() {
		if (listMAlumnos == null) {
			listMAlumnos = new DefaultListModel<>();
			
			Enumeration<Alumno> e = Tablas.getAlumnos().elements();
			while (e.hasMoreElements()) {
				Alumno alumno = (Alumno) e.nextElement();
				listMAlumnos.addElement(alumno.getDni() +" \t" + alumno.getApellido());
			}
		}
		return listMAlumnos;
	}

	public JButton getBtnShowMatriculadas() {
		if (btnShowMatriculadas == null) {
			btnShowMatriculadas = new JButton("Mostrar Asignaturas");
			
			btnShowMatriculadas.setActionCommand("SHOW-ASIGNATURA");
			btnShowMatriculadas.addActionListener(new ActionPanelNotas(this));
		}
		return btnShowMatriculadas;
	}

	public JButton getBtnSetNota() {
		if (btnSetNota == null) {
			btnSetNota = new JButton("Calificar");
			btnSetNota.setActionCommand("CALIFICAR");
			
			btnSetNota.addActionListener(new ActionPanelNotas(this));
		}
		return btnSetNota;
	}
	
	public JPanel getPanelAsignaturas() {
		if (panelAsignaturas == null) {
			panelAsignaturas = new JPanel();
			panelAsignaturas.setLayout(new BoxLayout(panelAsignaturas, BoxLayout.Y_AXIS));
			
			panelAsignaturas.add(getScrollAsignaturas());
			panelAsignaturas.add(getBtnSetNota());
		}
		return panelAsignaturas;
	}
	
	public JList<String> getListAsignaturas() {
		if (listAsignaturas == null) {
			listAsignaturas = new JList<>(getListMAsignaturas());
			listAsignaturas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listAsignaturas.setVisibleRowCount(5);
			listAsignaturas.setEnabled(false);
		}
		return listAsignaturas;
	}
	
	public DefaultListModel<String> getListMAsignaturas() {
		if (listMAsignaturas == null) {
			listMAsignaturas = new DefaultListModel<>();
		}
		return listMAsignaturas;
	}
	
	public JScrollPane getScrollAsignaturas() {
		if (scrollAsignaturas == null) {
			scrollAsignaturas = new JScrollPane(getListAsignaturas());
		}
		return scrollAsignaturas;
	}
	
	public void setDni(Alumno dni) {
		this.dni = dni;
	}
	
	public Alumno getDni() {
		return dni;
	}
	
}
