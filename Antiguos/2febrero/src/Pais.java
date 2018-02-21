public class Pais implements Comparable {
    private final String nombreIngles;
    private final String nombreFrances;
    private final String cancion;
    private final String candidato;

    public void setOrdenParticipacion(int ordenParticipacion) {
        this.ordenParticipacion = ordenParticipacion;
    }

    private int ordenParticipacion;
    private int puntuacion;


    @Override
    public String toString() {
        return String.format("%2d- %10s - %10s %3d points",
                ordenParticipacion,
                nombreIngles,
                cancion,
                puntuacion);
    }

    public String getNombreIngles() {
        return nombreIngles;
    }

    public String getNombreFrances() {
        return nombreFrances;
    }

    public String getCancion() {
        return cancion;
    }

    public String getCandidato() {
        return candidato;
    }

    public int getOrdenParticipacion() {
        return ordenParticipacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Pais(String nombreIngles, String nombreFrances, String cancion, String candidato) {
        this.nombreIngles = nombreIngles;
        this.nombreFrances = nombreFrances;
        this.cancion = cancion;
        this.candidato = candidato;
        this.puntuacion=0;
    }

    @Override
    public int compareTo(Object o) {
        Pais otro=(Pais) o;
        return this.ordenParticipacion-otro.ordenParticipacion;
    }
}
