
package ejercicio5;


public class Repartidor extends Empleado{
    
    String zona;

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Repartidor(String zona, String nombre, int edad, int salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }
    
    public Repartidor(String nombre, int edad, int salario) {
        super(nombre, edad, salario);
    }
    
    @Override
    public String toString(){
        if (edad < 25) {
            int total;
            System.out.println("Adquiere un plus");
            total = (int) (salario  + plus);
            return "El comerciante " +nombre + " con " +edad + " años, tiene un salario de " +total + " en total ";
        }else{
            return "El repatidor " +nombre + " con " +edad + " años, tiene un salario de " +salario + 
                " en total y trabaja en la zona de " +zona;
        }
    }
}
