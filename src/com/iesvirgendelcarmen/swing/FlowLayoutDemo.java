package com.iesvirgendelcarmen.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;

public class FlowLayoutDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayoutDemo frame = new FlowLayoutDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FlowLayoutDemo() {
		inicializar();
	}
	
	public void inicializar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		FlowLayout miLayout = new FlowLayout(FlowLayout.RIGHT,50,20);
		getContentPane().setLayout(miLayout);
		
		JButton boton1 = new JButton();
		boton1.setPreferredSize(new Dimension(200, 100));
		boton1.setText("Boton1");
		getContentPane().add(boton1);
		
		JButton boton2 = new JButton();
		boton2.setText("Boton2");
		getContentPane().add(boton2);
		
		JButton boton3 = new JButton();
		boton3.setText("Boton3");
		getContentPane().add(boton3);
		
		JButton boton4 = new JButton();
		boton4.setText("Boton4");
		getContentPane().add(boton4);
	}

}
