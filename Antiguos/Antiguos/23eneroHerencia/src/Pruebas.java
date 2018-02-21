public class Pruebas {
    public static void main(String[] args) {

        Animal animal;

        Ave piolin;
        Periquito perico=new Periquito("piolín",4,2,true);
        piolin=perico;
        System.out.println(piolin.emiteSonido());
        animal=piolin;
        animal=perico;
        if(animal instanceof Pez){
            Pez pescado=(Pez)animal;
        }
        if(animal instanceof Ave){
            System.out.println("Es un ave");
        }
    }
}
