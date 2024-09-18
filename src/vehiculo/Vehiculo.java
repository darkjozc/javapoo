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
    public Vehiculo(){
        this.hp = "100";
        this.ruedas = 2;
        this.modelo = "Huracan";
        this.color = "rojo";
        this.marca = "kawasaqui";
        this.capacidad = 2;
        this.añoFabrica = 2024;
                
    }
    
    public void transportar (){
        System.out.println("el vehiculo esta en ruta");
    }
    public void encender(){
        System.out.println("el vehiculo hace run run");
        this.encendido = true;
        
    }
}
