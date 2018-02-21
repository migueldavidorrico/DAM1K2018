import java.util.*;

public class ListaEnteros {
    public static void main(String[] args) {
        List<Character> letras=new LinkedList<>();

        Character[] vectorLetras={'f','y','a','a','h','a','b','a'};
        letras.addAll(Arrays.asList((vectorLetras)));
        System.out.println(letras.toString());
//        while(letras.remove((Character)'a'));

//        System.out.println(letras.toString());

//        for (int i = 0; i < letras.size(); i++) {
//            if(letras.get(i).equals('a')){
//                letras.remove(i--);
//
//            }
//        }
        Iterator<Character> miIterador=letras.iterator();
        while(miIterador.hasNext()){
            char actual=miIterador.next();
            System.out.print(actual);
            if(actual=='a'){
                System.out.println("UNA ");
                miIterador.remove();
            }
        }
        System.out.println();
        System.out.println(letras.toString());

    }
}
