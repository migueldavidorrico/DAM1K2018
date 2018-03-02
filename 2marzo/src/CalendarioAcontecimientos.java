import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CalendarioAcontecimientos {
    public static void main(String[] args) throws IOException {
        List<String> efemerides = Files.readAllLines(Paths.get("efemeride"), Charset.forName("UTF-8"));
        System.out.println(efemerides);
        List<FechaCelebre> fechas = new ArrayList<>();
        for (String s :
                efemerides) {
            String[] partes = s.split(":");
            fechas.add(new FechaCelebre(partes[0], partes[1]));
        }
        System.out.println(fechas);
        LocalDate hoy = LocalDate.now();
        for (FechaCelebre f :
                fechas) {
            if (f.caeEnFecha(hoy)) {
                System.out.println("Hoy se celebra " + f);
            }
        }
        fechas.sort(new Comparator<FechaCelebre>() {
            @Override
            public int compare(FechaCelebre o1, FechaCelebre o2) {
//                Period.between(,)
                return 0;
            }
        });
    }
}
