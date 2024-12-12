/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.repositorys;

/**
 *
 * @author Danie
 */
import co.edu.udc.poo.entidades.Animal;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaAnimal {

    private static final String FILE_NAME = "animales.dat";

    // Guardar todos los animales en un archivo
    public void guardarAnimales(List<Animal> animales) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(animales);
        } catch (IOException e) {
            System.out.println("Error al guardar los animales: " + e.getMessage());
        }
    }

    // Cargar todos los animales desde un archivo
    @SuppressWarnings("unchecked")
    public List<Animal> cargarAnimales() {
        List<Animal> animales = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            animales = (List<Animal>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los animales: " + e.getMessage());
        }
        return animales;
    }
}