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
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaAgregar extends JFrame {

	private JPanel contentPane;
	private JTextField Var_Nombre;
	private JTextField Var_Importe;
	private JTextField Var_HorarioInic;
	private JTextField Var_HorarioFin;

	/**
	 * Create the frame.
	 * @param ofertas 
	 */
	public VentanaAgregar(ListaDeOfertas ofertas) {
		setTitle("Ventana Agregar");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 241, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setBounds(10, 38, 103, 22);
		Nombre.setForeground(Color.WHITE);
		Nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		Nombre.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(Nombre);
		
		JLabel HorarioInicio = new JLabel("Horario Inicio");
		HorarioInicio.setBounds(10, 86, 103, 22);
		HorarioInicio.setForeground(Color.WHITE);
		HorarioInicio.setHorizontalAlignment(SwingConstants.CENTER);
		HorarioInicio.setFont(new Font("Tahoma", Font.BOLD, 14));
		HorarioInicio.setAlignmentX(0.5f);
		contentPane.add(HorarioInicio);
		
		JLabel HorarioFinal = new JLabel("Horario Final");
		HorarioFinal.setBounds(10, 133, 103, 22);
		HorarioFinal.setForeground(Color.WHITE);
		HorarioFinal.setHorizontalAlignment(SwingConstants.CENTER);
		HorarioFinal.setFont(new Font("Tahoma", Font.BOLD, 14));
		HorarioFinal.setAlignmentX(0.5f);
		contentPane.add(HorarioFinal);
		
		JLabel Importe = new JLabel("Importe");
		Importe.setBounds(10, 182, 103, 22);
		Importe.setForeground(Color.WHITE);
		Importe.setHorizontalAlignment(SwingConstants.CENTER);
		Importe.setFont(new Font("Tahoma", Font.BOLD, 14));
		Importe.setAlignmentX(0.5f);
		contentPane.add(Importe);
		
		JButton BotonAgregar = new JButton("Guardar");
		BotonAgregar.setForeground(SystemColor.activeCaptionText);
		BotonAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
		BotonAgregar.setBackground(SystemColor.activeCaption);
		BotonAgregar.setBounds(10, 252, 96, 51);
		BotonAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ofertas.Validaciones(Var_Nombre.getText(),Var_HorarioInic.getText(),Var_HorarioFin.getText(),Var_Importe.getText())){
					Oferta NuevaOferta = new Oferta(Var_Nombre.getText(),Var_HorarioInic.getText(),Var_HorarioFin.getText(),Var_Importe.getText());
					ofertas.Licitacion.add(NuevaOferta);
					dispose();
				}
				else
				{
					MensajeErrorAgregar VentanaError = new MensajeErrorAgregar(ofertas.TipoDeError(Var_Nombre.getText(),Var_HorarioInic.getText(),Var_HorarioFin.getText(),Var_Importe.getText()));
					VentanaError.setVisible(true);
				}
			}
		});
		contentPane.add(BotonAgregar);
		
		JButton BotonSalir = new JButton("Salir");
		BotonSalir.setForeground(SystemColor.activeCaptionText);
		BotonSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		BotonSalir.setBackground(SystemColor.activeCaption);
		BotonSalir.setBounds(129, 252, 96, 51);
		BotonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.add(BotonSalir);
		
		Var_Nombre = new JTextField();
		Var_Nombre.setBounds(104, 34, 111, 34);
		Var_Nombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent c) {
				char a=c.getKeyChar();
				if (Character.isDigit(a))
				{
					getToolkit().beep();
					c.consume();
				}
			}
		});
		contentPane.add(Var_Nombre);
		Var_Nombre.setColumns(10);
		
		Var_Importe = new JTextField();
		Var_Importe.setBounds(104, 178, 111, 34);
		Var_Importe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent c) {
				char a=c.getKeyChar();
				if (Character.isLetter(a))
				{
					getToolkit().beep();
					c.consume();
				}
			}
		});
		Var_Importe.setColumns(10);
		contentPane.add(Var_Importe);
		
		Var_HorarioInic = new JTextField();
		Var_HorarioInic.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent c) {
				char a=c.getKeyChar();
				if (Character.isLetter(a))
				{
					getToolkit().beep();
					c.consume();
				}
			}
		});
		Var_HorarioInic.setBounds(142, 82, 73, 34);
		Var_HorarioInic.setColumns(10);
		contentPane.add(Var_HorarioInic);
		
		Var_HorarioFin = new JTextField();
		Var_HorarioFin.setColumns(10);
		Var_HorarioFin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent c) {
				char a=c.getKeyChar();
				if (Character.isLetter(a))
				{
					getToolkit().beep();
					c.consume();
				}
			}
		});
		Var_HorarioFin.setBounds(142, 127, 73, 34);
		contentPane.add(Var_HorarioFin);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 235, 314);
		Fondo.setIcon(new ImageIcon(VentanaAgregar.class.getResource("/Imagenes/Fondo Agregar.png")));
		contentPane.add(Fondo);
		
	}
}
