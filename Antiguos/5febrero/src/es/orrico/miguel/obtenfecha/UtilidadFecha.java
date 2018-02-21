package es.orrico.miguel.obtenfecha;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Locale;

public class UtilidadFecha {
    private int anyominimo = 2001;

    public UtilidadFecha setAnyominimo(int anyominimo) {
        this.anyominimo = anyominimo;
        return this;
    }

    Locale locale;
    int anyo;
    Month mes;
    int dia;
    boolean esBuenaLaFecha = false;
    LocalDate fecha;

    UtilidadFecha() {
        this("es");

    }

    UtilidadFecha(String locale) {
        this.locale = Locale.forLanguageTag(locale);
    }

    public UtilidadFecha pideTodaLaFecha() {
        this.pideAnyo();
        if (!isEsBuenaLaFecha()) {
            return null;
        }
        this.pideMes();
        if (!isEsBuenaLaFecha()) {
            return null;
        }
        this.pideDia();
        if (!isEsBuenaLaFecha()) {
            return null;
        }
        this.fecha = LocalDate.of(this.anyo, this.mes, this.dia);
        this.esBuenaLaFecha = true;
        return this;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Month getMes() {
        return mes;
    }

    public void setMes(Month mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public boolean isEsBuenaLaFecha() {
        return esBuenaLaFecha;
    }

    public void setEsBuenaLaFecha(boolean esBuenaLaFecha) {
        this.esBuenaLaFecha = esBuenaLaFecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Locale.getAvailableLocales()));
        UtilidadFecha f = new UtilidadFecha("es");
        f.pideAnyo();
        System.out.println(f.anyo);
        f.pideMes();
        f.pideDia();
    }

    private void pideDia() {
        this.esBuenaLaFecha = false;
        LocalDate primeroMes = LocalDate.of(this.anyo, this.mes, 1);
        System.out.println(primeroMes.lengthOfMonth());
        int numeroDias = primeroMes.lengthOfMonth();
        Integer[] dias = new Integer[numeroDias];
        for (int i = 0; i < dias.length; i++) {
            dias[i] = i + 1;
        }
        Integer introducido = (Integer) JOptionPane.showInputDialog(null,
                "Selecciona el día",
                "DIA",
                JOptionPane.PLAIN_MESSAGE,
                null,
                dias,
                dias[0]);
        if (introducido == null) {
            this.esBuenaLaFecha = false;
            return;
        }
        this.esBuenaLaFecha = true;
        this.dia = introducido;

    }

    private void pideMes() {
        this.esBuenaLaFecha = false;
        MesTraducido[] misMeses = new MesTraducido[12];
        for (int i = 0; i < Month.values().length; i++) {
            misMeses[i] = new MesTraducido(Month.values()[i], this.locale);
        }
        MesTraducido introducido = (MesTraducido) JOptionPane.showInputDialog(null,
                "Selecciona el mes",
                "MES",
                JOptionPane.PLAIN_MESSAGE,
                null,
                misMeses,
                misMeses[0]);
        if (introducido == null) {
            this.esBuenaLaFecha = false;
            return;
        }
        this.mes = introducido.getMes();
        this.esBuenaLaFecha = true;


    }

    private void pideAnyo() {
        LocalDate ahora = LocalDate.now();
        pideAnyo(this.anyominimo, ahora.getYear());
    }


    private void pideAnyo(int numero) {
        LocalDate ahora = LocalDate.now();
        pideAnyo(numero, ahora.getYear());
    }

    private void pideAnyo(int numeroInicial, int numeroFinal) {
        Integer[] anyos = new Integer[numeroFinal - numeroInicial + 1];
        for (int i = 0; i < anyos.length; i++) {
            anyos[i] = numeroFinal - i;
        }
        Integer introducido = (Integer) JOptionPane.showInputDialog(null,
                "Selecciona el año",
                "Año",
                JOptionPane.PLAIN_MESSAGE,
                null,
                anyos,
                anyos[0]);
        if (introducido == null) {
            this.esBuenaLaFecha = false;
            return;
        }
        this.anyo = introducido;
        this.esBuenaLaFecha = true;
    }
}
