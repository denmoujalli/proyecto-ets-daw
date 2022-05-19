package es.iespuerto.ets.controlador;

import es.iespuerto.ets.modelo.Centro;
import es.iespuerto.ets.modelo.Producto;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LocalizarProductoTest {

    @Test
    void buscaTest() throws FileNotFoundException, URISyntaxException {
        Producto queso = new Producto("Queso",10,1.87);
        Localizar productos = new Localizar();
        assertEquals(queso, productos.producto(10));
    }

    @Test
    void buscaTestNull() throws FileNotFoundException, URISyntaxException {
        Localizar productos = new Localizar();
        assertNull(productos.producto(33));
    }

    @Test
    void localizarCentroTest() throws FileNotFoundException, URISyntaxException {
        Centro isramco = new Centro("Isramco", "5-400","4552 Sachs Court");
        Localizar centros = new Localizar();
        assertEquals(isramco.getLocalizacion(), centros.centro("5-400"));
    }

    @Test
    void localizarCentroNull() throws FileNotFoundException, URISyntaxException {
        Localizar centros = new Localizar();
        assertNull(centros.centro("123456"));
    }
}