import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InstalacionButano implements Serializable {
    private final String IDCliente;
    private transient String caracteristicas;
    private final List<LocalDate> listaRevisiones;

    public boolean addRevision() {
        return addRevision(LocalDate.now());
    }

    public boolean addRevision(LocalDate fecha) {
        Iterator<LocalDate> fechasGuardadas = this.listaRevisiones.iterator();
        while (fechasGuardadas.hasNext()) {
            LocalDate fechaActual = fechasGuardadas.next();
            if (fecha.isBefore(fechaActual)) {
                throw new IllegalArgumentException("Fecha no válida. Ya hay una revisión posterior");
            }
            if (fecha.isEqual(fechaActual)) {
                throw new IllegalArgumentException("Fecha no válida. Ya se ha guardado una revisiçón ese día");
            }
        }
        return listaRevisiones.add(fecha);
    }

    public String getIDCliente() {
        return IDCliente;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public List<LocalDate> getListaRevisiones() {
        return listaRevisiones;
    }

    @Override
    public String toString() {
        String salida = "";
        salida += IDCliente + "-" + caracteristicas + '\n';
        for (LocalDate revision :
                listaRevisiones) {
            salida += "  =>" + revision + "\n";
        }
        return salida;
    }

    public InstalacionButano(String IDCliente, String caracteristicas) {
        if (IDCliente == null ||
                IDCliente.isEmpty() ||
                caracteristicas == null ||
                caracteristicas.isEmpty()) {
            throw new IllegalArgumentException("Error en los datos de creación");
        }
        this.IDCliente = IDCliente.trim();
        this.caracteristicas = caracteristicas.trim();
        this.listaRevisiones = new ArrayList<>();
    }
}
