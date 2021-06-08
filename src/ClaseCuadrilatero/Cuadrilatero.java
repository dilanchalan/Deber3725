
package ClaseCuadrilatero;

public class Cuadrilatero {
    int a;
    int b;

    public void vd() {
        System.out.println("Altura:"+this.a);
        System.out.println("Base "+this.b);
        
    }
    public int area(){
        int result;
        result = a*b;
        return result;
    }
    public int perimetro(){
        int result1;
        result1 = a+a+b+b;
        return result1;
       
    }
}
