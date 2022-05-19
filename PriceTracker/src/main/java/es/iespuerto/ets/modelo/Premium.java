package es.iespuerto.ets.modelo;

import es.iespuerto.ets.controlador.Localizar;

/**
 * Clase para almacenar los clientes
 *
 * @author Denisse y Kevin
 * @see Localizar
 */

public class Premium extends Cliente {

    private String pago;
    private String plan;
    private int puntos;

    /**
     * Constructor de la clase que hereda de la clase Cliente.
     *
     * @param nombre   nombre del cliente.
     * @param apellido apellido del cliente.
     * @param correo   correo electrónico del cliente.
     * @param login    login del cliente.
     * @param password contraseña del cliente.
     * @param pago     tipo de pago del cliente.
     * @param plan     tipo de plan del cliente.
     */
    public Premium(String nombre, String apellido, String correo, String login, String password, String pago, String plan) {
        super(nombre, apellido, correo, login, password);
        this.pago = pago;
        this.plan = plan;
    }

}
