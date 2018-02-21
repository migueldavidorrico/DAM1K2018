import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CuantosAnyos {
    public static void main(String[] args) {
        LocalDate ahora=LocalDate.now();
        System.out.println(ahora);
        LocalDate nacimiento=LocalDate.of(1990, Month.AUGUST,23);
        System.out.println(nacimiento);
        int anyos=Period.between(nacimiento,ahora).getYears();
        int meses=Period.between(nacimiento,ahora).getMonths();
        int dias=Period.between(nacimiento,ahora).getDays();
        System.out.println(ChronoUnit.DAYS.between(nacimiento, ahora));
        System.out.println(anyos + " " + meses + " " + dias);
    }
}
