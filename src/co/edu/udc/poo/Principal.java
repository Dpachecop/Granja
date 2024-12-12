/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udc.poo;
import co.edu.udc.poo.ventana.VentanaPrincipal;

/**
 *
 * @author Danie
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
        ventana.setVisible(true);
        
       
    }
    
}
