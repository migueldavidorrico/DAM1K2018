/**
 * Created by Miguel-David Orrico Teruel on 02/03/2018.
 */
class Abuelo {
    private int num;
    public Abuelo() {
                num = 10;
    }
    public Abuelo(int num) {
        this.num = num;
    }
    public int num() {
        return num;
    }
    public int suma() {
        return num + 1;
    }
    public int resta() {
        return num - 1;
    }
}
class Padre extends Abuelo {
    public Padre() {
    }
    public Padre(int num) {
        super(num);
    }
    @Override
    public int suma() {
        return super.suma() + 1;
    }
}
class Hijo extends Padre {
    @Override
    public int suma() {
        return super.suma() + 1;
    }
    @Override
    public int resta() {
        return super.resta() - 1;
    }
}
public class Cuest1Main {
    public static void main(String[] args) {
        Abuelo a = new Abuelo();
        Padre p1 = new Padre();
        Padre p2 = new Padre(3);
        Hijo h = new Hijo();
        System.out.println("a.num:" + a.num());
        System.out.println("p1.num:" + p1.num());
        System.out.println("p2.num:" + p2.num());
        System.out.println("h.num:" + h.num());
        System.out.println("h.suma():" + h.suma());
        System.out.println("h.resta():" + h.resta());
    }
}
