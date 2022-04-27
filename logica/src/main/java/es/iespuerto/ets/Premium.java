package es.iespuerto.ets;

/**
 * Clase para almacenar los clientes
 * 
 * @see BuscarProducto.
 * @author Denisse y Kevin
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
     */
    public Premium(String nombre, String apellido, String correo, String login, String password) {
        super(nombre, apellido, correo, login, password);
    }

    /**
     * Método para almacenar el tipo de pago y el plan que contrata el cliente.
     * 
     * @param pago tipo de pago: transferencia, visa, paypal.
     * @param plan tipo de plan mensual o anual.
     */
    public void suscribir(String pago, String plan) {
        this.pago = pago;
        this.plan = plan;
    }
}
