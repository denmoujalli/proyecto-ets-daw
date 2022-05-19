package es.iespuerto.ets.utils;

import es.iespuerto.ets.modelo.Centro;
import es.iespuerto.ets.modelo.Cliente;
import es.iespuerto.ets.modelo.Premium;
import es.iespuerto.ets.modelo.Producto;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Utilidades {

    /**
     * Contructor privado, al ser clase de utilidades con metodos estaticos, no se
     * permite instanciar objetos.
     */
    private Utilidades() {
    }

    /**
     * Esta funcion lee el archivo "ficheroClientes" y devuelve una lista de
     * clientes.
     *
     * @param ficheroClientes El nombre del archivo que contiene los datos de los
     *                        clientes.
     * @return Una lista de clientes.
     * @throws URISyntaxException    Exception por la URL mal formada
     * @throws FileNotFoundException Exception por no encontrar fichero
     */
    public static List<Cliente> leerCliente(String ficheroClientes) throws FileNotFoundException, URISyntaxException {
        List<Cliente> clientes;
        try (Scanner fichero = new Scanner(new File(Objects.requireNonNull(obtenerPathFichero(ficheroClientes))))) {
            clientes = new ArrayList<>();
            String linea;
            String[] lineaDatos;
            String nombre;
            String apellido;
            String correo;
            String login;
            String password;
            while (fichero.hasNextLine()) {
                linea = fichero.nextLine();
                lineaDatos = linea.split(";");
                nombre = lineaDatos[0];
                apellido = lineaDatos[1];
                correo = lineaDatos[2];
                login = lineaDatos[3];
                password = lineaDatos[4];
                clientes.add(new Cliente(nombre, apellido, correo, login, password));
            }
        }
        return clientes;
    }

    /**
     * Esta funcion lee el archivo "ficheroProductos" y devuelve una lista de
     * producto.
     *
     * @param ficheroProductos El nombre del archivo que contiene los datos de los
     *                         producto.
     * @return Una lista de producto.
     * @throws URISyntaxException    Exception por la URL mal formada
     * @throws FileNotFoundException Exception por no encontrar fichero
     */
    public static List<Producto> leerProductos(String ficheroProductos)
            throws FileNotFoundException, URISyntaxException {
        List<Producto> productos;
        try (Scanner fichero = new Scanner(new File(Objects.requireNonNull(obtenerPathFichero(ficheroProductos))))) {
            productos = new ArrayList<>();
            String linea;
            String[] lineaDatos;
            String nombre;
            int codigo;
            double precio;
            while (fichero.hasNextLine()) {
                linea = fichero.nextLine();
                lineaDatos = linea.split(";");
                nombre = lineaDatos[0];
                codigo = Integer.parseInt(lineaDatos[1]);
                precio = Double.parseDouble(lineaDatos[2]);
                productos.add(new Producto(nombre, codigo, precio));
            }
        }
        return productos;
    }

    /**
     * Esta funcion lee el archivo "ficheroCentros" y devuelve una lista de centros.
     *
     * @param ficheroCentros El nombre del archivo que contiene los datos de los
     *                       centros.
     * @return Una lista de centros.
     * @throws URISyntaxException    Exception por la URL mal formada
     * @throws FileNotFoundException Exception por no encontrar fichero
     */
    public static List<Centro> leerCentro(String ficheroCentros) throws FileNotFoundException, URISyntaxException {
        List<Centro> centros;
        try (Scanner fichero = new Scanner(new File(Objects.requireNonNull(obtenerPathFichero(ficheroCentros))))) {
            centros = new ArrayList<>();
            String linea;
            String[] lineaDatos;
            String nombre;
            String cif;
            String localizacion;
            while (fichero.hasNextLine()) {
                linea = fichero.nextLine();
                lineaDatos = linea.split(";");
                nombre = lineaDatos[0];
                cif = lineaDatos[1];
                localizacion = lineaDatos[2];
                centros.add(new Centro(nombre, cif, localizacion));
            }
        }
        return centros;
    }

    /**
     * Esta funcion lee el archivo "ficheroPremium" y devuelve una lista de clientes
     * Premium.
     *
     * @param ficheroPremium El nombre del archivo que contiene los datos de los
     *                       usuarios Premium.
     * @return Una lista de usuarios Premium.
     * @throws URISyntaxException    Exception por la URL mal formada
     * @throws FileNotFoundException Exception por no encontrar fichero
     */
    public static List<Premium> leerPremium(String ficheroPremium) throws FileNotFoundException, URISyntaxException {
        List<Premium> clientesPremium;
        try (Scanner fichero = new Scanner(new File(Objects.requireNonNull(obtenerPathFichero(ficheroPremium))))) {
            clientesPremium = new ArrayList<>();
            String linea;
            String[] lineaDatos;
            String nombre;
            String apellido;
            String correo;
            String login;
            String password;
            String plan;
            String pago;
            while (fichero.hasNextLine()) {
                linea = fichero.nextLine();
                lineaDatos = linea.split(";");
                nombre = lineaDatos[0];
                apellido = lineaDatos[1];
                correo = lineaDatos[2];
                login = lineaDatos[3];
                password = lineaDatos[4];
                pago = lineaDatos[5];
                plan = lineaDatos[6];
                clientesPremium.add(new Premium(nombre, apellido, correo, login, password, pago, plan));
            }
        }
        return clientesPremium;
    }

    /**
     * Funcion encargada de obtener el path del fichero.
     *
     * @param nombreFichero Nombre del fichero a buscar
     * @return Path completo del fichero
     * @throws URISyntaxException Exception por la URL mal formada
     */
    public static String obtenerPathFichero(String nombreFichero) throws URISyntaxException {
        URL res = Utilidades.class.getClassLoader().getResource(nombreFichero);
        if (res == null) {
            return null;
        }
        File file = Paths.get(res.toURI()).toFile();
        return file.getAbsolutePath();
    }
}
