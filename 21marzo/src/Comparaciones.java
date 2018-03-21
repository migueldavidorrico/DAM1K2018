import java.util.*;

public class Comparaciones {
    public static void main(String[] args) {
        Set<EdificioAlto> conjunto = new TreeSet<>();
        conjunto.add(new EdificioAlto("Empire State", 300, 1900));
        conjunto.add(new EdificioAlto("Torre Eiffel", 600, 1940));
        conjunto.add(new EdificioAlto("Chrysler", 200, 1800));
        conjunto.add(new EdificioAlto("Hotel Bali", 600, 1880));
        System.out.println(conjunto);
        Map<Integer, EdificioAlto> unoPorSiglo = new HashMap<>();
        Iterator<EdificioAlto> edificioAltoIterator = conjunto.iterator();
        while (edificioAltoIterator.hasNext()) {
            EdificioAlto e = edificioAltoIterator.next();
            if (!unoPorSiglo.containsKey(e.getAnyoConstruccion() / 100)) {
                unoPorSiglo.put(e.getAnyoConstruccion() / 100, e);
            } else {
                System.out.println("Siglo ya ocupado");
            }
        }
        System.out.println(unoPorSiglo);
        for (Map.Entry<Integer, EdificioAlto> entrada :
                unoPorSiglo.entrySet()) {
            System.out.printf("En el siglo: %3s tenemos el edificio %10s%n",
                    entrada.getKey(), entrada.getValue().getNombre());
        }
        System.out.println("-------------------------------");
        EdificioAlto e = unoPorSiglo.get(18);
        e.setNombre(e.getNombre().toUpperCase());
        unoPorSiglo.put(18, e);
        for (Integer i :
                unoPorSiglo.keySet()) {
            e = unoPorSiglo.get(i);

            System.out.printf("En el siglo: %3s tenemos el edificio %10s%n",
                    i, e.getNombre());
        }

    }

}

class ComparaPorAnyo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        EdificioAlto uno = (EdificioAlto) o1;
        EdificioAlto dos = (EdificioAlto) o2;
        return Integer.compare(uno.getAnyoConstruccion(), dos.getAnyoConstruccion());
    }
}

class EdificioAlto implements Comparable {
    String nombre;
    int altura;
    int anyoConstruccion;

    public EdificioAlto(String nombre, int altura, int anyoConstruccion) {
        this.nombre = nombre;
        this.altura = altura;
        this.anyoConstruccion = anyoConstruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setAnyoConstruccion(int anyoConstruccion) {
        this.anyoConstruccion = anyoConstruccion;
    }

    public int getAnyoConstruccion() {
        return anyoConstruccion;
    }

    @Override
    public String toString() {
        return "EdificioAlto{" +
                "nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", anyoConstruccion=" + anyoConstruccion +
                "}\n";
    }

    @Override
    public int compareTo(Object o) {
        EdificioAlto e = (EdificioAlto) o;
        if (e.getAltura() == this.getAltura()) {
            return this.getNombre().compareTo(e.getNombre());
        }
        return Integer.compare(e.getAltura(), this.getAltura());
    }


}
