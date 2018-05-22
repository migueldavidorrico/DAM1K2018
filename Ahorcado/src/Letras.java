public class Letras {
    private char letra;
    private EstadoLetra estado;

    public Letras(char letra) {
        this.letra = letra;
        this.estado = EstadoLetra.OCULTA;
    }

    public String getCadena() {
        String salida = "";
        salida += this.estado.equals(EstadoLetra.VISIBLE) ? letra : '-';
        return salida;
    }

    @Override
    public String toString() {
        return "Letras{" +
                "letra=" + letra +
                ", estado=" + estado +
                '}';
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public EstadoLetra getEstado() {
        return estado;
    }

    public void setEstado(EstadoLetra estado) {
        this.estado = estado;
    }
}
