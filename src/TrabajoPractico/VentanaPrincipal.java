package TrabajoPractico;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	boolean VentanaActiva = false;
	Musica Fondo = new Musica("Pearl Jam - Even Flow");
	//Musica Fondo = new Musica("Man of the Hour");
	ListaDeOfertas Ofertas = new ListaDeOfertas();

	public VentanaPrincipal() {
		setForeground(Color.BLUE);
		setResizable(false);
		setTitle("Eddie Vedder - Sala de Ensayo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 257);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton BotonAgregarOferta = new JButton("Agregar Oferta");
		BotonAgregarOferta.setForeground(SystemColor.activeCaptionText);
		BotonAgregarOferta.setFont(new Font("Tahoma", Font.BOLD, 12));
		BotonAgregarOferta.setBackground(SystemColor.activeCaption);
		BotonAgregarOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaAgregar VentanaOferta = new VentanaAgregar(Ofertas);
				VentanaOferta.setVisible(true);
			}
		});
		BotonAgregarOferta.setBounds(10, 159, 132, 55);
		contentPane.add(BotonAgregarOferta);

		JButton BotonEliminarOferta = new JButton("Eliminar Oferta");
		BotonEliminarOferta.setForeground(SystemColor.activeCaptionText);
		BotonEliminarOferta.setFont(new Font("Tahoma", Font.BOLD, 12));
		BotonEliminarOferta.setBackground(SystemColor.activeCaption);
		BotonEliminarOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotonEliminarOferta.setBounds(152, 159, 132, 55);
		contentPane.add(BotonEliminarOferta);

		JButton MostrarOfertas = new JButton("Mostrar Ofertas");
		MostrarOfertas.setForeground(SystemColor.activeCaptionText);
		MostrarOfertas.setFont(new Font("Tahoma", Font.BOLD, 12));
		MostrarOfertas.setBackground(SystemColor.activeCaption);
		MostrarOfertas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMostrar VentanaMuestra = new VentanaMostrar(Ofertas);
				VentanaMuestra.setVisible(true);
			}
		});
		MostrarOfertas.setBounds(294, 159, 132, 55);
		contentPane.add(MostrarOfertas);

		JButton CalcularGanancia = new JButton("Calcular $");
		CalcularGanancia.setForeground(SystemColor.activeCaptionText);
		CalcularGanancia.setFont(new Font("Tahoma", Font.BOLD, 12));
		CalcularGanancia.setBackground(SystemColor.activeCaption);
		CalcularGanancia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CalcularGanancia.setBounds(436, 159, 132, 55);
		contentPane.add(CalcularGanancia);

		JButton GuardarProgreso = new JButton("Guardar");
		GuardarProgreso.setForeground(SystemColor.activeCaptionText);
		GuardarProgreso.setFont(new Font("Tahoma", Font.BOLD, 12));
		GuardarProgreso.setBackground(SystemColor.activeCaption);
		GuardarProgreso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GuardarProgreso.setBounds(436, 11, 132, 38);
		contentPane.add(GuardarProgreso);

		JButton Salir = new JButton("Salir");
		Salir.setForeground(SystemColor.activeCaptionText);
		Salir.setFont(new Font("Tahoma", Font.BOLD, 12));
		Salir.setBackground(SystemColor.activeCaption);
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setBounds(436, 93, 132, 55);
		contentPane.add(Salir);

		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Imagenes/Logo Fin.png")));
		Logo.setBounds(10, 11, 403, 137);
		contentPane.add(Logo);

		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Imagenes/Fondo Sala.png")));
		Fondo.setBounds(0, 0, 584, 232);
		contentPane.add(Fondo);
	}
}
