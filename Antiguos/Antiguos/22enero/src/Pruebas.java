import java.util.Random;

public class Pruebas {
    public static void main(String[] args) {
        String[] lista=Diccionario.FACIL.getLista();
        int numeroPalabra= (int) (Math.random()*lista.length);
        PalabraAhorcado palabra=new PalabraAhorcado(lista[numeroPalabra]);
        System.out.println(palabra);
        palabra.buscaLetra('E');
        System.out.println(palabra);
        palabra.buscaLetra('U');
        System.out.println(palabra);
        palabra.buscaLetra('I');
        System.out.println(palabra);
        palabra.buscaLetra('A');
        System.out.println(palabra);
        palabra.buscaLetra('C');
        System.out.println(palabra);
        palabra.buscaLetra('N');
        System.out.println(palabra);
        palabra.buscaLetra('O');
        System.out.println(palabra);

    }
}
