import java.lang.invoke.ConstantCallSite;

public class Texto1 {
    Controlador c;

    public Texto1(Controlador c) {
        this.c = c;
    }

    public void incializa() {

    }

    public void setNumeroDigito(int i) {
        System.out.println("Numero cambiado a " + i * 2);
    }
}
