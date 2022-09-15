
package modelo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Persona {
    String nombre;
    int edad;
    double peso;
    double estatura;
    double IMC;
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }
    
    

   public void imprimirimc(JTextArea area){
       IMC = peso / (estatura * estatura);
       if (IMC >= 40) {
            JOptionPane.showMessageDialog(null, "Su IMC esta en: " +IMC);
            JOptionPane.showMessageDialog(null, "Esta en obsidad mórida");
        }else if (IMC >= 35 && IMC < 40) {
            JOptionPane.showMessageDialog(null, "Su IMC esta en: " +IMC);
            JOptionPane.showMessageDialog(null, "Esta en obsidad moderada");
        }else if (IMC >= 30 && IMC < 35) {
            JOptionPane.showMessageDialog(null, "Su IMC esta en: " +IMC);
            JOptionPane.showMessageDialog(null, "Esta en obsidad leve");
        }else if (IMC >=25  && IMC < 30) {
            JOptionPane.showMessageDialog(null, "Su IMC esta en: " +IMC);
            JOptionPane.showMessageDialog(null, "Esta en Sobrepeso");
        }else if (IMC >=18.5  && IMC < 25) {
            JOptionPane.showMessageDialog(null, "Su IMC esta en: " +IMC);
            JOptionPane.showMessageDialog(null, "Esta en Peso normal");
        }else if (IMC >=17  && IMC < 18.5) {
            JOptionPane.showMessageDialog(null, "Su IMC esta en: " +IMC);
            JOptionPane.showMessageDialog(null, "Esta en delgadez leve");
        }else if (IMC >=16  && IMC < 17) {
            JOptionPane.showMessageDialog(null, "Su IMC esta en: " +IMC);
            JOptionPane.showMessageDialog(null, "Esta en delgadez moderada");
        }else if (IMC < 16) {
            JOptionPane.showMessageDialog(null, "Su IMC esta en: " +IMC);
            JOptionPane.showMessageDialog(null, "Esta en Delgadez leve");
        }
   }

    

   
    
    
    
    
}
