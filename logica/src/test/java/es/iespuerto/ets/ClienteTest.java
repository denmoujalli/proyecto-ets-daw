package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    Cliente clientePrueba;

    @BeforeEach
    public void testCliente() {
        String nombre = "Kevin";
        String apellido = "Ruiz";
        String correo = "kevin@gmail.com";
        String login = "KevinRuiz";
        String password = "12345";

        clientePrueba = new Cliente(nombre, apellido, correo, login, password);
    }

    @Test
    public void testGetNombre() {
        assertEquals("Kevin", clientePrueba.getNombre());
    }

    @Test
    public void testGetApellido() {
        assertEquals("Ruiz", clientePrueba.getApellido());
    }

    @Test
    public void testGetCorreo() {
        assertEquals("kevin@gmail.com", clientePrueba.getCorreo());
    }

    @Test
    public void testGetLogin() {
        assertEquals("KevinRuiz", clientePrueba.getLogin());
    }

    @Test
    public void testGetPassword() {
        assertEquals("12345", clientePrueba.getPassword());
    }
}
