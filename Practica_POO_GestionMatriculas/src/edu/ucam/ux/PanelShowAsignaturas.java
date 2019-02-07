package edu.ucam.ux;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelShowAsignaturas extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JScrollPane scrollPane;
	private JTable table;
	
	public PanelShowAsignaturas() {
		// TODO Auto-generated constructor stub
	}

	public JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
	
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane(getTable());
		}
		
		return scrollPane;
	}

}
