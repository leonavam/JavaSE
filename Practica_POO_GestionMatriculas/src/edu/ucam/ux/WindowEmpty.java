package edu.ucam.ux;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowEmpty extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jPanel;

	public WindowEmpty(JPanel jPanel) {
		this.jPanel = jPanel;

		this.setTitle(jPanel.getClass().getSimpleName());
		this.setSize(getjPanel().getSize());
		this.setLocationRelativeTo(null);
		this.getContentPane().add(getjPanel());

	}

	public void makeWindow() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);

	}

	public JPanel getjPanel() {
		return jPanel;
	}

}
