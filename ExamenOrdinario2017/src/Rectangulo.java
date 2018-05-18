public class Rectangulo {
    int base;
    int altura;

    public void ampliaBase(int x) {
        base += x;
    }

    public void ampliaAltura(int y) {
        altura += y;
    }

    public void imprimeArea() {
        System.out.println("El área es: " + base * altura);
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
}
