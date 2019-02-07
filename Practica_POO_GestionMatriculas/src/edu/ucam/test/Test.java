package edu.ucam.test;

import javax.swing.SwingUtilities;

import edu.ucam.ux.WindowLogin;

public class Test {

	public static void main(String[] args) {

		//Invocamos un Swing para ser tratado con un hilo diferente al main
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new WindowLogin().runMatriculas();

			}
		});
		
	}

}
