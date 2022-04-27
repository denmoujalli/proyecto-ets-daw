package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CentroTest {

    Centro carrefour;

    @BeforeEach
    public void testCentro() {
        String nombre = "Carrefour";
        String cif = "321383";
        String localizacion = "Avenida La Salle";
        carrefour = new Centro(nombre, cif, localizacion);
    }

    @Test
    public void testGetNombre() {
        assertEquals("Carrefour", carrefour.getNombre());
    }

    @Test
    public void testGetCif() {
        assertEquals("321383", carrefour.getCif());
    }

    @Test
    public void testGetLocalizacion() {
        assertEquals("Avenida La Salle", carrefour.getLocalizacion());
    }

    @Test
    public void testPublicar() {
    }
}
