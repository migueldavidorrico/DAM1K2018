public class FactorialDeVarios {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Factorial de " + i);
            int factorial=1;
            for(int j=1;j<=i;j++){
                System.out.print(j);
                factorial*=j;
                if(j<i){
                    System.out.print("*");
                }
            }
            System.out.println("="+factorial);
        }
    }
}
