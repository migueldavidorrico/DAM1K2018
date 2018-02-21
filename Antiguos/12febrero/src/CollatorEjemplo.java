import java.lang.reflect.Array;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class CollatorEjemplo {
    public static void main(String[] args) {
        String[] palabras={"Ángel","Aurora","Bea","Clara"};
        Arrays.sort(palabras);
        System.out.println(Arrays.toString(palabras));
        Arrays.sort(palabras, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(Arrays.toString(palabras));
        Collator collator=Collator.getInstance(new Locale("es","ES"));
        Arrays.sort(palabras,collator);
        System.out.println(Arrays.toString(palabras));
    }
}
