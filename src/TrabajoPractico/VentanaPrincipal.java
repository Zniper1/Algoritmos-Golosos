package TrabajoPractico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("VDP v2.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BotonAgregarOferta = new JButton("Agregar Oferta");
		BotonAgregarOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BotonAgregarOferta.setBounds(10, 159, 132, 55);
		contentPane.add(BotonAgregarOferta);
		
		JButton BotonEliminarOferta = new JButton("Eliminar Oferta");
		BotonEliminarOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotonEliminarOferta.setBounds(152, 159, 132, 55);
		contentPane.add(BotonEliminarOferta);
		
		JButton MostrarOfertas = new JButton("Mostrar Ofertas");
		MostrarOfertas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		MostrarOfertas.setBounds(294, 159, 132, 55);
		contentPane.add(MostrarOfertas);
		
		JButton CalcularGanancia = new JButton("Calcular Ganancia");
		CalcularGanancia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CalcularGanancia.setBounds(436, 159, 132, 55);
		contentPane.add(CalcularGanancia);
		
		JButton GuardarProgreso = new JButton("Guardar Progreso");
		GuardarProgreso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GuardarProgreso.setBounds(436, 11, 132, 38);
		contentPane.add(GuardarProgreso);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(10, 10, 416, 143);
		contentPane.add(canvas);
		
		JButton Salir = new JButton("Salir");
		System.exit(0);
		Salir.setBounds(436, 93, 132, 55);
		contentPane.add(Salir);
	}
}
