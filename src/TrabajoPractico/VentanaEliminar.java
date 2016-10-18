package TrabajoPractico;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Window.Type;

public class VentanaEliminar extends JFrame {

	private JPanel contentPane;
	private JTable Muestra;
	private JTextField txtOferta;
	private JButton btnEliminarOferta;

	public VentanaEliminar(ListaDeOfertas ofertas) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		String Matriz[][] = new String[ofertas.Licitacion.size()][4];

		for (int i = 0; i < ofertas.Licitacion.size(); i++) {
			Matriz[i][0] = ofertas.Licitacion.get(i).GetNombre();
			Matriz[i][1] = String.valueOf(ofertas.Licitacion.get(i).GetHorarioInicial()) + " Hs.";
			Matriz[i][2] = String.valueOf(ofertas.Licitacion.get(i).GetHorarioFinall()) + " Hs.";
			Matriz[i][3] = "$ " + String.valueOf(ofertas.Licitacion.get(i).GetOferta());
		}

		Muestra = new JTable();
		Muestra.setBackground(SystemColor.control);
		Muestra.setAutoCreateRowSorter(true);
		Muestra.setBounds(10, 89, 562, 240);
		Muestra.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		Muestra.setEnabled(false);
		Muestra.setFocusTraversalKeysEnabled(false);
		Muestra.setForeground(SystemColor.activeCaption);
		Muestra.setGridColor(SystemColor.windowText);
		Muestra.setFont(new Font("Calibri", Font.BOLD, 16));
		Muestra.setFocusable(false);
		Muestra.setModel(
				new DefaultTableModel(Matriz, new String[] { "Cliente", "Hs. Empieza", "Hs. Finaliza", "Importe" }) {
					Class[] columnTypes = new Class[] { String.class, Integer.class, Integer.class, Integer.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}

					boolean[] columnEditables = new boolean[] { false, false, false, false };

					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});
		Muestra.getColumnModel().getColumn(0).setResizable(false);
		Muestra.getColumnModel().getColumn(1).setResizable(false);
		Muestra.getColumnModel().getColumn(2).setResizable(false);
		Muestra.getColumnModel().getColumn(3).setResizable(false);
		contentPane.setLayout(null);
		contentPane.add(Muestra);

		JButton btnEliminarTodasLas = new JButton("Eliminar todas las ofertas");
		btnEliminarTodasLas.setForeground(Color.WHITE);
		btnEliminarTodasLas.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminarTodasLas.setBackground(SystemColor.activeCaption);
		btnEliminarTodasLas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ofertas.EliminarTodo();
				dispose();
			}
		});
		btnEliminarTodasLas.setBounds(383, 11, 189, 23);
		contentPane.add(btnEliminarTodasLas);

		txtOferta = new JTextField();
		txtOferta.setBounds(10, 56, 78, 23);
		contentPane.add(txtOferta);
		txtOferta.setColumns(10);

		btnEliminarOferta = new JButton("Eliminar Oferta");
		btnEliminarOferta.setForeground(Color.WHITE);
		btnEliminarOferta.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminarOferta.setBackground(SystemColor.activeCaption);
		btnEliminarOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtOferta.getText() == "") {
					int x = Integer.parseInt(txtOferta.getText()) - 1;
					if (x >= 0 && x < ofertas.Licitacion.size()) {
						ofertas.BorrarOferta(x);
						dispose();
					} else {
						System.out.println("Numero Equivocado");
					}
				} else {
					System.out.println("No ha seleccionado nada");
				}

			}
		});
		btnEliminarOferta.setBounds(96, 55, 135, 23);
		contentPane.add(btnEliminarOferta);

		JButton btnSalir = new JButton("Volver");
		btnSalir.setForeground(SystemColor.activeCaptionText);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.setBackground(SystemColor.activeCaption);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(10, 11, 91, 23);
		contentPane.add(btnSalir);

		JLabel FondoMostrar = new JLabel("");
		FondoMostrar.setIcon(new ImageIcon(VentanaEliminar.class.getResource("/Imagenes/FondoEliminar.png")));
		FondoMostrar.setBounds(0, 0, 582, 340);
		contentPane.add(FondoMostrar);
	}
}
