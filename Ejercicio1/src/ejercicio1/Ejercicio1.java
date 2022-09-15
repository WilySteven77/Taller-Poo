
package ejercicio1;
import ejercicio1.Auto;
import ejercicio1.Controlador;

public class Ejercicio1 {

    
    public static void main(String[] args) {
        
        Auto car = new Auto("Nissam", 15000000);
        Controlador drive = new Controlador("Mary", 19);
        System.out.println(car);
        System.out.println(drive);
        car.start();
        car.move();
        car.stop();
        
    }
    
}
