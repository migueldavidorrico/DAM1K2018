public class ISuma implements IOperacion {
    @Override
    public int opera(int a, int b) {
        return a + b;
    }

    @Override
    public String muestra(int a, int b) {
        return a + " + " + b;
    }
}
