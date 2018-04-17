import java.util.*;

public class VideoClub {
    final Map<Pelicula, List<String>> reparto;

    public boolean anyadirPelicula(Pelicula p) {
        if (this.reparto.containsKey(p)) {
            return false;
        }
        this.reparto.put(p, new ArrayList<>());
        return true;
    }

    public void anyadirActor(Pelicula p, String actor) {
        anyadirPelicula(p);
        List<String> actores = this.reparto.get(p);
        actores.add(actor);
    }

    public String salidaBonita() {
        String salida = "";
        for (Map.Entry<Pelicula, List<String>> entrada :
                this.reparto.entrySet()
                ) {
            Pelicula actual = entrada.getKey();
            salida += String.format("%20s (%4s)- Actores: ", actual.getTitulo(), actual.getAnyo());
            List<String> listaActores = entrada.getValue();
            for (String s :
                    listaActores) {
                salida += s + ", ";
            }
            salida = salida.substring(0, salida.length() - 2);
            System.out.println("DE");
            salida += "\n";
        }
        return salida;
    }

    public List<Pelicula> participa(String actor) {
        List<Pelicula> salida = new ArrayList<>();
        for (Map.Entry<Pelicula, List<String>> entrada :
                this.reparto.entrySet()
                ) {
            if (entrada.getValue().contains(actor)) {
                salida.add(entrada.getKey());
            }
        }
        return salida;
    }

    public VideoClub() {
        this.reparto = new TreeMap<>(new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                if (o1.getAnyo() == o2.getAnyo()) {
                    return o1.getTitulo().compareTo(o2.getTitulo());
                }
                return Integer.compare(o2.getAnyo(), o1.getAnyo());
            }
        });
    }
}
