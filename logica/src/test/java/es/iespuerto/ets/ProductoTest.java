package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {
    Producto libro;

    @BeforeEach
    public void testProducto() {
        String nombre = "Don Quijote";
        int cod = 12345;
        double precio = 20.45;

        libro = new Producto(nombre, cod, precio);
    }

    @Test
    public void testGetNombre() {
        assertEquals("Don Quijote", libro.getNombre());
    }

    @Test
    public void testGetCod() {
        assertEquals(12345, libro.getCod());
    }

    @Test
    public void testGetPrecio() {
        assertEquals(20.45, libro.getPrecio());
    }
}
