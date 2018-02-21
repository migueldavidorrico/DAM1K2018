import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LeePersonasFichero {
    public static void main(String[] args) throws IOException {
        List<Persona> personas=new ArrayList<>();
        try {
            String nombreFichero = "personas";
            List<String> lineas = Files.readAllLines(Paths.get(nombreFichero), Charset.forName("UTF-8"));
            System.out.println(lineas);
            for (String lineaActual :
                    lineas) {
                try {
                    String[] datos = lineaActual.split(":");

                    System.out.println(Arrays.toString(datos));
                    int edad;
                    try {
                        edad = Integer.parseInt(datos[1]);
                    } catch (NumberFormatException nfe) {
                        System.out.println("La edad de: " + datos[0] + " no es válida");
                        continue;
                    }
                    personas.add(new Persona(datos[0], edad, datos[2]));
                } catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("No hay datos suficientes en una línea");
                } catch(IllegalArgumentException e){
                    System.out.println("ERROR EN LA CREACION:" + e.getMessage());
                }
            }

        } catch(NoSuchFileException nsfe){
            System.out.println("EL ARCHIVO NO EXISTE");
        }
        System.out.println("Leidas : "+personas.size()+" personas");

        //Ejemplo Iterator
        Iterator<Persona> personaIterator=personas.iterator();
        while(personaIterator.hasNext()){
            Persona actual=personaIterator.next();
            actual.setPuesto("Presidente");
        }
        System.out.println(personas);
    }
}
