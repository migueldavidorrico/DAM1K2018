import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Repsol {
    public static void imprimeLista(List<InstalacionButano> lista) {
        for (InstalacionButano i :
                lista) {
            System.out.println("CLIENTE: \n-------------------");
            System.out.println(i);
        }
    }

    public static void revisaLista(List<InstalacionButano> lista, LocalDate fecha) {
        Iterator<InstalacionButano> iterador = lista.iterator();
        while (iterador.hasNext()) {
            InstalacionButano instalacionButano = iterador.next();
            instalacionButano.addRevision(fecha);
        }
    }

    public static void revisaCliente(List<InstalacionButano> lista, LocalDate fecha, String cliente) {
        List<InstalacionButano> instalacionesCliente = new ArrayList<>();
        Iterator<InstalacionButano> iterador = lista.iterator();
        while (iterador.hasNext()) {
            InstalacionButano instalacionButano = iterador.next();
            if (instalacionButano.getIDCliente().startsWith(cliente.toUpperCase())) {
                instalacionesCliente.add(instalacionButano);
            }
        }
        revisaLista(instalacionesCliente, fecha);
    }

    public static void revisaTipo(List<InstalacionButano> lista, LocalDate fecha, String descripcion) {
        List<InstalacionButano> instalacionesCliente = new ArrayList<>();
        Iterator<InstalacionButano> iterador = lista.iterator();
        while (iterador.hasNext()) {
            InstalacionButano instalacionButano = iterador.next();
            if (instalacionButano.getCaracteristicas().toUpperCase().contains(descripcion.toUpperCase())) {
                instalacionesCliente.add(instalacionButano);
            }
        }
        revisaLista(instalacionesCliente, fecha);
    }

    public static void main(String[] args) {
        List<InstalacionButano> elche = new ArrayList<>();
        elche.add(new InstalacionButano("ANA0001", "Propano, dos botellas"));
        elche.add(new InstalacionButano("ANA0002", "Jardín, una botella de butano"));
        elche.add(new InstalacionButano("ANA0003", "Sotano, gas natural"));
        elche.add(new InstalacionButano("BEA0001", "Propano, tres botellas"));
        elche.add(new InstalacionButano("CLA0005", "Propano, cinco botellas"));
        elche.add(new InstalacionButano("CLA0009", "Garaje, dos botellas"));
        elche.add(new InstalacionButano("ISA0001", "Gas natural, directo a la cocina"));
        elche.add(new InstalacionButano("RUT0002", "Propano, una sola botella"));

        revisaLista(elche, LocalDate.of(1992, Month.AUGUST, 12));

        imprimeLista(elche);
        revisaCliente(elche, LocalDate.of(2001, Month.APRIL, 12), "ana");
        imprimeLista(elche);
        revisaTipo(elche, LocalDate.now(), "propano");
        imprimeLista(elche);
        eliminaConMasDeDosRevisiones(elche);
        System.out.println("TRAS ELIMINAR-----------------------------------------");
        imprimeLista(elche);
        ListIterator<InstalacionButano> li = elche.listIterator();

    }

    private static void eliminaConMasDeDosRevisiones(List<InstalacionButano> elche) {
        Iterator<InstalacionButano> miIterador = elche.iterator();
        while (miIterador.hasNext()) {
            InstalacionButano actual = miIterador.next();
            if (actual.getListaRevisiones().size() >= 2) {
                miIterador.remove();
            }
        }
    }
}
