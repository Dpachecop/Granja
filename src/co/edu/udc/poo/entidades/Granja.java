/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.entidades;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Danie
 */
public class Granja implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String propietario;
    private String ubicacion;
    private String nombre;
    private String tamaño;
    private String produccion;
    public static HashMap<String, Granja> GranjaDB;

 
  


   public String getPropietario (){
      return propietario;
    }
     public void setPropietario( String propietario){
        this.propietario = propietario;
     }

     public String getUbicacion (){
        return ubicacion;
      }
     public  void setUbicacion( String ubicacion){
          this.ubicacion = ubicacion;
       }
     public  String getNombre (){
        return nombre;
      }
     public  void setNombre( String nombre){
          this.nombre = nombre;
       }
     public  String getTamaño (){
        return tamaño;
      }
     public  void setTamaño( String tamaño){
          this.tamaño = tamaño;
       }
    public   String getProduccion (){
        return produccion;
      }
     public  void setProduccion( String produccion){
          this.produccion = produccion;
       }
  
  



    


}

