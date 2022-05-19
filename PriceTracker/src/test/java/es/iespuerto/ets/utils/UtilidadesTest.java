package es.iespuerto.ets.utils;

import es.iespuerto.ets.modelo.Premium;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import static es.iespuerto.ets.utils.Utilidades.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UtilidadesTest {

    @Test
    void leerClienteTest() throws FileNotFoundException, URISyntaxException {
        assertEquals(10, leerCliente("Clientes.txt").size(), "El fichero no se ha leído correctamente.");
    }

    @Test
    void leerProductosTest() throws FileNotFoundException, URISyntaxException {
        assertEquals(10, leerProductos("Productos.txt").size(), "El fichero no se ha leído correctamente.");
    }

    @Test
    void leerCentroTest() throws FileNotFoundException, URISyntaxException {
        assertEquals(10, leerCentro("Centros.txt").size(), "El fichero no se ha leído correctamente.");
    }

    @Test
    void leerPremiumTest() throws FileNotFoundException, URISyntaxException {
        List<Premium> premium = leerPremium("Premium.txt");
        assertEquals(10, leerPremium("Premium.txt").size(), "El fichero no se ha leído correctamente.");
    }

    @Test
    void obtenerPathFicheroTest() throws URISyntaxException {
        String path = String.valueOf(Paths.get(Objects.requireNonNull(getClass().getClassLoader().getResource("Centros.txt")).toURI()).toFile());
        assertEquals(path, obtenerPathFichero("Centros.txt"), "No se ha obtenido el path del fichero correctamente.");
    }

    @Test
    void obtenerPathFicheroTestNull() throws URISyntaxException {
        assertNull(obtenerPathFichero("a.txt"), "El path del fichero es correcto.");
    }
}