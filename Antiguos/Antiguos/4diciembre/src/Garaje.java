public class Garaje {
    Coche cocheSustitucion;
    Coche[] plazasGaraje;
    String datos(){
        String salida="";
        for (Coche c :
                plazasGaraje) {
            System.out.println(c);

        }
        return salida;
    }
}
