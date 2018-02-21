package es.orrico.miguel.obtenfecha;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MesTraducido {
    Month mes;
    String traduccion;
    Locale locale;

    MesTraducido(Month mes, Locale locale) {
        this.mes = mes;
        this.locale = locale;
    }

    public Month getMes() {
        return mes;
    }

    public void setMes(Month mes) {
        this.mes = mes;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    @Override
    public String toString() {
        return this.mes.getDisplayName(TextStyle.FULL, locale);
    }
}
