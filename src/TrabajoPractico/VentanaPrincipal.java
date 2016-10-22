package TrabajoPractico;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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

	ListaDeOfertas Ofertas = new ListaDeOfertas();

	public VentanaPrincipal() {
		Ofertas.Licitacion = Cargar();
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
				VentanaEliminar Eliminar = new VentanaEliminar(Ofertas);
				Eliminar.setVisible(true);
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
				Ofertas.OrdenarArray();
				VentanaCalculo Ganancia = new VentanaCalculo(Ofertas);
				Ganancia.setVisible(true);
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
				Guardar(Ofertas.Licitacion);
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

	public static void Guardar(ArrayList<Oferta> lista) {
		Path path = Paths.get("DatosClientes.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			for (int i = 0; i < lista.size(); i++) {
				w.write(lista.get(i).GetNombre() + ";" + lista.get(i).GetHorarioInicial() + ";"
						+ lista.get(i).GetHorarioFinal() + ";" + lista.get(i).GetOferta() + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Oferta> Cargar() {
		Path path = Paths.get("DatosClientes.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		String tmp;
		ArrayList<Oferta> Lista = new ArrayList<Oferta>();
		try (BufferedReader r = Files.newBufferedReader(path, utf8)) {
			while ((tmp = r.readLine()) != null) {
				String[] tmpSplit = tmp.split(";");
				Oferta NuevaOferta = new Oferta(tmpSplit[0], tmpSplit[1], tmpSplit[2], tmpSplit[3]);
				Lista.add(NuevaOferta);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Lista;
	}

}
