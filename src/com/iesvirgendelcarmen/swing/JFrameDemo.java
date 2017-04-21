package com.iesvirgendelcarmen.swing;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameDemo extends JFrame{

	private int contador = 0;
	private JLabel etiqueta;
	public final String MENSAJE = "Número de clicks: ";
	private JTextField textField;
	
	public JFrameDemo() {
		inicializar();
	}
	
	public void inicializar() {
		setTitle("Mi primera Aplicación");
		setSize(400, 300);
		//setSize(new Dimension(400, 300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//setLocation(new Point(100, 100));
		//Centra la ventana en el escritorio
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JButton boton = new JButton();
		boton.setText("Botón Contar");
		boton.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contador++;
				etiqueta.setText(MENSAJE + contador);
				long suma = 0;
				for(long i=0; i< 100000000000l; i++) {
					suma+=i;
				}
			}
		});
		panel.add(boton);
		

		etiqueta = new JLabel(MENSAJE + contador);
		panel.add(etiqueta);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnBotnDePrueba = new JButton("Cerrar App");
		btnBotnDePrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.add(btnBotnDePrueba);
	}

	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrameDemo ventana = new JFrameDemo();
			}
		});
	}

}
