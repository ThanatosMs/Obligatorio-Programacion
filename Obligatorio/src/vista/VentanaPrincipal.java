package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textFieldNombre;
    private JTextField textFieldApellido;
    private JTextField textFieldCedula;
    private JTextField textField_1;
    private JComboBox<String> comboBoxRol;

    public VentanaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 824, 549);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panelOpciones = new JPanel();
        panelOpciones.setBounds(0, 0, 187, 512);
        contentPane.add(panelOpciones);
        panelOpciones.setLayout(null);

        JPanel panelContenido = new JPanel();
        panelContenido.setBounds(188, 0, 622, 512);
        contentPane.add(panelContenido);
        panelContenido.setLayout(null);
        
        JPanel panelBienvenida = new JPanel();
        panelBienvenida.setBounds(0, 0, 622, 512);
        panelContenido.add(panelBienvenida);
        panelBienvenida.setLayout(null);
        
        JLabel lblNewLabel_5 = new JLabel("New label");
        lblNewLabel_5.setBounds(286, 5, 49, 14);
        panelBienvenida.add(lblNewLabel_5);

        JPanel panelUsuario = new JPanel();
        panelUsuario.setBounds(0, 0, 622, 512);
        panelContenido.add(panelUsuario);
        panelUsuario.setLayout(null);
        panelUsuario.setVisible(false);

        JPanel panelRegistrarDevolución = new JPanel();
        panelRegistrarDevolución.setLayout(null);
        panelRegistrarDevolución.setBounds(0, 317, 622, 195);
        panelUsuario.add(panelRegistrarDevolución);

        JPanel panelTitulo2Prestamo = new JPanel();
        panelTitulo2Prestamo.setLayout(null);
        panelTitulo2Prestamo.setBackground(Color.DARK_GRAY);
        panelTitulo2Prestamo.setBounds(0, 0, 628, 47);
        panelRegistrarDevolución.add(panelTitulo2Prestamo);

        JLabel lblNewLabel_4 = new JLabel("Eliminar Usuario");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setForeground(Color.RED);
        lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 21));
        lblNewLabel_4.setBackground(Color.ORANGE);
        lblNewLabel_4.setBounds(141, 8, 345, 31);
        panelTitulo2Prestamo.add(lblNewLabel_4);

        JButton btnNewButton_2_1 = new JButton("Baja Usuario");
        btnNewButton_2_1.setFont(new Font("Arial", Font.BOLD, 11));
        btnNewButton_2_1.setBounds(333, 120, 177, 35);
        panelRegistrarDevolución.add(btnNewButton_2_1);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(38, 119, 241, 35);
        panelRegistrarDevolución.add(textField_1);

        JLabel lblNewLabel_3_1_1_2 = new JLabel("Cedula de Identidad");
        lblNewLabel_3_1_1_2.setBounds(38, 91, 141, 16);
        panelRegistrarDevolución.add(lblNewLabel_3_1_1_2);

        JPanel panelTituloPrestamo = new JPanel();
        panelTituloPrestamo.setLayout(null);
        panelTituloPrestamo.setBackground(Color.DARK_GRAY);
        panelTituloPrestamo.setBounds(0, 0, 627, 50);
        panelUsuario.add(panelTituloPrestamo);

        JLabel lblRegistrarPrestamo = new JLabel("Registrar Usuario");
        lblRegistrarPrestamo.setHorizontalAlignment(SwingConstants.CENTER);
        lblRegistrarPrestamo.setForeground(Color.RED);
        lblRegistrarPrestamo.setFont(new Font("Arial", Font.BOLD, 21));
        lblRegistrarPrestamo.setBackground(Color.ORANGE);
        lblRegistrarPrestamo.setBounds(141, 8, 345, 31);
        panelTituloPrestamo.add(lblRegistrarPrestamo);

        JLabel lblNewLabel_2_1 = new JLabel("Apellido");
        lblNewLabel_2_1.setBounds(22, 237, 153, 16);
        panelUsuario.add(lblNewLabel_2_1);

        JLabel lblNewLabel_3_1 = new JLabel("Nombre ");
        lblNewLabel_3_1.setBounds(22, 159, 141, 16);
        panelUsuario.add(lblNewLabel_3_1);

        textFieldNombre = new JTextField();
        textFieldNombre.setColumns(10);
        textFieldNombre.setBounds(22, 194, 241, 25);
        panelUsuario.add(textFieldNombre);

        textFieldApellido = new JTextField();
        textFieldApellido.setColumns(10);
        textFieldApellido.setBounds(22, 265, 241, 25);
        panelUsuario.add(textFieldApellido);

        textFieldCedula = new JTextField();
        textFieldCedula.setColumns(10);
        textFieldCedula.setBounds(22, 115, 241, 25);
        panelUsuario.add(textFieldCedula);

        JLabel lblNewLabel_3_1_1 = new JLabel("Cedula de Identidad");
        lblNewLabel_3_1_1.setBounds(22, 87, 141, 16);
        panelUsuario.add(lblNewLabel_3_1_1);

        comboBoxRol = new JComboBox<String>();
        comboBoxRol.setBounds(359, 152, 193, 31);
        panelUsuario.add(comboBoxRol);
        comboBoxRol.addItem("");
        comboBoxRol.addItem("Docente");
        comboBoxRol.addItem("Estudiante");
        comboBoxRol.addItem("Funcionario");
        comboBoxRol.addItem("Admin");

        JLabel lblNewLabel_3_1_1_1 = new JLabel("Rol");
        lblNewLabel_3_1_1_1.setBounds(359, 119, 141, 16);
        panelUsuario.add(lblNewLabel_3_1_1_1);

        JButton btnRegistrarUsuario = new JButton("Registrar");
        btnRegistrarUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores ingresados en los campos
                String cedulaText = textFieldCedula.getText();
                if (esNumero(cedulaText)) {
                    int cedula = Integer.parseInt(cedulaText);
                    String nombre = textFieldNombre.getText();
                    String apellido = textFieldApellido.getText();
                    String rol = (String) comboBoxRol.getSelectedItem();
                    if (rol.equals("Admin")) {
                        // Si el rol es Admin, mostrar la ventana emergente para las credenciales
                        pedirCredencialesAdmin();
                        // Limpiar campos después de mostrar la ventana emergente
                        limpiarCamposUsuario();
                    }
                } else {
                    // Manejar el caso en el que la cédula no es un número
                    JOptionPane.showMessageDialog(null, "La cédula debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnRegistrarUsuario.setBounds(359, 205, 193, 55);
        btnRegistrarUsuario.setBounds(359, 205, 193, 55);
        panelUsuario.add(btnRegistrarUsuario);

        JPanel panelDispositivo = new JPanel();
        panelDispositivo.setBounds(0, 0, 627, 512);
        panelContenido.add(panelDispositivo);
        panelDispositivo.setLayout(null);
        panelDispositivo.setVisible(false);

        JPanel dispositivoBaja = new JPanel();
        dispositivoBaja.setBounds(0, 320, 615, 192);
        panelDispositivo.add(dispositivoBaja);
        dispositivoBaja.setLayout(null);

        JPanel panelTitulo = new JPanel();
        panelTitulo.setBounds(0, 0, 627, 47);
        dispositivoBaja.add(panelTitulo);
        panelTitulo.setBackground(Color.DARK_GRAY);
        panelTitulo.setLayout(null);

        JLabel lblNewLabel = new JLabel("Registrar devolución");
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 21));
        lblNewLabel.setBackground(Color.ORANGE);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(141, 8, 345, 31);
        panelTitulo.add(lblNewLabel);

        JComboBox comboBoxNumDispositivo = new JComboBox();
        comboBoxNumDispositivo.setBounds(99, 91, 203, 39);
        dispositivoBaja.add(comboBoxNumDispositivo);

        JButton btnNewButton_2 = new JButton("Dar de baja el dispositivo");
        btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 11));
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Resto del código...
            }
        });
        btnNewButton_2.setBounds(337, 93, 177, 35);
        dispositivoBaja.add(btnNewButton_2);

        JPanel panelTitulo_1 = new JPanel();
        panelTitulo_1.setLayout(null);
        panelTitulo_1.setBackground(Color.DARK_GRAY);
        panelTitulo_1.setBounds(0, 0, 627, 47);
        panelDispositivo.add(panelTitulo_1);

        JLabel lblAltaDeDispositivo = new JLabel("Alta de Dispositivo");
        lblAltaDeDispositivo.setHorizontalAlignment(SwingConstants.CENTER);
        lblAltaDeDispositivo.setForeground(Color.RED);
        lblAltaDeDispositivo.setFont(new Font("Arial", Font.BOLD, 21));
        lblAltaDeDispositivo.setBackground(Color.ORANGE);
        lblAltaDeDispositivo.setBounds(141, 8, 345, 31);
        panelTitulo_1.add(lblAltaDeDispositivo);

        JComboBox comboBoxEstado = new JComboBox();
        comboBoxEstado.setBounds(42, 100, 241, 25);
        panelDispositivo.add(comboBoxEstado);
        comboBoxEstado.addItem("");
        comboBoxEstado.addItem("Excelente");
        comboBoxEstado.addItem("Lento");
        comboBoxEstado.addItem("Dañado");
        comboBoxEstado.addItem("Necesita reparacion");

        JTextField textField = new JTextField();
        textField.setBounds(42, 269, 241, 25);
        panelDispositivo.add(textField);
        textField.setColumns(10);

        JComboBox comboBoxSistema = new JComboBox();
        comboBoxSistema.setBounds(42, 181, 241, 25);
        panelDispositivo.add(comboBoxSistema);
        comboBoxSistema.addItem("");
        comboBoxSistema.addItem("Windows");
        comboBoxSistema.addItem("Linux");
        comboBoxSistema.addItem("Ambos");

        JButton btnNewButton_3 = new JButton("New button");
        btnNewButton_3.setBounds(383, 113, 167, 147);
        panelDispositivo.add(btnNewButton_3);

        JLabel lblNewLabel_1 = new JLabel("Sistema");
        lblNewLabel_1.setBounds(42, 153, 57, 16);
        panelDispositivo.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Estado");
        lblNewLabel_2.setBounds(42, 76, 57, 16);
        panelDispositivo.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Numero de dispositivo");
        lblNewLabel_3.setBounds(42, 241, 141, 16);
        panelDispositivo.add(lblNewLabel_3);
        
        JPanel panelPrestamo = new JPanel();
        panelPrestamo.setBounds(0, 0, 10, 10);
        panelContenido.add(panelPrestamo);

        JButton btnPrestamo = new JButton("Prestamo");
        btnPrestamo.setIcon(new ImageIcon(""));
        btnPrestamo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            }
        });
        btnPrestamo.setBounds(0, 0, 186, 84);
        panelOpciones.add(btnPrestamo);

        JButton btnDispositivo = new JButton("Dispositivo");
        btnDispositivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelDispositivo.setVisible(true);
                panelUsuario.setVisible(false);
            }
        });
        btnDispositivo.setBounds(0, 85, 186, 84);
        panelOpciones.add(btnDispositivo);

        JButton btnUsuario = new JButton("Usuarios");
        btnUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelUsuario.setVisible(true);
                panelDispositivo.setVisible(false);
            }
        });
        btnUsuario.setBounds(0, 170, 186, 84);
        panelOpciones.add(btnUsuario);

        JButton btnNewButton_1_4 = new JButton("");
        btnNewButton_1_4.setBounds(0, 378, 186, 71);
        panelOpciones.add(btnNewButton_1_4);

        JButton btnNewButton_1_5 = new JButton("");
        btnNewButton_1_5.setBounds(0, 448, 186, 64);
        panelOpciones.add(btnNewButton_1_5);
    }

    private void pedirCredencialesAdmin() {
        JDialog dialog = new JDialog(this, "Credenciales de Administrador", true);
        dialog.setSize(300, 150);
        dialog.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtNombreAdmin = new JTextField();
        JPasswordField txtContraseñaAdmin = new JPasswordField();

        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombreAdmin);
        panel.add(new JLabel("Contraseña:"));
        panel.add(txtContraseñaAdmin);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombreAdmin = txtNombreAdmin.getText();
                String contraseñaAdmin = new String(txtContraseñaAdmin.getPassword());

                // Agrega mensajes de depuración para verificar que se están obteniendo los valores
                System.out.println("Nombre: " + nombreAdmin);
                System.out.println("Contraseña: " + contraseñaAdmin);

                // Resto del código...
                dialog.dispose();
            }
        });
        dialog.getContentPane().add(panel, BorderLayout.CENTER);
        dialog.getContentPane().add(btnAceptar, BorderLayout.SOUTH);
        dialog.setLocationRelativeTo(this);

        // Agrega un mensaje de depuración para verificar que la ventana se está mostrando
        System.out.println("Mostrando ventana de credenciales de administrador.");

        dialog.setVisible(true);
    }


    private boolean esNumero(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private void limpiarCamposUsuario() {
            SwingUtilities.invokeLater(() -> {
            textFieldCedula.setText("");
            textFieldNombre.setText("");
            textFieldApellido.setText("");
            comboBoxRol.setSelectedItem("");
        });
    }
 }
