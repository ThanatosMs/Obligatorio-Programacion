package modelo;
import javax.swing.JOptionPane;
import vista.VentanaPrincipal;
import java.io.Serializable;


public class Usuario implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cedula;
	private String nombre;
	private String apellido;
	private String rol;
	
	public Usuario(int cedula, String nombre, String apellido, String rol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
    }
	
	public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
    public void registrarUsuario() {
        //lógica específica para registrar un usuario
        // dependiendo de su rol mostrar mensajes, interactuar con la base de datos, etc.
        System.out.println("Usuario registrado: " + nombre + " " + apellido + ", Rol: " + rol);
    }



	
	
	
	

}
	
