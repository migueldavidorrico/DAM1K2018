import java.util.Arrays;

public class PalabraAhorcado {
    LetraAhorcado[] letrasPalabra;

    public PalabraAhorcado(String palabra) {
        palabra=palabra.toUpperCase();
        this.letrasPalabra=new LetraAhorcado[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            this.letrasPalabra[i]=new LetraAhorcado(palabra.charAt(i));
        }
    }
    public int buscaLetra(char c){
        int encontradas=0;
        for (LetraAhorcado l :this.letrasPalabra
             ) {
            if(l.esIgual(c)){
                encontradas++;
                l.setVisible(true);
            }
        }
        return encontradas;
    }

    @Override
    public String toString() {
        String salida="";
        for (LetraAhorcado l :
                this.letrasPalabra) {
            salida+=l+" ";
        }
        return salida;
    }
}
