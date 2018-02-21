import javax.swing.*;

/*
Pedir 3 veces un nombre de país, el dominio geográfico del país y
el idioma
El nombre del paíos debe empezar por mayúsculas y seguir por minúsculas y no estar vacío
El dominio geográfico debe empezar en un punto y tener dos caracteres (aparte del
punto)
el idioma debe ser "Español, Inglés, Portugués u Otro"
Debemos devolver el idioma más hablado.
 */
public class Paises {
    public static void main(String[] args) {
        for (int i=0;i<3;i++) {
            String nombrePais;
            String cadenaError;
            do {
                nombrePais = JOptionPane.showInputDialog(null, "Nombre del País:");
                cadenaError="";
                if (nombrePais == null) {
                    cadenaError += "No puedes pulsar Cancelar o X roja";
                } else if (nombrePais.length() == 0) {
                    cadenaError += "No puede estar vacío";
                } else {
                    String primerCaracter = nombrePais.substring(0, 1);
                    String restoCaracteres = nombrePais.substring(1);
                    if (!primerCaracter.toUpperCase().equals(primerCaracter)) {
                        cadenaError += "\nEl primer caracter debe estar en mayúsculas";
                    }
                    if (!restoCaracteres.toLowerCase().equals(restoCaracteres)) {
                        cadenaError += "\nA partir del segundo caracter, en minúsculas";
                    }
                }
                if (!cadenaError.equals("")) {
                    JOptionPane.showMessageDialog(null, cadenaError);
                }
            } while(!cadenaError.equals(""));
            String dominio;
            String cadenaErrorDominio;
            do {
                dominio = JOptionPane.showInputDialog(null, "Dominio del país:");
                cadenaErrorDominio="";
                if (dominio == null) {
                    cadenaErrorDominio += "No puedes pulsar Cancelar o X roja";
                } else {
                    if (dominio.length() != 3) {
                        cadenaErrorDominio += "La longitud no es correcta";
                    }
                    if(dominio.charAt(0)!='.'){
                        cadenaErrorDominio +="\nDebe empezar con un punto";
                    }
                }
                if (!cadenaErrorDominio.equals("")) {
                    JOptionPane.showMessageDialog(null, cadenaErrorDominio);
                }
            } while(!cadenaErrorDominio.equals(""));
        }
    }
}
