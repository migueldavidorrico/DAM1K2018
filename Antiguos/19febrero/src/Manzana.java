public class Manzana  implements Comparable{
    int sabor;

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.sabor,((Manzana) o).sabor);
    }
}
