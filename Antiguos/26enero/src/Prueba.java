public class Prueba {
    public static void main(String[] args) {
        Audible[] jaula={
                new Perro("Tobi"),
                new Gato("Miosifú"),
                new Perro("Rambo"),
                new Coche("Ford"),
                new Coche("Seat")
        };
        for (Audible a :
                jaula) {
                a.hazSonido();

        }
    }
}
