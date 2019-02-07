package edu.ucam.ux;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.ucam.enums.CursoEscolar;
import edu.ucam.enums.Semestre;
import edu.ucam.enums.TipoAsignatura;
import edu.ucam.ux.actions.ActionPanelAsignatura;

public class PanelAsignatura extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField txtNombre;
	private JLabel lblTitulo;
	private JComboBox<TipoAsignatura> cboxTipo;
	private JTextField txtCreditos;
	private JComboBox<CursoEscolar> cboxCurso;
	private JComboBox<Semestre> cboxSemestre;
	private JButton btnAdd, btnborrar;
	private JPanel panelData, panelBotones;

	public PanelAsignatura() {
		this.setSize(400, 380);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 25));
		this.add(getLblTitulo());
		this.add(getPanelData());
		this.add(getPanelBotones());
	}
	
	
	// Crea componentes

	public JLabel getLblTitulo() {
		if (lblTitulo == null) {
			lblTitulo = new JLabel("AÑADIR ASIGNATURAS");
			lblTitulo.setFont(new Font("sans-serif", Font.BOLD, 16));
		}
		
		return lblTitulo;
	}
	
	public JTextField getTxtNombre() {
		if (txtNombre == null) {
			txtNombre = new JTextField(10);
		}
		return txtNombre;
	}

	public JComboBox<TipoAsignatura> getCboxTipo() {
		if (cboxTipo == null) {
			cboxTipo = new JComboBox<>(TipoAsignatura.values());
			cboxTipo.setSelectedItem(null);
		}
		return cboxTipo;
	}

	public JTextField getTxtCreditos() {
		if (txtCreditos == null) {
			txtCreditos = new JTextField(10);
		}
		return txtCreditos;
	}

	public JComboBox<CursoEscolar> getCboxCurso() {
		if (cboxCurso == null) {
			cboxCurso = new JComboBox<>(CursoEscolar.values());
			cboxCurso.setSelectedItem(null);
		}
		return cboxCurso;
	}

	public JComboBox<Semestre> getCboxSemestre() {
		if (cboxSemestre == null) {
			cboxSemestre = new JComboBox<>(Semestre.values());
			cboxSemestre.setSelectedItem(null);
		}
		return cboxSemestre;
	}

	public JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Añadir Asignatura");
			btnAdd.setActionCommand("ADD-ASIGNATURA");
			
			btnAdd.addActionListener(new ActionPanelAsignatura(this));
		}
		return btnAdd;
	}


	public JButton getBtnborrar() {
		if (btnborrar == null ) {
			btnborrar = new JButton("Borrar");
			btnborrar.setActionCommand("BORRAR");
			
			btnborrar.addActionListener(new ActionPanelAsignatura(this));
		}
		return btnborrar;
	}

	// Componiendo paneles
	
	public JPanel getPanelData() {
		if (panelData == null) {
			panelData = new JPanel(new GridLayout(5, 2, 5, 15));
			
			panelData.add(new Label("Nombre Asignatura"));
			panelData.add(getTxtNombre());
			
			panelData.add(new Label("Tipo"));
			panelData.add(getCboxTipo());
			
			panelData.add(new Label("Nº Créditos"));
			panelData.add(getTxtCreditos());
			
			panelData.add(new Label("Curso"));
			panelData.add(getCboxCurso());
			
			panelData.add(new Label("Semestre"));
			panelData.add(getCboxSemestre());
		}
		return panelData;
	}
	
	
	public JPanel getPanelBotones() {
		if (panelBotones == null) {
			panelBotones = new JPanel();
			
			panelBotones.add(getBtnAdd());
			panelBotones.add(getBtnborrar());
		}
		
		return panelBotones;
	}
	
}
