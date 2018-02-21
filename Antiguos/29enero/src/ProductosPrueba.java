public class ProductosPrueba {
    public static void main(String[] args) {
        Producto[] productos={
                new Perecedero("LIMON",200,20),
                new NoPerecedero("SIERRA",200,"ARMA"),
                new NoPerecedero("CUCHILLO",200,"ARMA"),
                new NoPerecedero("TENEDOR",200,"ARMA"),
                new Perecedero("AGUACATE",200,3),
        };
        int sumaTotal=0;
        for (Producto p :
                productos) {
            System.out.println(p);
            sumaTotal+=p.calcular(5);
        }
        System.out.println(sumaTotal);
    }
}
