/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.Controladores;

/**
 *
 * @author Danie
 */
import co.edu.udc.poo.entidades.Animal;
import co.edu.udc.poo.repositorys.PersistenciaAnimal;


import java.util.List;
import javax.swing.JOptionPane;

public class ClaseAnimalCrud {

    private List<Animal> animales;
    private PersistenciaAnimal persistencia;

    public ClaseAnimalCrud() {
        this.persistencia = new PersistenciaAnimal();
        this.animales = persistencia.cargarAnimales(); // Cargar datos al iniciar
    }

    // Crear o agregar un nuevo animal
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        persistencia.guardarAnimales(animales); // Guardar cambios
        JOptionPane.showMessageDialog(null, "Animal agregado correctamente.");
    }

    // Leer todos los animales
    public List<Animal> listarAnimales() {
        return animales;
    }

    // Actualizar un animal existente por ID
    public boolean actualizarAnimal(int id, Animal nuevoAnimal) {
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getId() == id) {
                animales.set(i, nuevoAnimal);
                persistencia.guardarAnimales(animales); // Guardar cambios
                JOptionPane.showMessageDialog(null, "Animal actualizado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró un animal con ID: " + id, "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Eliminar un animal por ID
    public boolean eliminarAnimal(int id) {
        boolean eliminado = animales.removeIf(animal -> animal.getId() == id);
        if (eliminado) {
            persistencia.guardarAnimales(animales); // Guardar cambios
            JOptionPane.showMessageDialog(null, "Animal eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un animal con ID: " + id, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return eliminado;
    }
}