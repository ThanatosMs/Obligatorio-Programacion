package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaLogin extends JFrame {
    private static final long serialVersionUID = 1L;

    private final JPanel panelLogin = new JPanel();
    private JTextField txtUsuarioLogin;
    private JPasswordField txtContraseñaLogin;

    public VentanaLogin() {
        setTitle("Inicio");
        setBounds(100, 100, 548, 588);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Configuración del panel de login
        panelLogin.setBounds(0, 0, 534, 551);
        getContentPane().add(panelLogin);
        panelLogin.setLayout(null);
        panelLogin.setBackground(new Color(255, 255, 255, 150));

        // Panel para elementos internos
        JPanel panelCosas = new JPanel();
        panelCosas.setBounds(82, 39, 361, 458);
        panelLogin.add(panelCosas);
        panelCosas.setLayout(null);
        panelCosas.setBackground(new Color(255, 255, 255, 150));

        // Etiqueta de bienvenida
        JLabel labelBienvenida = new JLabel("Bienvenido");
        labelBienvenida.setFont(new Font("Tahoma", Font.PLAIN, 18));
        labelBienvenida.setBounds(89, 29, 177, 30);
        panelCosas.add(labelBienvenida);
        labelBienvenida.setHorizontalAlignment(SwingConstants.CENTER);

        // Campos de usuario y contraseña
        txtContraseñaLogin = new JPasswordField();
        txtContraseñaLogin.setBounds(51, 280, 273, 30);
        panelCosas.add(txtContraseñaLogin);

        txtUsuarioLogin = new JTextField();
        txtUsuarioLogin.setBounds(51, 180, 271, 30);
        panelCosas.add(txtUsuarioLogin);
        txtUsuarioLogin.setColumns(10);

        // Etiquetas de usuario y contraseña
        JLabel labelContraseña = new JLabel("Ingrese su contraseña");
        labelContraseña.setBounds(103, 239, 163, 30);
        panelCosas.add(labelContraseña);
        labelContraseña.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelUsuario = new JLabel("Ingrese su usuario");
        labelUsuario.setBackground(new Color(255, 255, 255));
        labelUsuario.setBounds(103, 129, 163, 30);
        panelCosas.add(labelUsuario);
        labelUsuario.setHorizontalAlignment(SwingConstants.CENTER);

        // Botón de inicio de sesión
        JButton btnSiguienteLogin = new JButton("Iniciar Sesión");
        btnSiguienteLogin.setBounds(109, 351, 140, 23);
        panelCosas.add(btnSiguienteLogin);

        // Configuración del fondo
        JLabel background_1 = new JLabel(new ImageIcon(VentanaLogin.class.getResource("/Images/bmo.jpg")));
        background_1.setBounds(0, -34, 566, 606);
        panelLogin.add(background_1);

        // Acción al hacer clic en el botón
        btnSiguienteLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic en el botón, se crea una instancia de VentanaPrincipal
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                ventanaPrincipal.setVisible(true);
                dispose();
            }
        });

        setVisible(true);  
    }
    
    
  // public void comprobarContraseña(String str) {
    //	for(int i == ; i<5; i++) {
    	//	System.out.println( "funco");
    	//}
   // }
    
}
