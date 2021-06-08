
package ClaseCubo;


public class Cubo {
    int a;
    int b;
    int c;

    public Cubo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Cubo() {
    }
    public int volumen(){
        int V;
        V=this.a*this.b*this.c;
        return V;
    }
    
}
