import java.util.ArrayList;
import java.util.List;

public class ModificarLista {
    public static void main(String[] args) {
        List<Pais> onu = new ArrayList<>();
        onu.add(new Pais("España", "Madrid"));
        onu.add(new Pais("Portugal", "Lisboa"));
        onu.add(new Pais("Francia", "Paris"));
        onu.add(new Pais("UK", "Londres"));
        escribePaises(onu);
        for (int i = 0; i < onu.size(); i++) {
            onu.set(i, new Pais("Ittalia", "Roma"));
        }
        escribePaises(onu);
    }

    private static void escribePaises(List<Pais> onu) {
        for (Pais pais :
                onu) {
            System.out.println(pais);
        }
    }
}
