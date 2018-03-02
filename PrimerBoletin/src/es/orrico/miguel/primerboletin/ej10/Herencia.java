package es.orrico.miguel.primerboletin.ej10;

/**
 * Created by Miguel-David Orrico Teruel on 02/03/2018.
 */
public class Herencia {
    public static void main(String[] args) {
        Hijo h = new Hijo(1);
        Padre p = new Padre("padre");
        Abuelo a1 = new Abuelo("abuelo");
//        Padre p2 = new Abuelo("abuelo2");
        Abuelo a2 = new Hijo(2);
        System.out.println("h:" + h);
        System.out.println("p:" + p);
        System.out.println("a1:" + a1);
        System.out.println("a2:" + a2);
        System.out.println("h:" + (Abuelo)h);
    }
}

class Abuelo {
    String s;
    public Abuelo() {
        s = "Sin nombre";
    }
    public Abuelo(String s) {
        this.s = s;
    }
    public String toString() {
        return " s:" + s;
    }
}
class Padre extends Abuelo {
    public Padre() {
    }
    public Padre(String s) {
        super(s);
    }
    public String toString(int i) {
        return "padre" + super.toString();
    }
}
class Hijo extends Padre{
    private int i;
    public Hijo(int i) {
        this.i = i;
    }
    public String toString() {
        return super.toString() + ",i:" + i;
    }
}
