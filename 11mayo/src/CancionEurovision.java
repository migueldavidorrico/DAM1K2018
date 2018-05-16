import java.io.Serializable;
import java.util.*;

public class CancionEurovision implements Serializable {
    private final Pais pais;
    private final String titulo;
    private final TreeMap<Pais, Integer> puntosOtorgados;

    public CancionEurovision(Pais pais, String titulo) {
        this.pais = pais;
        this.titulo = titulo;
        puntosOtorgados = new TreeMap<>();
    }

    public void votacion(Pais p, int puntos) {
        if (puntos < 1 || puntos > 12 || puntos == 11 || puntos == 9) {
            throw new IllegalArgumentException("Votos inválidos");
        }
        this.puntosOtorgados.put(p, puntos);
    }

    public TreeMap<Pais, Integer> getPuntosOtorgados() {
        TreeMap<Pais, Integer> salida = new TreeMap<>(new Comparator<Pais>() {
            @Override
            public int compare(Pais o1, Pais o2) {
                int puntosPrimero = puntosOtorgados.get(o1);
                int puntosSegundo = puntosOtorgados.get(o2);
                return Integer.compare(puntosSegundo, puntosPrimero);

            }
        });
        salida.putAll(puntosOtorgados);
        return salida;
    }

    public Pais getPais() {
        return pais;
    }

    public String getTitulo() {
        return titulo;
    }


}
