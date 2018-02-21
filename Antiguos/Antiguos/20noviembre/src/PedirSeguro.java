import java.util.Scanner;

public class PedirSeguro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre;
        int nota;
        int numeroHoras;
        boolean sonCorrectos;
        do{
            System.out.println("Nombre?");
            nombre=sc.nextLine();
            System.out.println("Horas?");
            numeroHoras=sc.nextInt();
            System.out.println("Nota?");
            nota=sc.nextInt();
            sc.nextLine();
            System.out.printf("Nombre: %s Horas: %d Nota: %d%n",nombre,numeroHoras,nota);
            System.out.println("¿Son correctos estos datos?");
            String respuesta=sc.nextLine();
            sonCorrectos=respuesta.toUpperCase().equals("SI") || respuesta.toUpperCase().equals("S");
        } while(!sonCorrectos);
    }
}
