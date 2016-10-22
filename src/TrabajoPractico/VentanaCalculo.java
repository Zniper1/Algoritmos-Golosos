package TrabajoPractico;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.util.Comparator.comparing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.Component;
import java.awt.ComponentOrientation;

public class VentanaCalculo extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public VentanaCalculo(ListaDeOfertas ofertas) {
		setTitle("Ganancias del dia");
		ArrayList<Oferta> OfertasCalculo = new ArrayList<Oferta>();
		OfertasCalculo.add(ofertas.Licitacion.get(0));

		for (int i = 1; i < ofertas.Licitacion.size(); i++) {
			if (SeTocan(ofertas.Licitacion.get(i), OfertasCalculo)) {
				OfertasCalculo.add(ofertas.Licitacion.get(i));
			}
		}

		int SumaTotal = 0;

		String Matriz[][] = new String[OfertasCalculo.size()][4];
		for (int i = 0; i < OfertasCalculo.size(); i++) {
			SumaTotal += OfertasCalculo.get(i).Oferta;
			Matriz[i][0] = OfertasCalculo.get(i).Nombre;
			Matriz[i][1] = String.valueOf(OfertasCalculo.get(i).HorarioInicial) + " hs";
			Matriz[i][2] = String.valueOf(OfertasCalculo.get(i).HorarioFinal) + " hs";
			Matriz[i][3] = String.valueOf(OfertasCalculo.get(i).Oferta);

		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 378);
		contentPane = new JPanel();
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setModel(
				new DefaultTableModel(Matriz, new String[] { "Nombre", "Horario Inicio", "Horario Fin", "Importe" }) {
					Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
		table.setBounds(10, 54, 477, 240);
		contentPane.add(table);

		JButton Volver = new JButton("Volver");
		Volver.setForeground(SystemColor.activeCaptionText);
		Volver.setFont(new Font("Tahoma", Font.BOLD, 12));
		Volver.setBackground(SystemColor.activeCaption);
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		Volver.setBounds(355, 11, 132, 32);
		contentPane.add(Volver);

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("$ " + String.valueOf(SumaTotal));
		textPane.setFont(new Font("Calibri", Font.BOLD, 23));
		textPane.setBounds(365, 305, 122, 37);
		contentPane.add(textPane);

	}

	public boolean SeTocan(Oferta NuevaOferta, ArrayList<Oferta> OfertasCalculo) {
		for (int i = 0; i < OfertasCalculo.size(); i++) {
			if(OfertasCalculo.get(i).HorarioInicial>NuevaOferta.HorarioInicial)
			{
				if (!(OfertasCalculo.get(i).HorarioInicial >= NuevaOferta.HorarioFinal)) 
				{
					return false;
				}
				if (!(OfertasCalculo.get(i).HorarioInicial > NuevaOferta.HorarioInicial)) 
				{
					return false;
				}
			}
			else
			{
				if (!(OfertasCalculo.get(i).HorarioFinal < NuevaOferta.HorarioFinal)) 
				{
					return false;
				}
				if (!(OfertasCalculo.get(i).HorarioFinal <= NuevaOferta.HorarioInicial)) 
				{
					return false;
				}
			}
		}

		return true;
	}
}
