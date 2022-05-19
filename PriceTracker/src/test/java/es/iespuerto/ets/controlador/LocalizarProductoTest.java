package es.iespuerto.ets.controlador;

import es.iespuerto.ets.modelo.Centro;
import es.iespuerto.ets.modelo.Producto;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import static es.iespuerto.ets.controlador.Localizar.centro;
import static es.iespuerto.ets.controlador.Localizar.producto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LocalizarProductoTest {

    @Test
    void buscaTest() throws FileNotFoundException, URISyntaxException {
        Producto queso = new Producto("Queso",10,1.87);
        assertEquals(queso, producto(10));
    }

    @Test
    void buscaTestNull() throws FileNotFoundException, URISyntaxException {
        assertNull(producto(33));
    }

    @Test
    void localizarCentroTest() throws FileNotFoundException, URISyntaxException {
        Centro isramco = new Centro("Isramco", "5-400","4552 Sachs Court");
        assertEquals(isramco.getLocalizacion(), centro("5-400"));
    }

    @Test
    void localizarCentroNull() throws FileNotFoundException, URISyntaxException {
        assertNull(centro("123456"));
    }
}