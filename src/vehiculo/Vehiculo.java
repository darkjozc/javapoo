/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

import java.util.Date;

/**
 *
 * @author Alumno-PB203
 */
//mi objeto vehiculo
public class Vehiculo {
//caracetisticas = Atributos 
    private String hp;
    private int ruedas;
    private String modelo;
    private String color;
    private String marca;
    private int capacidad;
    private int añoFabrica;
    private boolean encendido;
    
    //constructor - inicializar o variables
    public Vehiculo(String hp,int ruedas, String modelo, String color, String marca, int capacidad, int añoFabrica){
        this.hp = hp;
        this.ruedas = ruedas;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.capacidad = capacidad;
        this.añoFabrica = añoFabrica;
                
    }
    
    public void transportar (){
        System.out.println("el vehiculo esta en ruta");
    }
    public void encender(){
        System.out.println("el vehiculo hace run run");
        this.encendido = true;
        
    }
    
    public void informacion() {
        System.out.println("HP: " + hp);
        System.out.println("Ruedas: " + ruedas);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Año de Fabricación: " + añoFabrica);
   
    }
}
