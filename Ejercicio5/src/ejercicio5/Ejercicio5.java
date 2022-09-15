
package ejercicio5;


public class Ejercicio5 {

    
    public static void main(String[] args) {
        
        Comerciante empleado1 = new Comerciante("Claudia", 40, 800);
        System.out.println(empleado1);
        
        Comerciante empleado2 = new Comerciante("Mary", 19, 500);
        System.out.println(empleado2);
        
        System.out.println("=================================================================================");
        
        Repartidor repartidor1 = new Repartidor("Rio Blanco", "William", 19, 300);
        System.out.println(repartidor1);
        
        Repartidor repartidor2 = new Repartidor("Yanaconas", "Oscar", 30, 300);
        System.out.println(repartidor2);
    }
}
