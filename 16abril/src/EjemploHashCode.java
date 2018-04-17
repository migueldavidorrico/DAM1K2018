public class EjemploHashCode {
    String atri1;
    int atrib2;
    boolean atrib3;
    double atrib4;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EjemploHashCode that = (EjemploHashCode) o;

        if (atrib2 != that.atrib2) return false;
        if (atrib3 != that.atrib3) return false;
        if (Double.compare(that.atrib4, atrib4) != 0) return false;
        return atri1 != null ? atri1.equals(that.atri1) : that.atri1 == null;
    }

    public EjemploHashCode(String atri1, int atrib2, boolean atrib3, double atrib4) {
        this.atri1 = atri1;
        this.atrib2 = atrib2;
        this.atrib3 = atrib3;
        this.atrib4 = atrib4;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = atri1 != null ? atri1.hashCode() : 0;
        result = 31 * result + atrib2;
        result = 31 * result + (atrib3 ? 1 : 0);
        temp = Double.doubleToLongBits(atrib4);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public static void main(String[] args) {
        EjemploHashCode e = new EjemploHashCode("Perico", 32, true, 0.54);
        EjemploHashCode e2 = new EjemploHashCode("Perido", 32, true, 0.54);
        System.out.println(e.hashCode());
        System.out.println(e2.hashCode());
    }
}
