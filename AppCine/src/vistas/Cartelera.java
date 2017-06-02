package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import models.Cine;
import models.Container;
import models.Pelicula;

import java.awt.Font;
import java.util.ListIterator;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cartelera {

	private JFrame frame3;
	private JLabel lbltitulo;
	private JLabel lblPrecio;
	private JButton btnnext;
	private JButton btnprev;
	private JLabel lbltitulo2;
	private JLabel lblduracion2;
	private JLabel lblgenero2;
	private JLabel lblprecio2;
	private ListIterator<Pelicula> it;
	private JLabel lblMinutos;
	private JLabel label;
	private JButton btnhome;
	private JFrame frameaux;

	public Cartelera(JFrame frame2) {
		frame3 = new JFrame();
		lbltitulo = new JLabel("Titulo:");
		lblPrecio = new JLabel("Precio:");
		btnnext = new JButton("");
		btnnext.setBackground(Color.ORANGE);

		btnprev = new JButton("");
		btnprev.setBackground(Color.ORANGE);

		it = Container.getCartelera().listIterator();
		lbltitulo2 = new JLabel("");
		lbltitulo2.setFont(new Font("Lucida Blackletter", Font.BOLD | Font.ITALIC, 14));
		lblduracion2 = new JLabel("");
		lblduracion2.setFont(new Font("Lucida Blackletter", Font.BOLD | Font.ITALIC, 14));
		lblgenero2 = new JLabel("");
		lblgenero2.setFont(new Font("Lucida Blackletter", Font.BOLD | Font.ITALIC, 14));

		lblprecio2 = new JLabel("");
		lblprecio2.setFont(new Font("Lucida Blackletter", Font.BOLD | Font.ITALIC, 14));

		btnhome = new JButton("");
		btnhome.setBackground(Color.ORANGE);
		btnhome.setForeground(Color.ORANGE);
		frameaux=frame2;
		
		initialize();
	}

	private void initialize() {

		propiedades();
	
		eventos();

	}

	public void propiedades() {

		frame3.getContentPane().setBackground(Color.ORANGE);
		frame3.getContentPane().setLayout(null);

		lbltitulo.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lbltitulo.setBounds(37, 78, 89, 16);
		frame3.getContentPane().add(lbltitulo);

		JLabel lblDuracin = new JLabel("Duraci\u00F3n:");
		lblDuracin.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblDuracin.setBounds(34, 120, 76, 16);
		frame3.getContentPane().add(lblDuracin);

		JLabel lblGnero = new JLabel("G\u00E9nero:");
		lblGnero.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblGnero.setBounds(37, 166, 61, 16);
		frame3.getContentPane().add(lblGnero);

		lblPrecio.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
		lblPrecio.setBounds(37, 215, 61, 16);
		frame3.getContentPane().add(lblPrecio);

		btnprev.setIcon(new ImageIcon(Cartelera.class.getResource("/Imagenes/Previous-48.png")));
		btnprev.setBounds(339, 16, 44, 29);
		btnprev.setBorderPainted(false);
		frame3.getContentPane().add(btnprev);

		btnnext.setIcon(new ImageIcon(Cartelera.class.getResource("/Imagenes/Next-48.png")));
		btnnext.setBounds(385, 16, 44, 29);
		btnnext.setBorderPainted(false);
		frame3.getContentPane().add(btnnext);

		lbltitulo2.setBounds(152, 78, 158, 16);
		frame3.getContentPane().add(lbltitulo2);

		lblduracion2.setBounds(152, 120, 36, 16);
		frame3.getContentPane().add(lblduracion2);

		lblgenero2.setBounds(152, 166, 158, 16);
		frame3.getContentPane().add(lblgenero2);

		lblprecio2.setBounds(152, 215, 44, 16);
		frame3.getContentPane().add(lblprecio2);

		lblMinutos = new JLabel("Minutos");
		lblMinutos.setFont(new Font("Lucida Blackletter", Font.BOLD | Font.ITALIC, 14));
		lblMinutos.setBounds(200, 120, 61, 16);
		frame3.getContentPane().add(lblMinutos);

		label = new JLabel("$");
		label.setBounds(208, 215, 61, 16);
		frame3.getContentPane().add(label);

		btnhome.setIcon(new ImageIcon(Cartelera.class.getResource("/Imagenes/Home-64.png")));
		btnhome.setBounds(349, 207, 80, 55);
		btnhome.setBorderPainted(false);
		frame3.getContentPane().add(btnhome);
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void eventos() {

		lbltitulo2.setText(Container.getCartelera().get(0).getTitulo());
		lblduracion2.setText(String.valueOf((Container.getCartelera().get(0).getDuracion())));
		lblgenero2.setText(Container.getCartelera().get(0).getGenero());
		lblprecio2.setText(String.valueOf(Container.getCartelera().get(0).getPrecio()));

		btnnext.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				if (it.hasNext()) {
					Pelicula x = it.next();

					lbltitulo2.setText(x.getTitulo());
					lblduracion2.setText(String.valueOf(x.getDuracion()));
					lblgenero2.setText(x.getGenero());
					lblprecio2.setText(String.valueOf(x.getPrecio()));

				} else {
					JOptionPane.showMessageDialog(frame3, "No tenemos mas peliculas");
				}
			}
		});

		btnprev.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				if (it.hasPrevious()) {
					Pelicula x = it.previous();

					lbltitulo2.setText(x.getTitulo());
					lblduracion2.setText(String.valueOf(x.getDuracion()));
					lblgenero2.setText(x.getGenero());
					lblprecio2.setText(String.valueOf(x.getPrecio()));

				} else {
					JOptionPane.showMessageDialog(frame3, "No tenemos mas peliculas");
				}
			}
		});
		
		btnhome.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				frameaux.setVisible(true);
				frame3.dispose();
			}
		});

	}



	public JFrame getFrame3() {
		return frame3;
	}

}
