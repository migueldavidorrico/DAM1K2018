
public abstract class Animal {
    protected String nombre;
    protected int peso;
    protected int tamanyo;

    public abstract String emiteSonido();

    public Animal(String nombre, int peso, int tamanyo) {
        this.nombre = nombre;
        this.peso = peso;
        this.tamanyo = tamanyo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(int tamanyo) {
        this.tamanyo = tamanyo;
    }
}
