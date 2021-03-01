package Ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		textField = new JTextField();
		textField.setBounds(37, 65, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(198, 65, 114, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(284, 240, 114, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblOperador = new JLabel("Operador1");
		lblOperador.setBounds(51, 38, 83, 15);
		contentPane.add(lblOperador);
		
		JLabel lblOperador_1 = new JLabel("Operador2");
		lblOperador_1.setBounds(219, 38, 83, 15);
		contentPane.add(lblOperador_1);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(303, 213, 73, 15);
		contentPane.add(lblResultado);
		
		JLabel lblOperacin = new JLabel("Operación");
		lblOperacin.setBounds(126, 96, 73, 15);
		contentPane.add(lblOperacin);
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double operador1= Double.parseDouble(textField.getText());
				Double operador2= Double.parseDouble(textField_1.getText());
				String resultado= String.valueOf(operador1+operador2);
				textField_2.setText(resultado);
			}
		});
		btnSuma.setBounds(34, 123, 117, 25);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double operador1= Double.parseDouble(textField.getText());
				Double operador2= Double.parseDouble(textField_1.getText());
				String resultado= String.valueOf(operador1-operador2);
				textField_2.setText(resultado);
			}
		});
		btnResta.setBounds(163, 123, 117, 25);
		contentPane.add(btnResta);
		
		JButton btnDivisin = new JButton("División");
		btnDivisin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double operador1= Double.parseDouble(textField.getText());
				Double operador2= Double.parseDouble(textField_1.getText());
				String resultado= String.valueOf(operador1/operador2);
				textField_2.setText(resultado);
			}
		});
		btnDivisin.setBounds(37, 175, 117, 25);
		contentPane.add(btnDivisin);
		
		JButton btnMultiplicacin = new JButton("Multiplicación");
		btnMultiplicacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double operador1= Double.parseDouble(textField.getText());
				Double operador2= Double.parseDouble(textField_1.getText());
				String resultado= String.valueOf(operador1*operador2);
				textField_2.setText(resultado);
			}
		});
		btnMultiplicacin.setBounds(163, 175, 139, 25);
		contentPane.add(btnMultiplicacin);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(34, 237, 117, 25);
		contentPane.add(btnSalir);
	}

}
