import java.util.ArrayList;
import java.util.List;

public class Palabra {
    String palabra;
    List<Letras> letras;

    public Palabra(String palabra) {
        this.palabra = palabra;
        letras = new ArrayList<>();
        for (char c :
                palabra.toCharArray()) {
            letras.add(new Letras(c));
        }
    }

    @Override
    public String toString() {
        String salida = "";
        for (Letras l :
                letras) {
            salida += " " + l.getCadena();
        }
        return salida;
    }

    public boolean adivinaLetra(char l) {
        boolean encontrada = false;
        for (Letras letra :
                letras) {
            if (letra.getLetra() == l) {
                letra.setEstado(EstadoLetra.VISIBLE);
            }
            encontrada = true;
        }
        return encontrada;
    }

    public static void main(String[] args) {
        Palabra p = new Palabra("destornillador");
        System.out.println(p);
        p.adivinaLetra('e');
        System.out.println(p);
        p.adivinaLetra('o');
        System.out.println(p);
        p.adivinaLetra('r');
        System.out.println(p);
        p.adivinaLetra('l');
        System.out.println(p);
        p.adivinaLetra('d');
    }
}
