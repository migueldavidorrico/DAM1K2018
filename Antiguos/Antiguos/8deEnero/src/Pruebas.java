import java.util.Arrays;

public class Pruebas {
    public static void main(String[] args) {


//        Pieza rey = new Pieza(Color.NEGRA, Tipo.REY);
//        Pieza reina = new Pieza(Color.BLANCA, Tipo.REINA);
//        System.out.println(rey.salida());
//        System.out.println(reina.salida());
        System.out.println("Los Tipos disponibles son" + Arrays.toString(Tipo.values()));
        Pieza peon=new Pieza(Color.valueOf("BLANCA"),Tipo.valueOf("REY"));
    }
}
