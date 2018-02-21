public class FranHerencia {
    public static void main(String[] args) {
        Hijo h = new Hijo(2);
        Padre p = new Hijo(2);
        System.out.println("h.resta():" + h.resta());
        if(p instanceof Hijo) {
            System.out.println("p.resta():" + ((Hijo) p).resta());
        }
    }
}

class Padre {
    private final int numero;
    public Padre(int numero) {
        this.numero = numero;
    }
    public int suma() {
        return numero + 1;
    }
    public int getNumero() {
        return numero;
    }
}
class Hijo extends Padre {
    public Hijo(int numero) {
        super(numero);
    }
    @Override
    public int suma() {
        return super.suma() + 1;
    }
    public int resta() {
        return getNumero() - 1;
    }
}

