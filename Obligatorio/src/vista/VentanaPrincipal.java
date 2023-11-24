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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldCedula;
	private JTextField textField_1;
	private JComboBox<String> comboBoxRol;
	private JTable tablaDispositivos;
	private DefaultTableModel modelo;
	private JTextField textField_3;
	private JTextField textFieldCedulaPrestamo;


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

		JPanel panelPrestamo = new JPanel();
		panelPrestamo.setBounds(0, 0, 622, 512);
		panelContenido.add(panelPrestamo);
		panelPrestamo.setLayout(null);
		panelPrestamo.setVisible(false);

		JPanel panelTituloIngresarPrestamo = new JPanel();
		panelTituloIngresarPrestamo.setLayout(null);
		panelTituloIngresarPrestamo.setBackground(new Color(150, 240, 186, 255));
		panelTituloIngresarPrestamo.setBounds(0, 0, 627, 47);
		panelPrestamo.add(panelTituloIngresarPrestamo);

		JLabel lblPrestamo = new JLabel("IngresarPrestamo");
		lblPrestamo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrestamo.setForeground(new Color(255, 255, 255));
		lblPrestamo.setFont(new Font("Arial", Font.BOLD, 21));
		lblPrestamo.setBackground(Color.ORANGE);
		lblPrestamo.setBounds(141, 8, 345, 31);
		panelTituloIngresarPrestamo.add(lblPrestamo);
		
		JPanel panelIngresarPrestamo = new JPanel();
		panelIngresarPrestamo.setBounds(0, 366, 622, 146);
		panelPrestamo.add(panelIngresarPrestamo);
		panelIngresarPrestamo.setLayout(null);
		
		textFieldCedulaPrestamo = new JTextField();
		textFieldCedulaPrestamo.setColumns(10);
		textFieldCedulaPrestamo.setBounds(59, 62, 195, 39);
		panelIngresarPrestamo.add(textFieldCedulaPrestamo);
		
		JLabel lblCedulaDelSolicitante_1 = new JLabel("Cedula del solicitante");
		lblCedulaDelSolicitante_1.setBounds(59, 26, 160, 24);
		panelIngresarPrestamo.add(lblCedulaDelSolicitante_1);
		
		JButton btnIngresarPrestamo_1 = new JButton("Ingresar Prestamo");
		btnIngresarPrestamo_1.setBounds(340, 52, 195, 42);
		panelIngresarPrestamo.add(btnIngresarPrestamo_1);
		
		JLabel lblFondoPrestamo = new JLabel("");
		lblFondoPrestamo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Images/fondo.jpg")));
		lblFondoPrestamo.setBounds(0, 0, 622, 146);
		panelIngresarPrestamo.add(lblFondoPrestamo);


		JPanel panelBienvenida = new JPanel();
		panelBienvenida.setBounds(0, 0, 622, 512);
		panelContenido.add(panelBienvenida);
		panelBienvenida.setLayout(null);

		JLabel lblCopyright = new JLabel("Created by: Ibai Mujica, Gus Camarote");
		lblCopyright.setIcon(new ImageIcon("C:\\Users\\mujic\\eclipse-workspace\\Obligatorio\\imagenesProyecto\\copyright-symbol.png"));
		lblCopyright.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCopyright.setBounds(64, 487, 250, 25);
		panelBienvenida.add(lblCopyright);

		JPanel panelOpacidad = new JPanel();
		panelOpacidad.setBounds(0, 0, 622, 124);
		panelBienvenida.add(panelOpacidad);
		panelOpacidad.setBackground(new Color(255, 255, 255, 130));
		panelOpacidad.setLayout(null);

		JLabel lblBienvenida = new JLabel("");
		lblBienvenida.setIcon(
				new ImageIcon(VentanaPrincipal.class.getResource("/Images/Bienvenido.png")));
		lblBienvenida.setBounds(46, 21, 528, 73);
		panelOpacidad.add(lblBienvenida);

		JLabel backgroundBienvenida = new JLabel("New label");
		backgroundBienvenida.setIcon(
				new ImageIcon(VentanaPrincipal.class.getResource("/Images/finnyjake.jpg")));
		backgroundBienvenida.setBounds(0, 0, 622, 512);
		panelBienvenida.add(backgroundBienvenida);

		JPanel panelUsuario = new JPanel();
		panelUsuario.setBounds(0, 0, 622, 512);
		panelContenido.add(panelUsuario);
		panelUsuario.setLayout(null);
		panelUsuario.setVisible(false);

		JPanel panelEliminarUsuario = new JPanel();
		panelEliminarUsuario.setLayout(null);
		panelEliminarUsuario.setBounds(0, 317, 622, 195);
		panelUsuario.add(panelEliminarUsuario);

		JPanel panelTituloEliminarUsuario = new JPanel();
		panelTituloEliminarUsuario.setLayout(null);
		panelTituloEliminarUsuario.setBackground(new Color(150, 240, 186, 255));
		panelTituloEliminarUsuario.setBounds(0, 0, 628, 47);
		panelEliminarUsuario.add(panelTituloEliminarUsuario);

		JLabel lblNewLabel_4 = new JLabel("Eliminar Usuario");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel_4.setBackground(Color.ORANGE);
		lblNewLabel_4.setBounds(141, 8, 345, 31);
		panelTituloEliminarUsuario.add(lblNewLabel_4);

		JButton btnNewButton_2_1 = new JButton("Baja Usuario");
		btnNewButton_2_1.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_2_1.setBounds(333, 120, 177, 35);
		panelEliminarUsuario.add(btnNewButton_2_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(38, 119, 241, 35);
		panelEliminarUsuario.add(textField_1);

		JLabel lblNewLabel_3_1_1_2 = new JLabel("Cedula de Identidad");
		lblNewLabel_3_1_1_2.setBounds(38, 91, 141, 16);
		panelEliminarUsuario.add(lblNewLabel_3_1_1_2);

		JLabel lblFondo_1 = new JLabel("");
		lblFondo_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Images/fondo.jpg")));
		lblFondo_1.setBounds(0, 48, 622, 147);
		panelEliminarUsuario.add(lblFondo_1);

		JPanel panelTituloPrestamo = new JPanel();
		panelTituloPrestamo.setLayout(null);
		panelTituloPrestamo.setBackground(new Color(150, 240, 186, 255));
		panelTituloPrestamo.setBounds(0, 0, 627, 50);
		panelUsuario.add(panelTituloPrestamo);

		JLabel lblRegistrarPrestamo = new JLabel("Registrar Usuario");
		lblRegistrarPrestamo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrarPrestamo.setForeground(new Color(255, 255, 255));
		lblRegistrarPrestamo.setFont(new Font("Arial", Font.BOLD, 21));
		lblRegistrarPrestamo.setBackground(Color.ORANGE);
		lblRegistrarPrestamo.setBounds(141, 8, 345, 31);
		panelTituloPrestamo.add(lblRegistrarPrestamo);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(22, 237, 153, 16);
		panelUsuario.add(lblApellido);

		JLabel lblNombre = new JLabel("Nombre ");
		lblNombre.setBounds(22, 159, 141, 16);
		panelUsuario.add(lblNombre);

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

		JLabel lblCedula = new JLabel("Cedula de Identidad");
		lblCedula.setBounds(22, 87, 141, 16);
		panelUsuario.add(lblCedula);

		comboBoxRol = new JComboBox<String>();
		comboBoxRol.setBounds(359, 152, 193, 31);
		panelUsuario.add(comboBoxRol);
		comboBoxRol.addItem("");
		comboBoxRol.addItem("Estudiante");
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
					JOptionPane.showMessageDialog(null, "La cédula debe ser un número válido", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnRegistrarUsuario.setBounds(359, 205, 193, 55);
		btnRegistrarUsuario.setBounds(359, 205, 193, 55);
		panelUsuario.add(btnRegistrarUsuario);

		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Images/fondo.jpg")));
		lblFondo.setBounds(0, 50, 622, 266);
		panelUsuario.add(lblFondo);

		JPanel panelDispositivo = new JPanel();
		panelDispositivo.setBounds(0, 0, 627, 512);
		panelContenido.add(panelDispositivo);
		panelDispositivo.setLayout(null);
		panelDispositivo.setVisible(false);

		JPanel panelTituloAltaDispositivo = new JPanel();
		panelTituloAltaDispositivo.setLayout(null);
		panelTituloAltaDispositivo.setBackground(new Color(150, 240, 186, 255));
		panelTituloAltaDispositivo.setBounds(0, 0, 627, 47);
		panelDispositivo.add(panelTituloAltaDispositivo);

		JLabel lblAltaDeDispositivo = new JLabel("Alta de Dispositivo");
		lblAltaDeDispositivo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltaDeDispositivo.setForeground(new Color(255, 255, 255));
		lblAltaDeDispositivo.setFont(new Font("Arial", Font.BOLD, 21));
		lblAltaDeDispositivo.setBackground(Color.ORANGE);
		lblAltaDeDispositivo.setBounds(141, 8, 345, 31);
		panelTituloAltaDispositivo.add(lblAltaDeDispositivo);

		JPanel panelTituloBajaDispositivo = new JPanel();
		panelTituloBajaDispositivo.setBounds(0, 291, 627, 47);
		panelDispositivo.add(panelTituloBajaDispositivo);
		panelTituloBajaDispositivo.setBackground(new Color(150, 240, 186, 255));
		panelTituloBajaDispositivo.setLayout(null);

		JLabel lblDevolucion = new JLabel("Baja de Dispositivo");
		lblDevolucion.setBounds(146, 9, 345, 31);
		lblDevolucion.setForeground(new Color(255, 255, 255));
		lblDevolucion.setFont(new Font("Arial", Font.BOLD, 21));
		lblDevolucion.setBackground(Color.ORANGE);
		lblDevolucion.setHorizontalAlignment(SwingConstants.CENTER);
		panelTituloBajaDispositivo.add(lblDevolucion);

		JPanel dispositivoBaja = new JPanel();
		dispositivoBaja.setBounds(0, 320, 615, 192);
		panelDispositivo.add(dispositivoBaja);
		dispositivoBaja.setLayout(null);

		JButton btnNewButton_2 = new JButton("Eliminar Dispositivo");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnNewButton_2.setBounds(338, 46, 208, 40);
		dispositivoBaja.add(btnNewButton_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(23, 46, 241, 40);
		dispositivoBaja.add(textField_3);

		JLabel lblNumeroDeDispositivo2 = new JLabel("Numero de dispositivo");
		lblNumeroDeDispositivo2.setBounds(24, 21, 164, 25);
		dispositivoBaja.add(lblNumeroDeDispositivo2);

		JLabel lblFondoVentana_1 = new JLabel("");
		lblFondoVentana_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Images/fondo.jpg")));
		lblFondoVentana_1.setBounds(0, 11, 615, 181);
		dispositivoBaja.add(lblFondoVentana_1);

		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setBounds(42, 87, 241, 25);
		panelDispositivo.add(comboBoxEstado);
		comboBoxEstado.addItem("");
		comboBoxEstado.addItem("Excelente");
		comboBoxEstado.addItem("Lento");
		comboBoxEstado.addItem("Dañado");
		comboBoxEstado.addItem("Necesita reparacion");

		JTextField txtNumeroDeDispositivo = new JTextField();
		txtNumeroDeDispositivo.setBounds(42, 240, 241, 25);
		panelDispositivo.add(txtNumeroDeDispositivo);
		txtNumeroDeDispositivo.setColumns(10);

		JComboBox comboBoxSistema = new JComboBox();
		comboBoxSistema.setBounds(42, 162, 241, 25);
		panelDispositivo.add(comboBoxSistema);
		comboBoxSistema.addItem("");
		comboBoxSistema.addItem("Windows");
		comboBoxSistema.addItem("Linux");
		comboBoxSistema.addItem("Ambos");

		JButton btnAltaDispositivo = new JButton("Ingresar Prestamo");
		btnAltaDispositivo.setBounds(383, 113, 167, 147);
		panelDispositivo.add(btnAltaDispositivo);

		JLabel lblSistemaDispositivo = new JLabel("Sistema");
		lblSistemaDispositivo.setBounds(42, 135, 57, 16);
		panelDispositivo.add(lblSistemaDispositivo);

		JLabel lblEstadoDispositivo = new JLabel("Estado");
		lblEstadoDispositivo.setBounds(42, 60, 57, 16);
		panelDispositivo.add(lblEstadoDispositivo);

		JLabel NumeroDeDispositivo = new JLabel("Numero de dispositivo");
		NumeroDeDispositivo.setBounds(41, 213, 141, 16);
		panelDispositivo.add(NumeroDeDispositivo);

		JLabel lblFondoVentana = new JLabel("");
		lblFondoVentana.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Images/fondo.jpg")));
		lblFondoVentana.setBounds(0, 0, 626, 512);
		panelDispositivo.add(lblFondoVentana);

		modelo = new DefaultTableModel();
		modelo.addColumn("Seleccionar");
		modelo.addColumn("Número");
		modelo.addColumn("Sistema Operativo");
		modelo.addColumn("Estado");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 48, 622, 322);
		panelPrestamo.add(scrollPane);
		JTable tablaDispositivos = new JTable(modelo);
		scrollPane.setViewportView(tablaDispositivos);
		// Llamada al método para inicializar la tabla de dispositivos desde la base de datos
		inicializarTablaDispositivosDesdeBD();

		JButton btnPrestamo = new JButton("Prestamo");
		btnPrestamo.setIcon(new ImageIcon(""));
		btnPrestamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBienvenida.setVisible(false);
				panelDispositivo.setVisible(false);
				panelUsuario.setVisible(false);
				panelPrestamo.setVisible(true);

			}
		});
		btnPrestamo.setBounds(0, 43, 186, 84);
		panelOpciones.add(btnPrestamo);

		JButton btnDispositivo = new JButton("Dispositivo");
		btnDispositivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBienvenida.setVisible(false);
				panelDispositivo.setVisible(true);
				panelUsuario.setVisible(false);
				panelPrestamo.setVisible(false);
			}
		});
		btnDispositivo.setBounds(0, 125, 187, 84);
		panelOpciones.add(btnDispositivo);

		JButton btnUsuario = new JButton("Usuarios");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBienvenida.setVisible(false);
				panelUsuario.setVisible(true);
				panelDispositivo.setVisible(false);
				panelPrestamo.setVisible(false);
			}
		});

		btnUsuario.setBounds(0, 209, 187, 84);
		panelOpciones.add(btnUsuario);

		JButton btnBienvenida = new JButton("Bienvenida");
		btnBienvenida.setBounds(0, 0, 186, 44);
		panelOpciones.add(btnBienvenida);



		JLabel lblBmoChiquito = new JLabel("");
		lblBmoChiquito.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Images/bmochiquito.jpg")));
		lblBmoChiquito.setBounds(-46, 292, 257, 220);
		panelOpciones.add(lblBmoChiquito);

		btnBienvenida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelUsuario.setVisible(false);
				panelDispositivo.setVisible(false);
				panelBienvenida.setVisible(true);
				panelPrestamo.setVisible(false);
			}
		});
	}

	private void inicializarTablaDispositivosDesdeBD() {
		// Aquí puedes agregar el código para obtener los dispositivos de la base de datos
		// y agregarlos al modelo de la tabla.
		// Por ejemplo:
		// modeloTablaDispositivos.addRow(new Object[] { false, "1", "Windows", "Excelente" });
		// modeloTablaDispositivos.addRow(new Object[] { false, "2", "Linux", "Lento" });
		// ...
	}


	private void pedirCredencialesAdmin() {
		JDialog dialog = new JDialog(this, "Credenciales de Administrador");
		dialog.setSize(300, 150);
		dialog.getContentPane().setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1));
		JPasswordField txtContraseñaAdmin = new JPasswordField();

		panel.add(new JLabel("Contraseña:"));
		panel.add(txtContraseñaAdmin);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contraseñaAdmin = new String(txtContraseñaAdmin.getPassword());
				System.out.println("Contraseña: " + contraseñaAdmin);
				dialog.dispose();
			}
		});
		dialog.getContentPane().add(panel, BorderLayout.CENTER);
		dialog.getContentPane().add(btnAceptar, BorderLayout.SOUTH);
		dialog.setLocationRelativeTo(this);
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
		textFieldCedula.setText("");
		textFieldNombre.setText("");
		textFieldApellido.setText("");
		comboBoxRol.setSelectedItem("");
	}
}

