import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class EjemploENUM {
    public static void main(String[] args) {
        JOptionPane.showOptionDialog(
                null,
                "Elige",
                "Opciones",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                opciones.values(),
                opciones.values()[0]);
    }
}

enum opciones {
    OPCION1("Primera"),
    OPCION2("Segunda"),
    OPCION3("Tercera");

    String cadena;

    @Override
    public String toString() {
        return this.cadena;
    }

    opciones(String tercera) {
        this.cadena = tercera;
    }
}
