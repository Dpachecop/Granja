/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.udc.poo.ventana;

/**
 *
 * @author Danie
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuUsuario = new javax.swing.JMenu();
        ItemAggGranja = new javax.swing.JMenuItem();
        MenuProducto = new javax.swing.JMenu();
        itemConsultarProducto = new javax.swing.JMenuItem();
        MenuAnimal = new javax.swing.JMenu();
        itemConsultarAnimal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de su granja");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udc/poo/ventana/iconos/iconoGranja256px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel2.setText("¡Bienvenido Granjero!");

        MenuUsuario.setText("Granja");
        MenuUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        ItemAggGranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udc/poo/ventana/iconos/addIcon16px.png"))); // NOI18N
        ItemAggGranja.setText("Acerca de la granja...");
        ItemAggGranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAggGranjaActionPerformed(evt);
            }
        });
        MenuUsuario.add(ItemAggGranja);

        jMenuBar1.add(MenuUsuario);

        MenuProducto.setText("Producto");
        MenuProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductoActionPerformed(evt);
            }
        });

        itemConsultarProducto.setText("Acerca de su producto...");
        itemConsultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarProductoActionPerformed(evt);
            }
        });
        MenuProducto.add(itemConsultarProducto);

        jMenuBar1.add(MenuProducto);

        MenuAnimal.setText("Animal");
        MenuAnimal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        itemConsultarAnimal.setText("Acerca del Animal");
        itemConsultarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarAnimalActionPerformed(evt);
            }
        });
        MenuAnimal.add(itemConsultarAnimal);

        jMenuBar1.add(MenuAnimal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemAggGranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAggGranjaActionPerformed
        // TODO add your handling code here:
        VentanaGranja ventana = new VentanaGranja(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_ItemAggGranjaActionPerformed

    private void itemConsultarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarAnimalActionPerformed
        // TODO add your handling code here:
       VentanaAnimal ventanaA = new VentanaAnimal(this,true);
       ventanaA.setLocationRelativeTo(this);
       ventanaA.setVisible(true);
    }//GEN-LAST:event_itemConsultarAnimalActionPerformed

    private void MenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductoActionPerformed
       
    }//GEN-LAST:event_MenuProductoActionPerformed

    private void itemConsultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarProductoActionPerformed
        // TODO add your handling code here:
         VentanaProducto ventanap = new VentanaProducto(this, true);
        ventanap.setLocationRelativeTo(this);
        ventanap.setVisible(true);
    }//GEN-LAST:event_itemConsultarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemAggGranja;
    private javax.swing.JMenu MenuAnimal;
    private javax.swing.JMenu MenuProducto;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JMenuItem itemConsultarAnimal;
    private javax.swing.JMenuItem itemConsultarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
