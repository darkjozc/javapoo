
package vehiculo;

//autor:juan josue canahuire choque
public class principal {
    public static void main(String[]arg){
        //iniciar = invocar = llamar a un objeto
        Moto moto = new Moto("1700",2,"Ae86","rojo","toyota",4,2024);
        moto.encender();
        moto.transportar();
        moto.frenar();
        moto.acelerar();
        moto.arrancar();
        moto.encendidoRapido(); 
        moto.informacion();
        
        Moto moto1 = new Moto("700",2,"pulsar","negro","pulsar",3,2522);
        moto1.encender();
        moto1.transportar();
        moto1.frenar();
        moto1.acelerar();
        moto1.arrancar();
        moto1.encendidoRapido(); 
        moto1.informacion();    
       
        
        Auto auto = new Auto("700",4,"ae56","rojo","yotota",10,2025,6);
        auto.informacion();
        
        
    }
  
}
    
    
   

     
 
 
   
    


