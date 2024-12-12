/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.Controladores;

/**
 *
 * @author Danie
 */
import co.edu.udc.poo.entidades.Producto;
import co.edu.udc.poo.repositorys.PersistenciaProducto;
import java.util.List;
import javax.swing.JOptionPane;

public class ClaseProductoCrud {

  private List<Producto> productos;
    private PersistenciaProducto persistencia;

    public ClaseProductoCrud() {
        this.persistencia = new PersistenciaProducto();
        this.productos = persistencia.cargarProductos(); // Cargar datos al iniciar
    }

    // Agregar un nuevo producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        persistencia.guardarProductos(productos); // Guardar cambios
        JOptionPane.showMessageDialog(null, "Producto agregado correctamente.");
    }

    // Listar todos los productos
    public List<Producto> listarProductos() {
        return productos;
    }

    // Actualizar un producto existente por nombre
    public boolean actualizarProducto(String nombre, Producto nuevoProducto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                productos.set(i, nuevoProducto);
                persistencia.guardarProductos(productos); // Guardar cambios
                JOptionPane.showMessageDialog(null, "Producto actualizado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró un producto con nombre: " + nombre, "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Eliminar un producto por nombre
    public boolean eliminarProducto(String nombre) {
        boolean eliminado = productos.removeIf(producto -> producto.getNombre().equalsIgnoreCase(nombre));
        if (eliminado) {
            persistencia.guardarProductos(productos); // Guardar cambios
            JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un producto con nombre: " + nombre, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return eliminado;
    }

    // Buscar un producto por nombre
    public Producto buscarProducto(String nombre) {
        return productos.stream()
                        .filter(producto -> producto.getNombre().equalsIgnoreCase(nombre))
                        .findFirst()
                        .orElse(null);
    }
}