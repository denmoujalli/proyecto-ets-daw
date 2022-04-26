package es.iespuerto.ets;

/**
 * Clase para almacenar los clientes
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

    /**
     * Método para obtener el nombre del cliente.
     * @return nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del cliente.
     * @param nombre nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Métopdo para obtener el apellido del cliente.
     * @return apellido del cliente.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método para establecer el apellido del cliente.
     * @param apellido apellido del cliente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método para obtener el correo electrónico del cliente.
     * @return correo electrónico del cliente.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método para establecer el co9rreo electrónico del cliente.
     * @param correo correo electrónico del cliente.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método para obtener el login del cliente.
     * @return login del cliente.
     */
    public String getLogin() {
        return login;
    }

    /**
     * Método para establecer el login del cliente.
     * @param login login del cliente.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Método para obtener la contraseña del cliente.
     * @return contraseña del cliente.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Método para establecer la contraseña del cliente.
     * @param password contraseña del cliente.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    
}
