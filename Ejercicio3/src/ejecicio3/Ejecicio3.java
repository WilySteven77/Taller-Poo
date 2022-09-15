
package ejecicio3;
import java.util.Scanner;

public class Ejecicio3 {

    
    public static void main(String[] args) {
        
    //Personas npersonas = new Personas();
    Scanner  in = new Scanner(System.in);
        
    int edad, hombre, mujeres;
    int asistentes, sexo;
    int Tmujeres, Thombres;
    String registrar;
       
    hombre = 0;
    mujeres = 0;
    asistentes = 0;
    Thombres = 0;
    Tmujeres = 0; 
        do {            
            System.out.println("Ingrese su edad");
            edad = in.nextInt();
            System.out.println("Ingrese su genero (Hombre es 1 o mujer es 2)");
            sexo = in.nextInt();
            do {               
               if (sexo < 1 || sexo > 2) {
               System.out.println("Caracter incorrecto. Ingrese nuevamente");
                }
           } while (sexo < 1 || sexo > 2);
            
            if(sexo == 2 && edad>=18)
            {
                mujeres=mujeres+1;
                Tmujeres=Tmujeres+edad;
            }
            if(sexo == 1 && edad>=18)
            {
                hombre=hombre+1;
                Thombres=Thombres+edad;
            }
            
            if (edad >= 18) {
            asistentes = asistentes+1;
            }else{
            System.out.println("No se permite menores en la fiesta");
            }
            do {                
                System.out.print("Deseas repetir el proceso? (Si/No): ");
                registrar = in.nextLine();
            } while (!registrar.equalsIgnoreCase("Si")&& !registrar.equalsIgnoreCase("No"));
        } while (registrar.equalsIgnoreCase("Si"));
        
        
        System.out.println("Total de asistentes: " +asistentes);
        System.out.println("Total de hombres: " + hombre);
        System.out.println("Total de mujeres: " + mujeres);
        }   
}
