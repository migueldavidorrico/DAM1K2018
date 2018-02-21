public class Perro extends Mamifero{
    @Override
    public String emiteSonido() {
        return "GUAU GUAU mi nombre es "+super.getNombre();
    }

    public Perro(String nombre, int peso, int tamanyo) {
        super(nombre, peso, tamanyo);
    }
}
