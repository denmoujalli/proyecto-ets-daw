package es.iespuerto.ets.controlador;

import es.iespuerto.ets.modelo.Centro;
import es.iespuerto.ets.modelo.Producto;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static es.iespuerto.ets.utils.Utilidades.leerCentro;
import static es.iespuerto.ets.utils.Utilidades.leerProductos;

/**
 * Clase para buscar producto dentro de la aplicación.
 *
 * @author Denisse y Kevin
 */

public class Localizar {


    /**
     * Toma como parametro un codigo y devuelve el producto con ese codigo.
     *
     * @param cod El codigo del producto a buscar.
     * @return El producto que tiene el mismo codigo que el que se producto.
     */
    public static Producto producto(int cod) throws FileNotFoundException, URISyntaxException {
        for (Producto producto : leerProductos("Productos.txt")) {
            if (producto.getCod() == cod) {
                return producto;
            }
        }
        return null;
    }


    /**
     * Toma como parametro un CIF y devuelve la ubicacion del centro con ese CIF.
     *
     * @param cif El CIF del centro que quieres encontrar.
     * @return La ubicacion del centro.
     */
    public static String centro(String cif) throws FileNotFoundException, URISyntaxException {
        for (Centro centro : leerCentro("Centros.txt")) {
            if (centro.getCif().equals(cif)) {
                return centro.getLocalizacion();
            }
        }
        return null;
    }
}
