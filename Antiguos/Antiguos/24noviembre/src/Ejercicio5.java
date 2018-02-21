import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Partidos:");
        int partidos=sc.nextInt();
        System.out.println("Columnas:");
        int columnas=sc.nextInt();
        System.out.println((new Quiniela()).cadenaBoleto(partidos,columnas));

    }
}
