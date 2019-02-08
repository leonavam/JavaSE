package edu.ucam.ux;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import edu.ucam.beans.Alumno;
import edu.ucam.beans.Asignatura;
import edu.ucam.dao.InterfaceAsignatura;
import edu.ucam.dao.InterfaceExpediente;
import edu.ucam.dao.implement.AsignaturaImplement;
import edu.ucam.dao.implement.ExpedienteImplement;
import edu.ucam.tablas.Tablas;

public class PanelInformes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnObtenerExpediente;

	private PanelInsertNotas notas = new PanelInsertNotas();

	public PanelInformes() {
		setSize(500, 300);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		add(notas.getListAlumnos());
		add(getBtnObtenerExpediente());
	}

	public JButton getBtnObtenerExpediente() {
		if (btnObtenerExpediente == null) {
			btnObtenerExpediente = new JButton("Crear Informe Final");

			InterfaceAsignatura asignatura = new AsignaturaImplement();
			InterfaceExpediente expediente = new ExpedienteImplement();

			btnObtenerExpediente.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String command = notas.getListAlumnos().getSelectedValue();
					if (command != null) {
						
					String str[] = command.split(" ");
					System.out.println(command);
						if (asignatura.getCreditos() == expediente.closeExpediente(str[0])) {
							generateInformetTxt(str[0]);
						} else {
							JOptionPane.showMessageDialog(null,
									"El alumno aun no cumple con los requisitos para crear su informe final", command,
									JOptionPane.ERROR_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null, "No ha selecionado ningun alumno!", command,
								JOptionPane.ERROR_MESSAGE);
					}

				}
			});
		}

		return btnObtenerExpediente;
	}

	public static void generateInformetTxt(String dni) {

		InterfaceExpediente expediente = new ExpedienteImplement();
		
		FileWriter fileWriter;
		File file = new File("Informes/" + dni + ".txt");
		Alumno alumno = Tablas.getAlumnos().get(dni);
		
		String str = "\t\tINFORME FINAL\n" + "DNI: " + alumno.getDni() + "\nNombre: " + alumno.getNombre() + " "
				+ alumno.getApellido() + "\nDirección: " + alumno.getDireccion() + "\nTeléfono: "
				+ alumno.getTelefono();
		String str2 = "\n\n*****************************************\n\nAsignaturas";

		try {
			fileWriter = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fileWriter);

			bw.write(str);
			bw.write(str2);
			str = "Nombre\tNota\tConvocatoria";
			bw.write(str);
			
			for (Asignatura a: expediente.getAsignaturasMatriculadas(alumno)) {
				String asig = a.getName() + "\t\t\t" + a.getNota() + "\t\t" + a.getConvocatoria()+"\n";
				bw.write(asig);
			}
			
			bw.write("\n\nNota final:" + expediente.getNotaFinal(alumno));
			bw.close();
			fileWriter.close();
			
			JOptionPane.showMessageDialog(null, "El informe se ha guardado en la carpeta Informes", "Informe",
					JOptionPane.INFORMATION_MESSAGE);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
