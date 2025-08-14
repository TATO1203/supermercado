package EventYListener;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


import EventYListener.Persona;

public class Ventana extends JFrame{
	
Persona ps = new Persona(null, null);

public Ventana() {
    
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ventana De Thiago Carreras");
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout()); 
		
		JPanel panel = new JPanel();
		panel.setLayout(null);

		

		this.add(panel, BorderLayout.CENTER); 
		this.setVisible(true);
		
		JLabel Etiqueta = new JLabel("hola a mi programa :D");
		
		Etiqueta.setFont(new Font("arial", Font.PLAIN,15));

		Etiqueta.setOpaque(false);;
		
		Etiqueta.setForeground(Color.black);
		Etiqueta.setBackground(Color.black);
		
		Etiqueta.setBounds(10, 5, 300, 50);
		
		
		//etiqueta 2
		
		JLabel Etiqueta2 = new JLabel("Nombre:");
		
		Etiqueta2.setBounds(10, 40, 300, 50);
		
		JLabel Etiqueta3 = new JLabel("Apellido:");
		
		Etiqueta3.setBounds(10, 55, 300, 100);
		
		panel.add(Etiqueta);
		panel.add(Etiqueta2);
		panel.add(Etiqueta3);
		
		//caja de texto
		
		
		JTextField cjtexto = new JTextField();
		cjtexto.setBounds(70, 55, 200, 30);
		cjtexto.getText();
		
		JTextField cjtexto1 = new JTextField();
		cjtexto1.setBounds(70, 95, 200, 30);;
		
		panel.add(cjtexto);
		panel.add(cjtexto1);
	
		//JSPIN
		
		//JSpinner edad = new JSpinner();
		
		//boton
		
		JButton boton1 = new JButton("Aceptar");
		
		boton1.setFont(new Font("arial", Font.PLAIN,15));
		boton1.setBounds(100, 170, 130, 40);
		
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nombre = cjtexto.getText();
				String apellido = cjtexto1.getText();

				System.out.println("Nombre: "+ nombre);
				System.out.println("Apellido: " + apellido);
				
				ps.setNombre(nombre);
				ps.setApellido(apellido);				
			}			
		});
		
		
		panel.add(boton1);
		this.setVisible(true);

		this.add(panel);
		

	}


}
