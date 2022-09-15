
package ejercicio1;


public class Auto {
    
    String modelo;
    int precio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "Carro modelo " + this.modelo + " con un precio de " + this.precio;
        }
    public Auto(String modelo, int precio){
        this.modelo = modelo;
        this.precio = precio;
    }
    
    
    public void start(){
        System.out.println("Car Start");
    }
    
    public void stop(){
        System.out.println("Car Stop");
    }
    
    public void move(){
        System.out.println("Car Move");
    }
    
}
