package edu.ucam.ux.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import edu.ucam.beans.Asignatura;
import edu.ucam.dao.InterfaceExpediente;
import edu.ucam.dao.implement.ExpedienteImplement;
import edu.ucam.tablas.Tablas;
import edu.ucam.ux.PanelMatricula;

public class ActionPanelMatricula implements ActionListener {

	private PanelMatricula panel;
	private InterfaceExpediente expediente;
	
	public ActionPanelMatricula(PanelMatricula panelMatricula) {
		this.panel = panelMatricula;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if (command.equals("addMatricula")) {
			
			String selected = panel.getlistAsignaturasDisponibles().getSelectedValue();
			int index = panel.getlistAsignaturasDisponibles().getSelectedIndex();
			if (selected == null) {
				JOptionPane.showMessageDialog(null, "No ha selecionado ninguna asignatura!", command , JOptionPane.ERROR_MESSAGE);
			} else {				
				Asignatura asignatura = Tablas.getAsignaturas().get(selected);
				
				panel.getListMDisponibles().removeElementAt(index);
				
				expediente = new ExpedienteImplement();
				expediente.matricularAsignatura(ActionLogin.getAlumnoIdentify(), asignatura.getName());
				System.out.println("Se ha matriculado en: " + asignatura.getName());
				
				List<Asignatura> list = expediente.getAsignaturasMatriculadas(ActionLogin.getAlumnoIdentify());
				
				panel.getListMMatriculadas().clear();
				for (Asignatura a : list) {
					panel.getListMMatriculadas().addElement(a.getName());
				}
			}
			
		}

	}

}
