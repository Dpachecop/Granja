/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.udc.poo.ventana;

import co.edu.udc.poo.Controladores.ClaseProductoCrud;
import co.edu.udc.poo.entidades.Producto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Danie
 */
public class VentanaProducto extends javax.swing.JDialog {

    /**
     * Creates new form VentanaProducto
     */
    public VentanaProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        campoAnimal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CampoPrecio = new javax.swing.JTextField();
        BotonMostrar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CAMPO PRODUCTO");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udc/poo/ventana/iconos/MeatIcon256px.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true), "Datos de su producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Producto Animal:");

        campoAnimal.setPreferredSize(new java.awt.Dimension(64, 30));
        campoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAnimalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre");

        CampoNombre.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Cantidad");

        campoCantidad.setPreferredSize(new java.awt.Dimension(64, 30));
        campoCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCantidadActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Precio");

        CampoPrecio.setPreferredSize(new java.awt.Dimension(64, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        BotonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udc/poo/ventana/iconos/searchIcon16px.png"))); // NOI18N
        BotonMostrar.setText("BUSCAR");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });

        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udc/poo/ventana/iconos/addIcon16px.png"))); // NOI18N
        BotonGuardar.setText("GUARDAR");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udc/poo/ventana/iconos/EditIcon16px.png"))); // NOI18N
        BotonEditar.setText("EDITAR");
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });

        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udc/poo/ventana/iconos/deleteIcon16px.png"))); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("RELLENE LOS CAMPOS DE DATOS DE SU PRODUCTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(BotonMostrar)
                        .addGap(29, 29, 29)
                        .addComponent(BotonGuardar)
                        .addGap(26, 26, 26)
                        .addComponent(BotonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(BotonEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonGuardar)
                        .addComponent(BotonMostrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonEliminar)
                        .addComponent(BotonEditar)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAnimalActionPerformed
        
    }//GEN-LAST:event_campoAnimalActionPerformed

    private void campoCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCantidadActionPerformed

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
       ClaseProductoCrud controlador = new ClaseProductoCrud();
    List<Producto> productos = controlador.listarProductos();

    if (productos.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay productos registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    StringBuilder mensaje = new StringBuilder("Productos registrados:\n");
    for (Producto producto : productos) {
        mensaje.append("- Nombre: ").append(producto.getNombre()).append("\n")
               .append("  Animal: ").append(producto.getAnimal()).append("\n")
               .append("  Cantidad: ").append(producto.getCantidad()).append("\n")
               .append("  Precio: ").append(producto.getPrecio()).append("\n\n");
    }

    JOptionPane.showMessageDialog(this, mensaje.toString(), "Productos Registrados", JOptionPane.INFORMATION_MESSAGE);
        
        
    }//GEN-LAST:event_BotonMostrarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        ClaseProductoCrud controlador = new ClaseProductoCrud();

    String animal = campoAnimal.getText();
    String nombre = CampoNombre.getText();
    String cantidadStr = campoCantidad.getText();
    String precioStr = CampoPrecio.getText();

    if (animal.isEmpty() || nombre.isEmpty() || cantidadStr.isEmpty() || precioStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int cantidad = Integer.parseInt(cantidadStr);
        double precio = Double.parseDouble(precioStr);

        Producto nuevoProducto = new Producto();
        nuevoProducto.setAnimal(animal);
        nuevoProducto.setNombre(nombre);
        nuevoProducto.setCantidad(cantidad);
        nuevoProducto.sePrecio(precio);

        controlador.agregarProducto(nuevoProducto);
        JOptionPane.showMessageDialog(this, "Producto guardado correctamente.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La cantidad y el precio deben ser numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
       
       
    ClaseProductoCrud controlador = new ClaseProductoCrud();

    String nombre = CampoNombre.getText();

    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del producto a editar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Producto productoExistente = controlador.buscarProducto(nombre);

    if (productoExistente == null) {
        JOptionPane.showMessageDialog(this, "No se encontró un producto con el nombre especificado.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        String nuevoAnimal = campoAnimal.getText();
        int nuevaCantidad = Integer.parseInt(campoCantidad.getText());
        double nuevoPrecio = Double.parseDouble(CampoPrecio.getText());

        productoExistente.setAnimal(nuevoAnimal);
        productoExistente.setCantidad(nuevaCantidad);
        productoExistente.sePrecio(nuevoPrecio);

        controlador.actualizarProducto(nombre, productoExistente);
        JOptionPane.showMessageDialog(this, "Producto actualizado correctamente.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La cantidad y el precio deben ser numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
    }



     

    }//GEN-LAST:event_BotonEditarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        ClaseProductoCrud controlador = new ClaseProductoCrud();

    String nombre = CampoNombre.getText();

    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del producto a eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    boolean eliminado = controlador.eliminarProducto(nombre);

    if (eliminado) {
        JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró un producto con el nombre especificado.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_BotonEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaProducto dialog = new VentanaProducto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoPrecio;
    private javax.swing.JTextField campoAnimal;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
