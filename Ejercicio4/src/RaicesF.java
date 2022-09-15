
public class RaicesF {
    
    int a,b,c;

    public RaicesF(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
    public void obtenerRaices(){
        int res1, res2;
        res1 = (int) ((-b + Math.sqrt(b*b) - 4 * a * c) / 2 * a);
        res2 = (int) ((-b - Math.sqrt(b*b) - 4 * a * c) / 2 * a);
        
        System.out.println(res1);
        System.out.println(res2);
    }
    
    public void obtenerRaiz(){
        int res = 0;
        res = (- b / 2 * a );
        System.out.println(res);
    }
    
    public double getdiscriminante(){
        return (Math.sqrt(b*b) - 4 * a * c);
        
    }
    
    public boolean tieneRaiz(){
        
        return getdiscriminante() == 0;
    }
    
    public void calcular(){
        if(tieneRaiz()){
            obtenerRaiz();
        }else if (tieneRaiz()) {
            obtenerRaices();
        }else {
            System.out.println("No tiene solucion");
        }
        
    }
}
