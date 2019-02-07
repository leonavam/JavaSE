package edu.ucam.ux;

import java.util.Map;

import javax.swing.table.AbstractTableModel;

import edu.ucam.beans.Asignatura;
import edu.ucam.tablas.Tablas;

public class ModeloJTablaAsignatura extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String headers[] = { "Asignatura", "Tipo", "Créditos", "Curso", "Semestre" };

	Map<String, Asignatura> asignaturas = Tablas.getAsignaturas();

	public ModeloJTablaAsignatura() {

	}

	@Override
	public int getColumnCount() {
		return headers.length;
	}

	@Override
	public int getRowCount() {
		return asignaturas.size();
	}

	@Override
	public Object getValueAt(int row, int column) {
		String str = "";
		// TODO
		switch (column) {
		case 0:
			break;
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;

		default:
			break;
		}

		return str;
	}

	@Override
	public String getColumnName(int column) {
		return headers[column];
	}

}
