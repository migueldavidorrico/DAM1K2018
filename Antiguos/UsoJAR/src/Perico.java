import es.orrico.miguel.EstadisticasTabla;
import es.orrico.miguel.EstadisticasTablaUnRecorrido;
import es.orrico.miguel.Utilidades;

public class Perico {
    public static void main(String[] args) {
        int[][] m={{1,2},{1,2}};
        Utilidades.muestraTabla(m);
        EstadisticasTablaUnRecorrido.tablaEstadisticas(m);
    }
}
