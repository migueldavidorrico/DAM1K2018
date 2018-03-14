import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Parentesis {
    public static void main(String[] args) {
        String expresion=")(((a+b)*6)";
        Deque<Character> pila=new ArrayDeque<>();
        try {
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
            if(pila.isEmpty()){
                System.out.println("La expresión está bien formada");
            } else {

            }
        } catch(NoSuchElementException nsee){
            System.out.println("La expresion no es correcta");
        }

    }
}
