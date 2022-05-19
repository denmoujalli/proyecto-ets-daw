package es.iespuerto.ets.modelo;

import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CentroTest {

    @Test
    void publicarTest() throws FileNotFoundException, URISyntaxException {
        Centro copart = new Centro("Copart","17-010","30485 Toban Park");
        assertTrue(copart.publicar("Jamón", 11, 4.35), "El producto no se ha publicado porque ya existe.");
    }

    @Test
    void publicarTestFalse() throws FileNotFoundException, URISyntaxException {
        Centro orbotech = new Centro("Orbotech Ltd", "13-200", "3197 Moulton Terrace");
        assertFalse(orbotech.publicar("Queso", 10, 1.87),
                "El producto se ha publicado correctamente.");
    }
}