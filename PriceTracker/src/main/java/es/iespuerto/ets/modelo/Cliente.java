package es.iespuerto.ets.modelo;

/**
 * Clase para almacenar los clientes
 *
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
     *
     * @param nombre   nombre del cliente.
     * @param apellido apellido del cliente.
     * @param correo   correo electrónico del cliente.
     * @param login    login del cliente.
     * @param password contrasenia del cliente.
     */
    public Cliente(String nombre, String apellido, String correo, String login, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.login = login;
        this.password = password;
    }
}
