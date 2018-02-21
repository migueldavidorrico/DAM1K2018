/*
2520 is the smallest number that can be divided by each of the numbers
from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible
by all of the numbers from 1 to 20?
 */
public class Euler5 {
    public static void main(String[] args) {
        int numeroActual=0;
        boolean numeroEncontrado=false;
        while(!numeroEncontrado){
            numeroEncontrado=true;
            numeroActual++;
            for (int i = 1; i <= 20; i++) {
                if (numeroActual % i != 0) {
                    numeroEncontrado = false;
                }
            }
        }
        System.out.println(numeroActual);

//
//        do {
//            numeroActual++;
//            esElNumeroBuscado = true;
//            for (int i = 1; i <= 20; i++) {
//                if (numeroActual % i != 0) {
//                    esElNumeroBuscado = false;
//                }
//            }
//        }while(!esElNumeroBuscado);
//        System.out.println(numeroActual);
    }
}
