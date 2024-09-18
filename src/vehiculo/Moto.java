
package vehiculo;


public class Moto extends Vehiculo{
    
    public Moto(String hp,int ruedas, String modelo, String color, String marca, int capacidad, int añoFabrica){
        super(hp,ruedas, modelo, color, marca, capacidad, añoFabrica);
        
    }
    
    
    
    
    
    
    
    
    
    public void frenar(){
        System.out.println("la moto frena");  
    }
    
     public void arrancar(){
        System.out.println("la moto avanza lentamente");  
     }
     public void acelerar(){
        System.out.println("la moto va con mas velocidad");  
     }
     public void encendidoRapido(){
        System.out.println("sin estar haciendo fuerza");  
     }
}
