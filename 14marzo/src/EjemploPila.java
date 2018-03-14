import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class EjemploPila {
    public static void main(String[] args) {
//        String expresion="(4+(5*23)/5*(3-2))";
//        String expresion="(((7-2+6)))";
//        String expresion=")((7-2+6)))";
        String expresion = "((7-2+6)))(";
        try {
            Deque<Character> pila = new ArrayDeque<>();
            for (int i = 0; i < expresion.length(); i++) {
                switch (expresion.charAt(i)) {
                    case '(':
                        pila.push('*');
                        break;
                    case ')':
                        pila.pop();
                        break;
                }
            }
            if (!pila.isEmpty()) {
                System.out.println("ERROR, muchos abiertos");
            } else {
                System.out.println("La expresión es correcta");
            }
        } catch (NoSuchElementException nse) {
            System.out.println("ERROR, se cierra uno sin abrir");
        }

    }
}
