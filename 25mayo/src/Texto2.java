import javax.naming.ldap.Control;
import java.util.Scanner;

public class Texto2 {
    Controlador c;

    public Texto2(Controlador c) {
        this.c = c;
    }

    public void inicializa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero = sc.nextInt();
        c.cambiadoNumero(numero);
    }
}
