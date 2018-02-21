import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalField;

/**
 * Clase para fechas o no se ué
 */
public class ApuntesFechas {
    /**
     * Principal
     * @param args lo de la línea de comandos
     */
    public static void main(String[] args) {
        LocalDateTime ahora=LocalDateTime.now();
        System.out.println(ahora);
        LocalDate hoy=LocalDate.now();
        System.out.println(hoy);
        LocalTime hora=LocalTime.now();
        System.out.println(hora);
        //Prueba de crear el 21 de enero de 2017 a las 17:50
        LocalDateTime fecha1=LocalDateTime.of(2017,1,21,17,50);
        System.out.println(fecha1.getMonth());
        System.out.println(fecha1.getDayOfWeek());
        LocalDateTime fecha2=LocalDateTime.of(2017, Month.NOVEMBER,21,17,50);
        LocalDate ultima=LocalDate.of(2017,Month.DECEMBER,31);
        ultima=ultima.plusWeeks(1);
        System.out.println(ultima);
        //En qué caen todos los 1 de mes del año 2018

        for (int i = 1; i <=12 ; i++) {
            LocalDate primeroMes = LocalDate.of(2018, i, 1);
            System.out.println(primeroMes.getDayOfWeek()+" "+primeroMes);
        }

    }
}
