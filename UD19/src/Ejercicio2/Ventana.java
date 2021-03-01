package Ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe el nombre de una película.");
		lblNewLabel.setBounds(12, 65, 243, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(44, 110, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAadir = new JButton("Añadir");
		
		btnAadir.setBounds(44, 178, 117, 25);
		contentPane.add(btnAadir);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(301, 107, 63, 24);
		contentPane.add(comboBox);
		
		JLabel lblPelculas = new JLabel("Películas");
		lblPelculas.setBounds(315, 65, 70, 15);
		contentPane.add(lblPelculas);
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pelicula= textField.getText();
				comboBox.addItem(Pelicula);
			}
		});
	}
}
