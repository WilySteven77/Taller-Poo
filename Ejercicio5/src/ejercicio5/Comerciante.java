
package ejercicio5;


public class Comerciante extends Empleado {
    
    double comision;

    public Comerciante(double comision, String nombre, int edad, int salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    public Comerciante(String nombre, int edad, int salario) {
        super(nombre, edad, salario);
    }
    
    /*if (edad > 30) {
            System.out.println("Tienes una comision de 200");
            comision = 200;
            total = (int) (comision + salario + plus);
        }*/
    @Override
    public String toString(){
        if (edad > 30) {
            int total;
            System.out.println("Tienes una comision de 200");
            comision = 200;
            total = (int) (salario + comision + plus);
            return "El comerciante " +nombre + " con " +edad + " años, tiene un salario de " +total + " en total ";
        }else{
            return "El comerciante " +nombre + " con " +edad + " años, tiene un salario de " +salario + " en total ";
        }  
    }
}
