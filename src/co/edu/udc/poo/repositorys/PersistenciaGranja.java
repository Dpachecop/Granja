/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.repositorys;

/**
 *
 * @author Danie
 */
import co.edu.udc.poo.entidades.Granja;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaGranja {

    private static final String FILE_NAME = "granjas.dat";

    // Guardar todas las granjas en un archivo
    public void guardarGranjas(List<Granja> granjas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(granjas);
        } catch (IOException e) {
            System.out.println("Error al guardar las granjas: " + e.getMessage());
        }
    }

    // Cargar todas las granjas desde un archivo
    @SuppressWarnings("unchecked")
    public List<Granja> cargarGranjas() {
        List<Granja> granjas = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            granjas = (List<Granja>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar las granjas: " + e.getMessage());
        }
        return granjas;
    }
}
