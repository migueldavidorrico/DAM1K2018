import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre Empresa: ");
        String nombre=sc.nextLine();
        System.out.println("Ingresos:");
        int ingresos=sc.nextInt();
        System.out.println("Gastos:");
        int gastos=sc.nextInt();
        sc.nextLine();
        Empresa minima=new Empresa(nombre,ingresos,gastos);
        for(int i=1;i<5;i++){
            System.out.println("Nombre Empresa: ");
            String nombreActual=sc.nextLine();
            System.out.println("Ingresos:");
            int ingresosActual=sc.nextInt();
            System.out.println("Gastos:");
            int gastosActual=sc.nextInt();
            sc.nextLine();
            Empresa actual=new Empresa(nombreActual,ingresosActual,gastosActual);
            if(actual.getBeneficio()<minima.getBeneficio()){
                minima=actual;
            }
        }
        System.out.println(minima.getNombre()+" - "+minima.getBeneficio());
    }
}
