/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.entidades;

import java.io.Serializable;

/**
 *
 * @author Danie
 */
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;

private String productoAnimal;
private String nombre;
private int cantidad;
private double precio;




public String getAnimal (){return productoAnimal;}
public void setAnimal(String animal){ this.productoAnimal = animal;}

public String getNombre (){return nombre;}
public void setNombre(String nombre){ this.nombre = nombre;}

public int getCantidad (){return cantidad;}
public void setCantidad(int cantidad){ this.cantidad = cantidad;}

public double getPrecio (){return precio;}
public void sePrecio (double precio){ this.precio = precio;}



}

