package edu.ucam.ux.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.ucam.dao.InterfaceAsignatura;
import edu.ucam.dao.implement.AsignaturaImplement;
import edu.ucam.enums.CursoEscolar;
import edu.ucam.enums.Semestre;
import edu.ucam.enums.TipoAsignatura;
import edu.ucam.ux.PanelAsignatura;

public class ActionPanelAsignatura implements ActionListener {
	
	private PanelAsignatura panel;
	private InterfaceAsignatura asignatura;
	
	public ActionPanelAsignatura(PanelAsignatura panelAsignatura) {
		this.panel = panelAsignatura;
		this.asignatura = new AsignaturaImplement();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if (command.equals("BORRAR")) {
			panel.getTxtNombre().setText("");
			panel.getTxtCreditos().setText("");
			panel.getCboxCurso().setSelectedItem(null);
			panel.getCboxSemestre().setSelectedItem(null);
			panel.getCboxTipo().setSelectedItem(null);
		}
		
		if (command.equals("ADD-ASIGNATURA")) {
			
			String name = panel.getTxtNombre().getText();
			TipoAsignatura tipoAsignatura = (TipoAsignatura) panel.getCboxTipo().getSelectedItem();
			double creditos = Double.parseDouble(panel.getTxtCreditos().getText());
			CursoEscolar cursoEscolar = (CursoEscolar) panel.getCboxCurso().getSelectedItem();
			Semestre semestre = (Semestre) panel.getCboxSemestre().getSelectedItem();
			
			asignatura.createAsignatura(name, tipoAsignatura, creditos, cursoEscolar, semestre);
			
			
			asignatura.getAllAsignaturas();
		}
		
		if (command.equals("CERRAR-ACTAS")) {
			// TODO
		}
		
		if (command.equals("MOSTRAR-ASIGNATURAS")) {
			// TODO
		}
	}

}
