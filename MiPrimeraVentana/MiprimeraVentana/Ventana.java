package MiprimeraVentana;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
	
	JPanel panel = new JPanel();
	
	public Ventana() {
		this.setSize(400, 280);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ventana de Prueba - Thiago Carreras");
		this.setLocationRelativeTo(null);
		
		Componentes();
		Etiquetas();
		Botones();
		CajaDeTexto();
	}
	
	private void Componentes() {
		
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		
		
		}
	
	private void Etiquetas() {
		
		JLabel Etiqueta = new JLabel("Bienvenido a mi programa :D");
		
		Etiqueta.setFont(new Font("arial", Font.PLAIN,15));

		Etiqueta.setOpaque(false);;
		
		Etiqueta.setForeground(Color.black);
		Etiqueta.setBackground(Color.black);
		
		Etiqueta.setBounds(10, 5, 300, 50);
		
		//etiqueta 2
		
		JLabel Etiqueta2 = new JLabel("Nombre:");
		
		Etiqueta2.setBounds(10, 40, 300, 50);
		
		panel.add(Etiqueta);
		panel.add(Etiqueta2);
	}
	
	private void Botones() {
		
		JButton boton1 = new JButton("Aceptar");
		
		boton1.setFont(new Font("arial", Font.PLAIN,20));
		boton1.setBounds(100, 130, 150, 50);

		panel.add(boton1);
		
	}
	
	private void CajaDeTexto() {
		
		JTextField cjtexto = new JTextField();
		cjtexto.setBounds(70, 50, 200, 30);
		panel.add(cjtexto);
	}
	
}



