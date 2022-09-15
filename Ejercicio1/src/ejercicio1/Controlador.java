
package ejercicio1;


public class Controlador {
    String name;
    int age;
    
    @Override
    public String toString(){
        return "Conducido por " + this.name + " con una edad de " + this.age;
        }

    Controlador(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
