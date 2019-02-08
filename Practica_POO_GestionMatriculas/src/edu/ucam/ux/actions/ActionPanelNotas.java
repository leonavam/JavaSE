package edu.ucam.ux.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import edu.ucam.beans.Alumno;
import edu.ucam.beans.Asignatura;
import edu.ucam.dao.InterfaceExpediente;
import edu.ucam.dao.implement.ExpedienteImplement;
import edu.ucam.tablas.Tablas;
import edu.ucam.ux.PanelInsertNotas;

public class ActionPanelNotas implements ActionListener {
	
	private PanelInsertNotas panel;
	private Alumno alumno;

	public ActionPanelNotas(PanelInsertNotas panelInsertNotas) {
		this.panel = panelInsertNotas;
	}
	
	public void createReg() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if (command.equals("SHOW-ASIGNATURA")) {
			String selected = panel.getListAlumnos().getSelectedValue();
			
			if (selected != null) {
				String dni[] = selected.split(" ");				
				alumno = Tablas.getAlumnos().get(dni[0]);
				panel.getListMAsignaturas().clear();
				panel.getListAsignaturas().setEnabled(true);
				
				panel.setDni(alumno);
				
				InterfaceExpediente expediente = new ExpedienteImplement();
				ArrayList<Asignatura> asignaturas = expediente.getAsignaturasMatriculadas(panel.getDni());
				if (asignaturas.isEmpty()) {
					JOptionPane.showMessageDialog(null, "El alumno no se ha matriculado en nada!", command , JOptionPane.INFORMATION_MESSAGE);
				} else {
					int tmp = 0;
					for (Asignatura a: asignaturas) {
						if (a.getNota() == 0 || a.getNota() < 5) {
							panel.getListMAsignaturas().addElement(a.getName());
							tmp = 1;
						}
					}
					if (tmp == 0) {
						JOptionPane.showMessageDialog(null, "Se han calificado todas las asignaturas del alumno", command , JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "No ha selecionado ningun alumno!", command , JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
		if (command.equals("CALIFICAR")) {
			String selected = panel.getListAsignaturas().getSelectedValue();
			int index = panel.getListAsignaturas().getSelectedIndex();
			
			InterfaceExpediente expediente = new ExpedienteImplement();
			ArrayList<Asignatura> asignaturas = expediente.getAsignaturasMatriculadas(panel.getDni());
			
			if (selected != null) {
				for (Asignatura a: asignaturas) {
					if (a.getName().equals(selected)) {
						double nota = Double.parseDouble(JOptionPane.showInputDialog("Inserta la nota obtenida en " + a.getName()));
						a.setNota(nota);
						panel.getListMAsignaturas().removeElementAt(index);
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "No ha selecionado ninguna asignatura para calificar!", command , JOptionPane.ERROR_MESSAGE);
			}
		}

	}
	
}
