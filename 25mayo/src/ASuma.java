public class ASuma extends AOperacion {
    @Override
    public int opera(int a, int b) {
        return a + b;
    }

    @Override
    public String muestra(int a, int b) {
        return a + " + " + b;
    }
}
