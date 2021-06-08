
package ClaseCuadrilatero;


public class PruebaCuadrilatero {

    public static void main(String[] args) {
        System.out.println("El resultado del perimetro es:");
        Cuadrilatero c1 = new Cuadrilatero();
        c1.a=12;
        c1.b=6;
        c1.vd();
        System.out.println("El Area es: "+c1.area());
        System.out.println("El perimetro es : "+c1.perimetro());
        
        
              

    }
    
}
