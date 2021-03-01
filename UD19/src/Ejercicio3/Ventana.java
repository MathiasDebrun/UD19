package Ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

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
		
		JLabel lblElijeSo = new JLabel("Elije S.O");
		lblElijeSo.setBounds(51, 29, 70, 15);
		contentPane.add(lblElijeSo);
		
		JRadioButton rlinux = new JRadioButton("Linux");
		rlinux.setBounds(37, 49, 149, 23);
		contentPane.add(rlinux);
		
		JRadioButton rWindows = new JRadioButton("Windows");
		rWindows.setBounds(37, 68, 149, 23);
		contentPane.add(rWindows);
		
		JRadioButton rMac = new JRadioButton("MacOS");
		rMac.setBounds(37, 86, 149, 23);
		contentPane.add(rMac);
		
		ButtonGroup grupo= new ButtonGroup();
		grupo.add(rMac);
		grupo.add(rWindows);
		grupo.add(rlinux);
		
		JLabel lblElijeEspecialidad = new JLabel("Elije especialidad");
		lblElijeEspecialidad.setBounds(51, 117, 129, 15);
		contentPane.add(lblElijeEspecialidad);
		
		JSlider slider = new JSlider();
		slider.setMaximum(10);
		slider.setPaintTicks(true);
		slider.setValue(5);
		slider.setBounds(238, 65, 200, 16);
		contentPane.add(slider);
		
		JLabel lblHorasDedicada = new JLabel("Horas Dedicadas");
		lblHorasDedicada.setBounds(271, 29, 129, 15);
		contentPane.add(lblHorasDedicada);
		
		JLabel label = new JLabel("0                                  10");
		label.setBounds(248, 90, 171, 15);
		contentPane.add(label);
		
		JButton btnVerDatos = new JButton("Ver datos");
		
		btnVerDatos.setBounds(271, 159, 117, 25);
		contentPane.add(btnVerDatos);
		
		JCheckBox rProgramador = new JCheckBox("Programación");
		
		rProgramador.setBounds(39, 160, 129, 23);
		contentPane.add(rProgramador);
		
		JCheckBox rDiseñoGrafico = new JCheckBox("Diseño Gráfico");
		
		rDiseñoGrafico.setBounds(37, 199, 129, 23);
		contentPane.add(rDiseñoGrafico);
		
		JCheckBox rAdministracion = new JCheckBox("Administración");
		
		rAdministracion.setBounds(39, 240, 129, 23);
		contentPane.add(rAdministracion);
		
		btnVerDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ArrayList <String> total= new ArrayList<>();
			if (rlinux.isSelected()) {
				total.add("Sistema Operativo: Linux");
			}else if (rWindows.isSelected()) {
				total.add("Sistema Operativo: Windows");
			}else { 
				total.add("Sistema Operativo: MacOs");
					
				}
			total.add("Especialidades:");
			if (rProgramador.isSelected()) {
				total.add(" Programación");
				
			} if (rDiseñoGrafico.isSelected()) {
				total.add(" Diseño Gráfico");
			}
			if(rAdministracion.isSelected()){
				total.add(" Administración");
			}
			int num=slider.getValue();
			String numero= String.valueOf(num)+ " Horas";
			total.add(numero);
			JOptionPane.showMessageDialog(contentPane, total);
			}
			
			
		});
		
	}
}
