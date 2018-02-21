public class Fran {
    int a;
    String b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fran fran = (Fran) o;

        if (a != fran.a) return false;
        return b != null ? b.equals(fran.b) : fran.b == null;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        return result;
    }

    public static void main(String...args) {
        System.out.println(args.length);
    }

}
