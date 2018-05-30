import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ListadoPalabras {
    public static final String nombreFichero = "palabras.1k";
    List<String> palabras;

    public ListadoPalabras() {
        palabras = new ArrayList<>();
        //Podríamos leer siempre de internet pero así practicamos ficheros
        File fichero = new File(nombreFichero);
        if (!fichero.exists()) {
            leeDeInternet("https://raw.githubusercontent.com/javierarce/palabras/master/listado-general.txt");
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
                oos.writeObject(palabras);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
                palabras = (List<String>) ois.readObject();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

    public String obtenerPalabra() {
        int elegido = (int) (Math.random() * palabras.size());
        return palabras.get(elegido);
    }

    private void leeDeInternet(String s) {
        try {
            InputStream input = new URL(s).openStream();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                    linea = linea.trim();
                    linea = linea.toLowerCase();
                    if (linea.indexOf('á') != -1
                            || linea.indexOf('é') != -1
                            || linea.indexOf('í') != -1
                            || linea.indexOf('ó') != -1
                            || linea.indexOf('ú') != -1
                            || linea.indexOf('ü') != -1
                            || linea.indexOf('ï') != -1
                            || linea.indexOf('ñ') != -1
                            || linea.length() < 4
                            || linea.length() > 8) {
                        System.out.println("Quitamos las " + linea);
                    } else {
                        palabras.add(linea);
                        System.out.println("Ponemos " + linea);
                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ListadoPalabras listadoPalabras = new ListadoPalabras();
    }
}
