import java.util.Iterator;

public class NumerosMios implements Iterator{
    int actual=0;
    @Override
    public boolean hasNext() {
        return actual<10;
    }

    @Override
    public Object next() {
        actual+=3;
        return actual;
    }

    public static void main(String[] args) {
        NumerosMios mios=new NumerosMios();
    }
}
