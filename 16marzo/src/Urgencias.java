import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Urgencias {
    public static void main(String[] args) {
        PriorityQueue<Paciente> salaEspera = new PriorityQueue<>(new Comparator<Paciente>() {
            @Override
            public int compare(Paciente o1, Paciente o2) {
                return Integer.compare(o1.gravedad, o2.gravedad);
            }
        });
        salaEspera.add(new Paciente("Ana", 10));
        salaEspera.add(new Paciente("Bea", 1));
        salaEspera.add(new Paciente("Clara", 1));
        salaEspera.add(new Paciente("Delia", 1));
        salaEspera.add(new Paciente("Elena", 3));
        salaEspera.add(new Paciente("Flori", 5));
        salaEspera.add(new Paciente("Gelen", 1));
        salaEspera.add(new Paciente("Helen", 3));
        salaEspera.add(new Paciente("Ines", 1));
        salaEspera.add(new Paciente("Julia", 1));
        salaEspera.add(new Paciente("Karen", 1));
        salaEspera.add(new Paciente("Lucia", 1));
        salaEspera.add(new Paciente("Marta", 1));

        while (!salaEspera.isEmpty()) {
            System.out.println(" SE atiende a: " + salaEspera.poll());
        }
        System.out.println("------------------------------------------VAN EMPEORANDO");
        salaEspera.add(new Paciente("Ana", 10));
        salaEspera.add(new Paciente("Bea", 1));
        salaEspera.add(new Paciente("Clara", 1));
        salaEspera.add(new Paciente("Delia", 1));
        salaEspera.add(new Paciente("Elena", 3));
        salaEspera.add(new Paciente("Flori", 5));
        salaEspera.add(new Paciente("Gelen", 1));
        salaEspera.add(new Paciente("Helen", 3));
        salaEspera.add(new Paciente("Ines", 1));
        salaEspera.add(new Paciente("Julia", 1));
        salaEspera.add(new Paciente("Karen", 1));
        salaEspera.add(new Paciente("Lucia", 1));
        salaEspera.add(new Paciente("Marta", 1));

        while (!salaEspera.isEmpty()) {
            System.out.println(" SE atiende a: " + salaEspera.poll());
            salaEspera = todosMasGraves(salaEspera);
        }


    }

    private static PriorityQueue<Paciente> todosMasGraves(PriorityQueue<Paciente> salaEspera) {
        PriorityQueue<Paciente> salida = new PriorityQueue<>(new Comparator<Paciente>() {
            @Override
            public int compare(Paciente o1, Paciente o2) {
                return Integer.compare(o1.gravedad, o2.gravedad);
            }
        });
        while (!salaEspera.isEmpty()) {
            Paciente actual = salaEspera.poll();
            if (actual.getGravedad() > 1) {
                actual.setGravedad(actual.getGravedad() - 1);
            }
            salida.add(actual);
        }
        return salida;
    }
}
