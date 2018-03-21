import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntosUsuarios {
    public static void main(String[] args) {
        Set<Usuario> conjunto1 = new TreeSet<>();
        conjunto1.add(new Usuario("Ana", "123456"));
        conjunto1.add(new Usuario("Clara", "juanito"));
        conjunto1.add(new Usuario("Ana", "123456"));
        conjunto1.add(new Usuario("Ana", "45345"));
        conjunto1.add(new Usuario("Delia", "123456"));
        conjunto1.add(new Usuario("Clara", "123456"));
        conjunto1.add(new Usuario("Bea", "123456"));
        for (Usuario u :
                conjunto1) {
            System.out.println(u);
        }
    }
}
