package TrabajoPractico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;

public class VentanaAgregar extends JFrame {

	private JPanel contentPane;
	private JTextField Var_Nombre;
	private JTextField Var_Importe;

	/**
	 * Create the frame.
	 */
	public VentanaAgregar() {
		setTitle("Ventana Agregar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 241, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setBounds(10, 38, 103, 22);
		Nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		Nombre.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(Nombre);
		
		JLabel HorarioInicio = new JLabel("Horario Inicio");
		HorarioInicio.setBounds(10, 86, 103, 22);
		HorarioInicio.setHorizontalAlignment(SwingConstants.CENTER);
		HorarioInicio.setFont(new Font("Tahoma", Font.BOLD, 14));
		HorarioInicio.setAlignmentX(0.5f);
		contentPane.add(HorarioInicio);
		
		JLabel HorarioFinal = new JLabel("Horario Final");
		HorarioFinal.setBounds(10, 133, 103, 22);
		HorarioFinal.setHorizontalAlignment(SwingConstants.CENTER);
		HorarioFinal.setFont(new Font("Tahoma", Font.BOLD, 14));
		HorarioFinal.setAlignmentX(0.5f);
		contentPane.add(HorarioFinal);
		
		JLabel Importe = new JLabel("Importe");
		Importe.setBounds(10, 182, 103, 22);
		Importe.setHorizontalAlignment(SwingConstants.CENTER);
		Importe.setFont(new Font("Tahoma", Font.BOLD, 14));
		Importe.setAlignmentX(0.5f);
		contentPane.add(Importe);
		
		JButton BotonAgregar = new JButton("Guardar");
		BotonAgregar.setBounds(10, 239, 96, 51);
		contentPane.add(BotonAgregar);
		
		JButton BotonSalir = new JButton("Salir");
		BotonSalir.setBounds(119, 239, 96, 51);
		BotonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(BotonSalir);
		
		Var_Nombre = new JTextField();
		Var_Nombre.setBounds(104, 34, 111, 34);
		contentPane.add(Var_Nombre);
		Var_Nombre.setColumns(10);
		
		Var_Importe = new JTextField();
		Var_Importe.setColumns(10);
		Var_Importe.setBounds(104, 170, 111, 34);
		contentPane.add(Var_Importe);
		
		Choice Var_HorarioInic = new Choice();
		Var_HorarioInic.setBounds(119, 86, 96, 20);
		Var_HorarioInic.addItem("8:00");
		Var_HorarioInic.addItem("9:00");
		Var_HorarioInic.addItem("10:00");
		Var_HorarioInic.addItem("11:00");
		Var_HorarioInic.addItem("12:00");
		Var_HorarioInic.addItem("13:00");
		Var_HorarioInic.addItem("14:00");
		Var_HorarioInic.addItem("15:00");
		Var_HorarioInic.addItem("16:00");
		Var_HorarioInic.addItem("17:00");
		Var_HorarioInic.addItem("18:00");
		Var_HorarioInic.addItem("19:00");
		Var_HorarioInic.addItem("20:00");
		Var_HorarioInic.addItem("21:00");
		contentPane.add(Var_HorarioInic);
		
		Choice Var_HorarioFin = new Choice();
		Var_HorarioFin.setBounds(119, 135, 96, 20);
		Var_HorarioFin.addItem("9:00");
		Var_HorarioFin.addItem("10:00");
		Var_HorarioFin.addItem("11:00");
		Var_HorarioFin.addItem("12:00");
		Var_HorarioFin.addItem("13:00");
		Var_HorarioFin.addItem("14:00");
		Var_HorarioFin.addItem("15:00");
		Var_HorarioFin.addItem("16:00");
		Var_HorarioFin.addItem("17:00");
		Var_HorarioFin.addItem("18:00");
		Var_HorarioFin.addItem("19:00");
		Var_HorarioFin.addItem("20:00");
		Var_HorarioFin.addItem("21:00");
		Var_HorarioFin.addItem("22:00");
		contentPane.add(Var_HorarioFin);
	}
}
