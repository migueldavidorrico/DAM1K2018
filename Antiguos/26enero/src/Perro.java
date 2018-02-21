import java.io.Serializable;

public class Perro extends Animales implements Audible,Serializable{
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hazSonido() {
        System.out.println("GUAU");
    }

    @Override
    public void preparaSonido() {

    }

    @Override
    public void finalizaSonido() {

    }
}
