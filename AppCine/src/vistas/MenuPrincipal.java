package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

import models.Container;
import models.Entradas;
import models.Pelicula;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPrincipal {
	
	private JFrame frame2;
	private JButton btncartelera;
	private JButton btntickets;
	private JButton btncompra;
	private JLabel lblcartelera;
	private JLabel lblComprarEntradas;
	private JLabel lbltickets;
	
	

	



	public MenuPrincipal() {
		
		frame2 = new JFrame();
		btncartelera = new JButton("");
		 btntickets = new JButton("");
		 
		  btncompra = new JButton("");
			 lblcartelera = new JLabel("Cartelera");
			 lblComprarEntradas = new JLabel("Comprar Entradas");
			 lbltickets = new JLabel("Tu Compra");
		initialize();
	}

	
	private void initialize() {
		propiedades();
		rellenar();
		eventos();
	
	}

	public JFrame getFrame2() {
		return frame2;
		
	}
	
	public void propiedades()
	{

		frame2.getContentPane().setBackground(Color.ORANGE);
		frame2.getContentPane().setLayout(null);
		
		
		btncartelera.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Imagenes/Movie-50.png")));
		btncartelera.setBounds(6, 107, 117, 56);
		btncartelera.setBorderPainted(false);
		frame2.getContentPane().add(btncartelera);
		
		
		lblcartelera.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblcartelera.setBounds(26, 81, 86, 14);
		frame2.getContentPane().add(lblcartelera);
		
		
		btntickets.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Imagenes/New Ticket-50.png")));
		btntickets.setBounds(167, 110, 75, 53);
		btntickets.setBorderPainted(false);
		frame2.getContentPane().add(btntickets);
		
		
		lblComprarEntradas.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblComprarEntradas.setBounds(139, 80, 156, 16);
		frame2.getContentPane().add(lblComprarEntradas);
		
		
		btncompra.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Imagenes/Add Shopping Cart-50.png")));
		btncompra.setBounds(292, 91, 117, 87);
		btncompra.setBorderPainted(false);;
		frame2.getContentPane().add(btncompra);
		
		
		lbltickets.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lbltickets.setBounds(307, 80, 102, 16);
		frame2.getContentPane().add(lbltickets);
		frame2.setBounds(100, 100, 450, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void eventos(){
		
		
		btncartelera.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
		
			Cartelera x=new Cartelera(frame2);
			x.getFrame3().setVisible(true);
			frame2.setVisible(false);
			
			}
		});
		
		btntickets.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		
		 		Entradas x=new Entradas();
				x.getFrame4().setVisible(true);
				frame2.setVisible(false);
		 		
		 	}
		 });
	}
	
	private void rellenar() {

		Pelicula x = new Pelicula("Piratas del Caribe", 180, "Aventuras", 8);
		Pelicula y = new Pelicula("El señor de los anillos", 220, "Aventuras", 8);
		Pelicula j = new Pelicula("8 apellidos vascos", 100, "Comedia", 8);
		Pelicula k = new Pelicula("El naugrafo", 190, "Drama", 8);
		Pelicula l = new Pelicula("El exorcisra", 120, "Terror", 8);

		Container.getCartelera().add(x);
		Container.getCartelera().add(y);
		Container.getCartelera().add(j);
		Container.getCartelera().add(k);
		Container.getCartelera().add(l);
		

	}
}



