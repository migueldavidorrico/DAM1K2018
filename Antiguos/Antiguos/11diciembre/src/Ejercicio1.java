/*Inicializar un array con los siguietnes valores:

 4, 7,20, 4, 9, 3, 7, 8

Mostrarlo en pantalla adecuadamente (printf, las comas)
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int[] miArray={4, 7,20, 4, 9, 3, 7, 8};
        for (int i = 0; i < miArray.length; i++) {
            System.out.print(miArray[i]);
            if(i<miArray.length-1){
                System.out.print(",");
            }
        }
        System.out.println("");
        String salida="";
        for (int i :
                miArray) {
            salida+=i+",";
        }
        salida=salida.substring(0,salida.length()-1);
        System.out.println(salida);
    }
}
