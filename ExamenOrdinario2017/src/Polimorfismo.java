import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {
    public static void main(String[] args) {
        List<Animal> granja = new ArrayList<>();
        granja.add(new Perro("Bobby"));
//        granja.add(new Gato("Misifú"));
//        granja.add(new Vaca("La vaca que ríe"));
        for (Animal a : granja) {
            System.out.println(a.comunicarse());
        }
    }
}
