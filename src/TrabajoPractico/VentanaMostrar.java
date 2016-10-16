package TrabajoPractico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.DropMode;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMostrar extends JFrame {

	private JPanel contentPane;
	private JTable Muestra;


	public VentanaMostrar(ListaDeOfertas ofertas) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		String Matriz[][] = new String[ofertas.Licitacion.size()][4];
		
		for (int i = 0; i < ofertas.Licitacion.size(); i++) {
			Matriz[i][0]=ofertas.Licitacion.get(i).GetNombre();
			Matriz[i][1]=String.valueOf(ofertas.Licitacion.get(i).GetHorarioInicial()) + " Hs.";
			Matriz[i][2]=String.valueOf(ofertas.Licitacion.get(i).GetHorarioFinall())+ " Hs.";
			Matriz[i][3]="$ " + String.valueOf(ofertas.Licitacion.get(i).GetOferta());
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
		Muestra.setModel(new DefaultTableModel(
			Matriz,
			new String[] {
				"Cliente", "Hs. Empieza", "Hs. Finaliza", "Importe"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
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
		FondoMostrar.setIcon(new ImageIcon(VentanaMostrar.class.getResource("/Imagenes/Fondo Mostrar.png")));
		FondoMostrar.setBounds(0, 0, 582, 340);
		contentPane.add(FondoMostrar);
	}
}
