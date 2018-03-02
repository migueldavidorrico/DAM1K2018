import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class FechaCelebre {
    private final LocalDate fecha;
    private final String motivo;

    public FechaCelebre(String fecha, String motivo) {
        try {
            Locale es = new Locale("es", "ES");
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate fecha2 = LocalDate.parse(fecha, dateTimeFormatter);
            compruebaDatos(fecha2, motivo);
            this.fecha = fecha2;
            this.motivo = motivo;
        } catch (DateTimeParseException dtpe) {
            throw new IllegalArgumentException("La fecha no esta en el formato adecuado");
        }

    }

    public boolean caeEnFecha(LocalDate fecha) {
        int diaFecha = this.fecha.getDayOfMonth();
        Month mesFecha = this.fecha.getMonth();
        int diaFechaPasada = fecha.getDayOfMonth();
        Month mesFechaPasada = fecha.getMonth();
        return diaFecha == diaFechaPasada && mesFecha.equals(mesFechaPasada);
    }

    public FechaCelebre(LocalDate fecha, String motivo) {
        compruebaDatos(fecha, motivo);
        this.fecha = fecha;
        this.motivo = motivo;
    }

    private void compruebaDatos(LocalDate fecha, String motivo) {
        if (motivo == null) {
            throw new IllegalArgumentException("El motivo es nulo");
        }
        if (motivo.isEmpty()) {
            throw new IllegalArgumentException("el motivo está vacío");
        }
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    @Override
    public String toString() {
        return "El " + fecha +
                " se celebra " + motivo;
    }

    public static void main(String[] args) {
        FechaCelebre f = new FechaCelebre("gvfdn", "vdlks");
    }
}
