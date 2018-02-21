import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class OrdenarStrings {
    public static void main(String[] args) {

        String[] cadenas = new String[]{"Cantabria", "Álava", "Alava", "alava","Ñuela","Madrid","Oviedo"};
        Arrays.sort(cadenas);
        System.out.println(Arrays.toString(cadenas));
        Collator bueno=Collator.getInstance(new Locale("es"));
        Collator bueno2=Collator.getInstance(new Locale("es"));
        Collator bueno3=Collator.getInstance(new Locale("es"));
        Arrays.sort(cadenas,bueno);
        System.out.println(Arrays.toString(cadenas));
        bueno.setStrength(Collator.PRIMARY);
        Arrays.sort(cadenas,bueno);
        System.out.println("PRIMARY"+Arrays.toString(cadenas));
        bueno2.setStrength(Collator.SECONDARY);
        Arrays.sort(cadenas,bueno2);
        System.out.println("SECONDARY"+Arrays.toString(cadenas));
        bueno3.setStrength(Collator.TERTIARY);
        Arrays.sort(cadenas,bueno3);
        System.out.println("TERTIARY"+Arrays.toString(cadenas));
        System.out.println(bueno3.compare("Alava", "álava"));

    }
}
