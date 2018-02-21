public class Gato extends Animales implements Audible{
        public Gato(String nombre) {
            super(nombre);
        }

    @Override
    public void hazSonido() {
        System.out.println("MIAU");
    }

    @Override
    public void preparaSonido() {

    }

    @Override
    public void finalizaSonido() {

    }
}
