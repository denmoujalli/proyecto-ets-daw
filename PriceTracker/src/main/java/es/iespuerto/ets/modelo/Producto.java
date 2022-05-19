package es.iespuerto.ets.modelo;

/**
 * Clase para almacenar los producto.
 *
 * @author Denisse y Kevin
 */
public class Producto {

    private String nombre;
    private int cod;
    private double precio;


    public Producto(String nombre, int cod, double precio) {
        this.nombre = nombre;
        this.cod = cod;
        this.precio = precio;
    }

    public int getCod() {
        return cod;
    }

    @Override
    public boolean equals(Object producto) {
        if (producto == null || producto.getClass() != Producto.class) {
            return false;
        }
        return nombre.equals(((Producto) producto).nombre) &&
                cod == ((Producto) producto).cod &&
                precio == ((Producto) producto).precio;
    }
}
