package models;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Entradas {

	private JFrame frame4;
	private JSpinner spinner;
	private JSpinner spinner2;
	private JSpinner spinner3;
	private JSpinner spinner4;
	private JSpinner spinner5;
	private JButton btnNewButton;
	private JLabel lblPreciototal;
	private JLabel lblpreciototal2;
	private JLabel lblpeli1;
	private JLabel lblpeli2;
	private JLabel lblpeli3;
	private JLabel lblpeli4;
	private JLabel lblpeli5;
	private Cine x;

	public Entradas() {

		lblpeli1 = new JLabel("p");
		lblpeli2 = new JLabel("p");
		lblpeli3 = new JLabel("p");
		lblpeli4 = new JLabel("p");
		lblpeli5 = new JLabel("p");
		spinner = new JSpinner();
		spinner2 = new JSpinner();
		spinner3 = new JSpinner();
		spinner4 = new JSpinner();
		spinner5 = new JSpinner();
		btnNewButton = new JButton("");
		lblPreciototal = new JLabel("PrecioTotal");
		lblpreciototal2 = new JLabel("");
		x=new Cine();

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		propiedades();
		eventos();

	}

	public void propiedades() {

		
		x.setCapacidad(350);
		
		
		frame4 = new JFrame();
		frame4.getContentPane().setBackground(Color.ORANGE);
		frame4.getContentPane().setLayout(null);

		lblpeli1.setBounds(22, 42, 154, 16);
		frame4.getContentPane().add(lblpeli1);

		lblpeli2.setBounds(22, 79, 154, 16);
		frame4.getContentPane().add(lblpeli2);

		lblpeli3.setBounds(22, 123, 154, 16);
		frame4.getContentPane().add(lblpeli3);

		lblpeli4.setBounds(22, 169, 154, 16);
		frame4.getContentPane().add(lblpeli4);

		lblpeli5.setBounds(22, 214, 154, 16);
		frame4.getContentPane().add(lblpeli5);

		spinner.setBounds(189, 37, 47, 26);
		frame4.getContentPane().add(spinner);

		spinner2.setBounds(188, 74, 48, 26);
		frame4.getContentPane().add(spinner2);

		spinner3.setBounds(189, 118, 47, 26);
		frame4.getContentPane().add(spinner3);

		spinner4.setBounds(188, 164, 48, 26);
		frame4.getContentPane().add(spinner4);

		spinner5.setBounds(189, 209, 47, 26);
		frame4.getContentPane().add(spinner5);

		btnNewButton.setIcon(new ImageIcon(Entradas.class.getResource("/Imagenes/Buy-50.png")));
		btnNewButton.setBounds(319, 198, 77, 74);
		btnNewButton.setBorderPainted(false);
		frame4.getContentPane().add(btnNewButton);

		lblPreciototal.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
		lblPreciototal.setBounds(312, 128, 101, 16);
		frame4.getContentPane().add(lblPreciototal);

		lblpreciototal2.setBounds(320, 169, 93, 16);
		frame4.getContentPane().add(lblpreciototal2);
		frame4.setBounds(100, 100, 450, 300);

		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void eventos() {
		lblpeli1.setText(Container.getCartelera().get(0).getTitulo());
		lblpeli2.setText(Container.getCartelera().get(1).getTitulo());
		lblpeli3.setText(Container.getCartelera().get(2).getTitulo());
		lblpeli4.setText(Container.getCartelera().get(3).getTitulo());
		lblpeli5.setText(Container.getCartelera().get(4).getTitulo());
		
		
		
		
		
	
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int precio=((int) spinner.getValue()+(int) spinner2.getValue()+(int) spinner3.getValue()+(int) spinner4.getValue()+(int) spinner5.getValue())*8;
				lblpreciototal2.setText(String.valueOf(precio));
				
				int respuesta = JOptionPane.showConfirmDialog(null, "Desea comprar las entradas por "+precio+"$", "Confirmacion", JOptionPane.YES_NO_OPTION);
		        if (respuesta == JOptionPane.YES_OPTION) {
		          JOptionPane.showMessageDialog(null, "Entradas compradas y enviadas a su carrito");
		          
		          x.setCapacidad(x.getCapacidad()-((int) spinner.getValue()+(int) spinner2.getValue()+(int) spinner3.getValue()+(int) spinner4.getValue()+(int) spinner5.getValue()));
		          JOptionPane.showMessageDialog(null, x.getCapacidad());
		        }
		        
		        else {
		           JOptionPane.showMessageDialog(null, "Gracias");
		           System.exit(0);
				
			}
			
			}
		});

	}

	public JFrame getFrame4() {
		return frame4;
	}
}
