import java.io.*;
import java.util.Properties;

public class PrimerasLineas {
    public static void main(String[] args) throws IOException {
        File prop = new File("mio.ini");
        FileInputStream is = new FileInputStream(prop);
        Properties preferences = new Properties();
        preferences.load(is);
        preferences.storeToXML(new FileOutputStream("prueba.xml"), "Titulo Mio");
        String nombreFichero = "";
        File fichero;
        int numeroLineas = Integer.parseInt((String) preferences.get("LINEAS"));
        if (args.length < 1) {
            System.out.println("Por lo menos necesito un fichero para leer");
            return;
        }
        if (args.length > 2) {
            System.out.println("Demasiados argumentos");
        }
        nombreFichero = args[0];
        fichero = new File(nombreFichero);
        if (!fichero.exists()) {
            System.out.println("El fichero no existe");
            return;
        }
        if (args.length == 2) {
            try {
                numeroLineas = Integer.parseInt(args[1]);
                if (numeroLineas < 1) {
                    numeroLineas = Integer.parseInt((String) preferences.get("LINEAS"));
                    ;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("El segundo parámetro debe ser un numero entero");
                return;
            }
        } else {
            numeroLineas = Integer.parseInt((String) preferences.get("LINEAS"));
            ;
        }
        System.out.println("Del fichero: " + nombreFichero + " se imprimirán las " + numeroLineas + " líneas");

        //Todo bien
        try (
                BufferedReader br = new BufferedReader(new FileReader(fichero));
        ) {
            String linea;
            int lineasEscritas = 0;
            while ((linea = br.readLine()) != null && lineasEscritas++ < numeroLineas) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Si pasa esto, ya es casualidad, se ha borrado el fichero justo enmedio");
            e.printStackTrace();
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
