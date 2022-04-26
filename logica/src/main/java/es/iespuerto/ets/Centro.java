package es.iespuerto.ets;

/**
 * Clase para almacenar los centros.
 *  @author Denisse y Kevin
 */

public class Centro {
    
    private String nombre;
    private String cif;
    private String localizacion;

    /**
     * Constructor de la clase para almacenar centros.
     * @param nombre nombre del centro.
     * @param cif  cif de la empresa.
     * @param localizacion localización del centro.
     */
    public Centro(String nombre, String cif, String localizacion) {
        this.nombre = nombre;
        this.cif = cif;
        this.localizacion = localizacion;
    }

    /**
     * Método para publicar productos.
     * @param nombreProducto nombre del producto.
     * @param precio precio del producto.
     */
    public void publicar(String nombreProducto, double precio) {

    }
    /**
     * Método para obtener el nombre del centro.
     * @return nombre del centro.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del centro.
     * @param nombre nombre de la empresa.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el cif del centro.
     * @return cif del centro.
     */
    public String getCif() {
        return cif;
    }

    /**
     * Método para establecer el cif del centro.
     * @param cif cif del centro.
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * Método para obtener la localiozación del centro.
     * @return localización del centro.
     */
    public String getLocalizacion() {
        return localizacion;
    }

    /**
     * Método para establecer la localización del centro.
     * @param localizacion
     */
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    
}
