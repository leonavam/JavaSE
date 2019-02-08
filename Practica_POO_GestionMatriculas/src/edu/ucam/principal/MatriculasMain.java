package edu.ucam.principal;

import javax.swing.SwingUtilities;

import edu.ucam.ux.WindowLogin;

public class MatriculasMain {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new WindowLogin().runMatriculas();

			}
		});
		
	}
	
}
