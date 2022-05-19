package es.iespuerto.ets.modelo;

import static es.iespuerto.ets.controlador.Localizar.producto;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Clase para almacenar los centros.
 *
 * @author Denisse y Kevin
 */

public class Centro {

    private String nombre;
    private String cif;
    private String localizacion;

    /**
     * Constructor de la clase para almacenar centros.
     *
     * @param nombre       nombre del centro.
     * @param cif          cif de la empresa.
     * @param localizacion localización del centro.
     */
    public Centro(String nombre, String cif, String localizacion) {
        this.nombre = nombre;
        this.cif = cif;
        this.localizacion = localizacion;
    }


    /**
     * Crea un nuevo producto, si no existe, y lo agrega a la lista de productos.
     *
     * @param nombreProducto El nombre del producto.
     * @param codigo         El codigo del producto.
     * @param precio         precio del producto
     * @return True si se ha publicado; false de lo contrario.
     * @throws URISyntaxException    Exception por la URL mal formada
     * @throws FileNotFoundException Exception por no encontrar fichero
     */
    public boolean publicar(String nombreProducto, int codigo, double precio) throws FileNotFoundException, URISyntaxException {
        if (producto(codigo) == null) {
            new Producto(nombreProducto, codigo, precio);
            return true;
        } else {
            return false;
        }
    }

    public String getCif() {
        return cif;
    }

    public String getLocalizacion() {
        return localizacion;
    }

}
