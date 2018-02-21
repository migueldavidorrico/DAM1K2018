import java.io.Serializable;

public class Pares implements Seleccionable {
    @Override
    public boolean esElegible(int n) {
        return n%2==0;
    }
}
