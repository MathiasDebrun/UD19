package Ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saludador extends JFrame {

	private JPanel contentPane;
	private JTextField txtEscribeUnNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saludador frame = new Saludador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Saludador() {
		setTitle("Saludador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEscribeUnNombre = new JTextField();
		txtEscribeUnNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscribeUnNombre.setBounds(5, 138, 440, 19);
		
		contentPane.add(txtEscribeUnNombre);
		txtEscribeUnNombre.setColumns(10);
		
		JButton btnsaludar = new JButton("¡Saludar!");
		btnsaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String nombre=txtEscribeUnNombre.getText();						// Tomamos el contenido del TextField y lo devolvemos con el saludo.
			JOptionPane.showMessageDialog(contentPane, "Buenas, "+nombre);
			
			}
		});
		btnsaludar.setBounds(5, 241, 440, 25);
		contentPane.add(btnsaludar);
		
		JLabel label = new JLabel("Escribe un nombre para saludar");
		label.setBounds(96, 83, 246, 15);
		contentPane.add(label);
	}
}
