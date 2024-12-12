/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.repositorys;

/**
 *
 * @author Danie
 */
import co.edu.udc.poo.entidades.Producto;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaProducto {

    private static final String FILE_NAME = "productos.dat";

    // Guardar todos los productos en un archivo
    public void guardarProductos(List<Producto> productos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(productos); // Serializar la lista completa
        } catch (IOException e) {
            System.out.println("Error al guardar los productos: " + e.getMessage());
        }
    }

    // Cargar todos los productos desde un archivo
    @SuppressWarnings("unchecked")
    public List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            productos = (List<Producto>) ois.readObject(); // Deserializar la lista completa
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los productos: " + e.getMessage());
        }
        return productos;
    }
}