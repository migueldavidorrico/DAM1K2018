import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Baraja {
    private Carta[] cartas;
    private int cartaActual=0;

    public Carta reparteCarta(){
        return this.cartas[cartaActual++];
    }

    public void shuffleArray()
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = this.cartas.length-1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Carta c = cartas[index];
            cartas[index] = cartas[i];
            cartas[i] = c;
        }
    }

    public Baraja(){
        this.cartas=new Carta[40];
        int indice=0;
        for (Palos palos :
                Palos.values()) {
            for (Valor valor :
                    Valor.values()) {
                this.cartas[indice++]=new Carta(palos,valor);
            }

        }
    }

    @Override
    public String toString() {
        String salida="";
        for (Carta carta:
        this.cartas){
            salida+=carta+"\n";
        }
        return salida;
    }
}
