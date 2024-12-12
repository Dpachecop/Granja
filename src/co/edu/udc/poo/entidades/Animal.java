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
    public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

        private int id;
        private String especie;
        private int cantidad;
        private int edad;
        private int pesoKg;

        public Animal(int id, String especie, int cantidad, int edad, int pesoKg) {

            this.id = id;
            this.especie = especie;
            this.cantidad = cantidad;
            this.edad = edad;
            this.pesoKg = pesoKg;

        }


        public int getId(){ return id;}
        public void setId(int id){ this.id = id;}

        public String getEspecie(){ return especie;}
        public void setEspecie(String especie){ this.especie = especie;}

        public int getCantidad(){ return cantidad;}
        public void setCantidad(int cantidad){ this.cantidad = cantidad;}

        public int getEdad(){ return edad;}
        public void setEdad(int edad){ this.edad= edad;}

        public int getPesoKg(){ return pesoKg;}
        public void setPesoKg(int pesoKg){ this.pesoKg = pesoKg;}



        public void mostrarDetalles(){
    System.out.println("Infomacion del animal: ");
    System.out.println("ID del animal: " + id);
    System.out.println("Especie: " + especie);
    System.out.println("Cantidad: " + cantidad);
    System.out.println("Edad: " + edad );
    System.out.println("Peso en kg: " + pesoKg);


        }

    }