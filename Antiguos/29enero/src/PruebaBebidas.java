public class PruebaBebidas {
    public static void main(String[] args) {
        Bebida[] bebidas={
                new BebidaAzucarada("001",2,200,Marca.COCACOLA,20),
                new BebidaAzucarada("023",1,200,Marca.COCACOLA,20),
                new BebidaAzucarada("A32",5,200,Marca.COCACOLA,20),
                new BebidaAzucarada("6YT",2,200,Marca.MIRINDA,20),
                new BebidaAzucarada("231",2,200,Marca.FANTA,20),
                new BebidaAzucarada("222",10,200,Marca.MIRINDA,20),
                new AguaMineral("RRR",5,100,Marca.BEZOYA,"Manantial")
        };
        ((BebidaAzucarada)bebidas[3]).setPromocion(Promocion.ENPROMOCION);
        for (Bebida b :
                bebidas) {
            System.out.println(b);
        }
    }
}
