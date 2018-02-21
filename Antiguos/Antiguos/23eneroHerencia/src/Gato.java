public class Gato extends Mamifero {

    @Override
    public String emiteSonido() {
        return "MIAU MIAU ME LLAMO "+super.getNombre();
    }

    public Gato(String nombre, int peso, int tamanyo) {
        super(nombre, peso, tamanyo);
    }
}
