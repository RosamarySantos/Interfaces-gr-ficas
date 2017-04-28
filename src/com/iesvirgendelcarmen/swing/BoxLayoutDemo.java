package com.iesvirgendelcarmen.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class BoxLayoutDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoxLayoutDemo frame = new BoxLayoutDemo();
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
	public BoxLayoutDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//Creo un panel y lo pongo como contentPane del frame
		JPanel panel = new JPanel();
		BoxLayout miLayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		panel.setLayout(miLayout);
		setContentPane(panel);
		
		JButton btnBoton = new JButton("boton1");
		panel.add(btnBoton);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);
		
		JButton btnBoton_1 = new JButton("boton2");
		panel.add(btnBoton_1);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		panel.add(horizontalGlue_1);
		
		JButton btnBoton_2 = new JButton("boton3");
		panel.add(btnBoton_2);
		
		
		
		
		

	}

}
