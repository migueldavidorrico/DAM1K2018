public class Veterinario {
    public static void main(String[] args) {
        Animal[] jaula={
            new Pez("Nemo",3,2,true),
            new Ave("Halcon",3,2,true),
            new Periquito("piolin",3,2,true),
            new Periquito("lucas",3,2,true),
            new Gato("Misifu",3,2),
            new Gato("Trihky",34,20),
            new Perro("Rambo",70,4)
        };
        for (Animal a :
                jaula) {
            System.out.println(a.emiteSonido());
        }
        for (Animal a:jaula
             ) {
            if(a instanceof Mamifero){
                System.out.println(a.getNombre() + " " + a.getPeso() + " Kg");
            }

        }

    }
}
