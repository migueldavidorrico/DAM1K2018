import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class PilaCorchetes {
    public static void main(String[] args) {
        String expresion1 = "(4+[5*23)/5*(3-2))";
        String expresion2 = "(((7-2+6)))";
        String expresion3 = "{((7-2+6)})";
        String expresion4 = "((7-2+6)))(";
        int pos = compruebaCorrecta(expresion3);
        System.out.println(expresion3);
        for (int i = 0; i < pos; i++) System.out.print(" ");
        System.out.println("^");

    }

    private static int compruebaCorrecta(String expresion) {
        try {
            Deque<Character> pila = new ArrayDeque<>();

            for (int i = 0; i < expresion.length(); i++) {
                switch (expresion.charAt(i)) {
                    case '(':
                    case '[':
                    case '{':
                        pila.push(expresion.charAt(i));
                        break;
                    case ')':
                        char c = pila.pop();
                        if (c != '(') {
                            System.out.println("ERROR, paréntesis no emparejado");
                            return i;
                        }
                        break;
                    case ']':
                        c = pila.pop();
                        if (c != '[') {
                            System.out.println("ERROR, corchete no emparejado");
                            return i;
                        }
                        break;
                    case '}':
                        c = pila.pop();
                        if (c != '{') {
                            System.out.println("ERROR, llave no emparejado");
                            return i;
                        }
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
        return 0;
    }
}
