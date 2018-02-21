public class Printf {
    public static void main(String[] args) {
        System.out.println("ana");
        System.out.printf("%20s%n","ana");
        System.out.printf("%20s%n","anabel");
        double d=455658/(double)5;
        System.out.printf("%10.3f%n",d);
        System.out.println(String.format("%6.3f%n", 9.4567));
        System.out.println(String.format("%6.3f%n", 39.4567));
        System.out.println(String.format("%6.3f%n", 779.4567));
        System.out.println(String.format("%6.3f%n", 44449.4567));
        System.out.println(String.format("%6.3f%n", 669.4567));

    }
}
