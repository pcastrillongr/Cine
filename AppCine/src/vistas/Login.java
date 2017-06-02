package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import javax.swing.UIManager;

public class Login {

	private JFrame frame;
	private JTextField txtuser;
	private JPasswordField password;
	JLabel lblUser;
	JLabel lblPassword;
	String errores="";
	boolean escorrecto;
	Timer tiempo;
	private JButton btnboton;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		
		frame = new JFrame();
		txtuser = new JTextField();
		lblPassword = new JLabel("");
		 lblUser = new JLabel("");
		 password = new JPasswordField();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		propiedades();
		eventos();
		

	

	}


	private void propiedades()
	{
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		lblUser.setBounds(111, 76, 61, 43);
		frame.getContentPane().add(lblUser);
		
		lblPassword.setBounds(113, 131, 103, 49);
		lblPassword.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/Password-50.png")));
		frame.getContentPane().add(lblPassword);
		
		txtuser = new JTextField();
		txtuser.setBounds(184, 86, 90, 26);
		lblUser.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/User-50.png")));
		frame.getContentPane().add(txtuser);
		txtuser.setColumns(10);
		
		
		password.setBounds(184, 144, 90, 26);
		frame.getContentPane().add(password);
		
		btnboton = new JButton("");
		
		
		btnboton.setBackground(Color.ORANGE);
		btnboton.setBorderPainted(false);
		btnboton.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/Enter-50.png")));
		btnboton.setForeground(Color.RED);
		btnboton.setBounds(172, 197, 79, 51);
		frame.getContentPane().add(btnboton);

		
	}
	

		
	private void eventos()
	{
		
		btnboton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				
				boolean escorrecto = true;
				
				if(txtuser.getText().isEmpty())
				{
					
					errores+="ERROR:Usuario Vacio \n";
					escorrecto=false;
				}
				if(new String(password.getPassword()).isEmpty())
				{
					
					errores+="ERROR:Password Vacio";
					escorrecto=false;
				}
				if(!escorrecto)
				{
					JOptionPane.showMessageDialog(frame, errores);
				}
				else{
					
					MenuPrincipal menu=new MenuPrincipal();
					menu.getFrame2().setVisible(true);
					frame.setVisible(false);
					
					
				}
				
				
			}
		});
	
		
	
	}


	}

	

