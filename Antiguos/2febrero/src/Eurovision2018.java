import java.util.Arrays;

public class Eurovision2018 {
    public static void main(String[] args) {
        Eurovision eurovision=new Eurovision(2018);
        System.out.println(eurovision.listadoPaises());
        Pais espanya=new Pais("Spain","L'Espagne","La Barca","Amaya");
        Pais francia=new Pais("France","La France","Mon Amour","JaquesCousteau");
        Pais portugal=new Pais("Portugal","La Portugal","Fado","Joao Pinto");
        eurovision.addParticipante(espanya);
        eurovision.addParticipante(francia);
        eurovision.addParticipante(portugal);
        System.out.println(eurovision.listadoPaises());
        espanya.setPuntuacion(12);
        francia.setPuntuacion(24);
        portugal.setPuntuacion(18);
        System.out.println(eurovision.listadoPaises());
        espanya.setPuntuacion(120);
        francia.setPuntuacion(54);
        portugal.setPuntuacion(78);
        System.out.println(eurovision.listadoPaises());
        System.out.println(Arrays.toString(eurovision.ordenaParticipacion()));
        System.out.println(Arrays.toString(eurovision.ordenaNombrePais()));

    }
}
