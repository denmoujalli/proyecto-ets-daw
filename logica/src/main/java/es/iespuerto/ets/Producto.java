package es.iespuerto.ets;

/**
 * Clase para almacenar los productos.
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
