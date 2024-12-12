/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.Controladores;

/**
 *
 * @author Danie
 */
import co.edu.udc.poo.entidades.Granja;
import co.edu.udc.poo.repositorys.PersistenciaGranja;
import java.util.List;
import javax.swing.JOptionPane;

public class ClaseGranjaCrud {

    private List<Granja> granjas;
    private PersistenciaGranja persistencia;

    public ClaseGranjaCrud() {
        this.persistencia = new PersistenciaGranja();
        this.granjas = persistencia.cargarGranjas(); // Cargar datos al iniciar
    }

    // Método para obtener la lista de granjas
    public List<Granja> getGranjas() {
        return granjas;
    }

    // Crear o registrar una nueva granja
    public void registrarGranja(Granja granja) {
        granjas.add(granja);
        persistencia.guardarGranjas(granjas); // Guardar cambios
        JOptionPane.showMessageDialog(null, "Granja registrada correctamente.");
    }

    // Actualizar una granja existente por ubicación
    public boolean actualizarGranja(String ubicacion, Granja nuevaGranja) {
        for (int i = 0; i < granjas.size(); i++) {
            if (granjas.get(i).getUbicacion().equalsIgnoreCase(ubicacion)) {
                granjas.set(i, nuevaGranja);    
                persistencia.guardarGranjas(granjas); // Guardar cambios
                JOptionPane.showMessageDialog(null, "Granja actualizada correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró una granja en la ubicación: " + ubicacion, "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Eliminar una granja por ubicación
    public boolean eliminarGranja(String ubicacion) {
        boolean eliminado = granjas.removeIf(granja -> granja.getUbicacion().equalsIgnoreCase(ubicacion));
        if (eliminado) {
            persistencia.guardarGranjas(granjas); // Guardar cambios
            JOptionPane.showMessageDialog(null, "Granja eliminada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró una granja en la ubicación: " + ubicacion, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return eliminado;
    }

    // Leer todas las granjas
    public List<Granja> listarGranjas() {
        return granjas;
    }
}
