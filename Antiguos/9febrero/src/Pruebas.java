import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate fecha2= LocalDate.parse("1/3/2016",dateTimeFormatter);
        System.out.println(fecha2.format(dateTimeFormatter));
        System.out.println(fecha2);
//        String[] p={"rew","43","fds"};
//        List<String> lista= Arrays.asList(p);
//        lista.add("Cuatro");
        List<String> listaModificable= new ArrayList<>(Arrays.asList("UNO","DOS","TRES"));
        listaModificable.add("Cuatro");
        System.out.println(listaModificable);
    }
}
