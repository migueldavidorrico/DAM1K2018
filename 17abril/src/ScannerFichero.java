import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFichero {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("datos.txt"));
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Dime tu edad y dinero en el banco");
        int edad = sc.nextInt();
        System.out.println(edad >= 18 ? "Eres Mayor de edad" : "Menor");
        int dinero = sc.nextInt();
        System.out.println(dinero >= 1000 ? "Eres Rico" : "Pronto cobrarás");

    }
}
