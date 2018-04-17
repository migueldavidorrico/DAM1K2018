public class Pelicula implements Comparable {
    final String titulo;
    final int anyo;

    public Pelicula(String titulo, int anyo) {
        this.titulo = titulo;
        this.anyo = anyo;
    }


    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anyo=" + anyo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pelicula pelicula = (Pelicula) o;

        if (anyo != pelicula.anyo) return false;
        return titulo != null ? titulo.equals(pelicula.titulo) : pelicula.titulo == null;
    }

    @Override
    public int hashCode() {
        int result = titulo != null ? titulo.hashCode() : 0;
        result = 31 * result + anyo;
        return result;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    @Override
    public int compareTo(Object o) {
        return this.getTitulo().compareTo(((Pelicula) o).getTitulo());
    }
}
