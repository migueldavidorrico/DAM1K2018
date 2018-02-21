import java.util.Locale;
import java.util.Scanner;

/*


 */
public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<10;i++) {
            pideTresNotas(sc,i+1);
        }
    }

    private static void pideTresNotas(Scanner sc,int numeroAlumno) {
        System.out.println("Nombre del alumno #"+numeroAlumno+":");
        String nombre=sc.nextLine();
        System.out.println("Nombre de la materia:");
        String nombreAsignatura=sc.nextLine();
        int suma=0;
        for(int j=0;j<3;j++){
            System.out.print("Nota "+(j+1)+":");
            int nota=sc.nextInt();
            suma+=nota;
        }
        double media=suma/3.0;
        System.out.printf("La nota promedio es: %.2f", media);
        sc.nextLine();
    }
}
