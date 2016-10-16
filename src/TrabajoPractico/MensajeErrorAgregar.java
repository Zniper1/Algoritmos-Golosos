package TrabajoPractico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.SwingConstants;

public class MensajeErrorAgregar extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public MensajeErrorAgregar(String Mensaje) {
		setUndecorated(true);
		setTitle("Error al agregar oferta");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 107);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel MensajeError = new JLabel(Mensaje);
		MensajeError.setHorizontalAlignment(SwingConstants.CENTER);
		MensajeError.setIcon(null);
		MensajeError.setForeground(Color.WHITE);
		MensajeError.setAlignmentX(Component.CENTER_ALIGNMENT);
		MensajeError.setFont(new Font("Estrangelo Edessa", Font.BOLD, 14));
		MensajeError.setBounds(10, 11, 509, 50);
		contentPane.add(MensajeError);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(SystemColor.activeCaptionText);
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAceptar.setBackground(SystemColor.activeCaption);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnAceptar.setBounds(220, 61, 91, 23);
		contentPane.add(btnAceptar);
	}
}
