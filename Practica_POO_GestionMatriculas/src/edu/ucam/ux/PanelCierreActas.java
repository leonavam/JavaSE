package edu.ucam.ux;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Enumeration;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import edu.ucam.beans.Asignatura;
import edu.ucam.beans.User;
import edu.ucam.tablas.Tablas;

public class PanelCierreActas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton btnCierreActas;
	private JButton btnObtenerExpediente;
	private JButton btnGuardarInformacion;

	public PanelCierreActas() {
		
		setLayout(new GridLayout(4, 1, 10, 15));
		
		add(getBtnCierreActas());
		add(getBtnObtenerExpediente());
		add(getBtnGuardarInformacion());
	}

	public JButton getBtnCierreActas() {
		if (btnCierreActas == null) {
			btnCierreActas = new JButton("Cerrar Actas");
			
			btnCierreActas.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					WindowEmpty empty = new WindowEmpty(new PanelInsertNotas());
					empty.makeWindow();
				}
			});
		}
		return btnCierreActas;
	}
	
	public JButton getBtnObtenerExpediente() {
		if (btnObtenerExpediente == null) {
			btnObtenerExpediente =new JButton("Expediente Alumno");
			
			btnObtenerExpediente.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					WindowEmpty empty = new WindowEmpty(new PanelInformes());
					empty.makeWindow();
					
				}
			});
		}
		return btnObtenerExpediente;
	}
	
	public JButton getBtnGuardarInformacion() {
		if (btnGuardarInformacion == null) {
			btnGuardarInformacion = new JButton("Guarda Información");
			
			btnGuardarInformacion.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					
					FileWriter fileWriter;
					File file = new File("Informacion/informacion.dat");
					
					try {
						fileWriter = new FileWriter(file);
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
						

						Enumeration<Asignatura> e = Tablas.getAsignaturas().elements();
						while (e.hasMoreElements()) {
							Asignatura asignatura = (Asignatura) e.nextElement();
							oos.writeObject(asignatura);
						}
						
						Enumeration<User> enu = Tablas.getUsuarios().elements();
						while (enu.hasMoreElements()) {
							User user = (User) enu.nextElement();
							oos.writeObject(user);
						}
						
						oos.close();
						fileWriter.close();
						
						JOptionPane.showMessageDialog(null, "La informacion se ha guardado en la carpeta Informacion", "Informe",
								JOptionPane.INFORMATION_MESSAGE);

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
			});
		}
		return btnGuardarInformacion;
	}
	
}
