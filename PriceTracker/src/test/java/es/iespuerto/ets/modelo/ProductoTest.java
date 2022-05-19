package es.iespuerto.ets.modelo;

import es.iespuerto.ets.controlador.Localizar;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ProductoTest {

    @Test
    void testEqualsTrue() throws FileNotFoundException, URISyntaxException {
        Localizar producto = new Localizar();
        Producto queso = new Producto("Queso",10,1.87);
        assertEquals(queso, producto.producto(10), "Los objetos comparados no son iguales.");
    }

    @Test
    void testEqualsFalse() throws FileNotFoundException, URISyntaxException {
        Localizar producto = new Localizar();
        Producto queso = new Producto("Queso",10,1.87);
        assertNotEquals(queso, producto.producto(0), "Los objetos comparados son iguales.");
    }

    @Test
    void testEqualsFalseCod() {
        Producto queso = new Producto("Queso",10,1.87);
        assertNotEquals(queso, new Producto("Queso",0,1.87), "Los objetos comparados son iguales.");
    }

    @Test
    void testEqualsFalseNombre() {
        Producto queso = new Producto("Queso",10,1.87);
        assertNotEquals(queso, new Producto("Que",10,1.87), "Los objetos comparados son iguales.");
    }

    @Test
    void testEqualsFalsePrecio() {
        Producto queso = new Producto("Queso",10,1.87);
        assertNotEquals(queso, new Producto("Queso",10,0.87), "Los objetos comparados son iguales.");
    }
}