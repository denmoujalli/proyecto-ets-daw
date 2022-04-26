package es.iespuerto.ets;

/**
 * Clase para almacenar los clientew no premium.
 * @see BuscarProducto. 
 * @author Denisse y Kevin
 */

public class Cliente {
    
    private String nombre;
    private String apellido;
    private String correo;
    private String login;
    private String password;

    /**
     * Constructor de la clase Cliente.
     * @param nombre nombre del cliente.
     * @param apellido apellido del cliente.
     * @param correo correo electrónico del cliente.
     * @param login login del cliente.
     * @param password contrasenia del cliente.
     */
    public Cliente(String nombre, String apellido, String correo, String login, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.login = login;
        this.password = password;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
