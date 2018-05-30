import java.util.ArrayList;
import java.util.List;

public class Palabra {
    String palabra;
    List<Letras> letras;
    boolean acertada;

    public Palabra(String palabra) {
        this.acertada = false;
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
                encontrada = true;
            }
        }
        this.acertada = true;
        for (Letras letra :
                letras) {
            if (letra.getEstado().equals(EstadoLetra.OCULTA)) {
                this.acertada = false;
                break;
            }
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
