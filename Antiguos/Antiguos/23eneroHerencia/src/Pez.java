public class Pez extends Animal {
    protected boolean esDeAguaDulce;

    public Pez(String nombre, int peso, int tamanyo, boolean esDeAguaDulce) {
        super(nombre, peso, tamanyo);
        this.esDeAguaDulce = esDeAguaDulce;
    }

    public void getNumeroHuevosPuesta() {
        //TODO
    }

    @Override
    public String emiteSonido() {
        return "GLU GLU GLU";
    }
}
