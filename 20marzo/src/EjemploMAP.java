import java.util.*;

public class EjemploMAP {
    public static void main(String[] args) {
        Map<String, String> infoAna = new TreeMap<>();
        infoAna.put("Teléfono", "66667777");
        infoAna.put("Edad", "24");
        infoAna.put("Profesión", "Informática");
        infoAna.put("Mascotas", "No tiene");
        System.out.println(infoAna);
        System.out.println(infoAna.get("Edad"));
        System.out.println(infoAna.values());
        System.out.println(infoAna.keySet());
        Iterator iterator = infoAna.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> actual = (Map.Entry<String, String>) iterator.next();
            System.out.println(actual.getKey() + " -> " + actual.getValue());
        }
        System.out.println("---------------------------------");
        for (Map.Entry e :
                infoAna.entrySet()) {
            System.out.println(e.getKey() + " ****" + e.getValue());
        }
        infoAna.putAll(infoAna);
    }
}
