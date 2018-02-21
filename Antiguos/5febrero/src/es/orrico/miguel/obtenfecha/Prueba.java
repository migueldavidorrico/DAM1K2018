package es.orrico.miguel.obtenfecha;

import java.time.LocalDate;
import java.time.Period;

public class Prueba {
    public static void main(String[] args) {
        UtilidadFecha fecha = new UtilidadFecha()
                .setAnyominimo(1960)
                .pideTodaLaFecha();
        if (fecha != null) {
            if (fecha.isEsBuenaLaFecha()) {
                int anyos = Period.between(fecha.getFecha(), LocalDate.now()).getYears();
                System.out.println("Tienes " + anyos + " años");
            }
        } else {
            System.out.println("HAS CANCELADO");
        }


    }
}
