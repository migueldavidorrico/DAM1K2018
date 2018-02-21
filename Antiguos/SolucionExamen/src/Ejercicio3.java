public class Ejercicio3 {
    public static void divideCadena1(String cadena,int tamanyo){
        int puntoInicial=0;
        int puntoFinal=tamanyo;
        while(puntoInicial+tamanyo<cadena.length()){
            System.out.println(cadena.substring(puntoInicial, puntoFinal));
            puntoInicial+=tamanyo;
            puntoFinal+=tamanyo;
        }
        System.out.println(cadena.substring(puntoInicial));
    }

    public static void divideCadena2(String cadena,int tamanyo){
        String cadenaRestante=cadena;
        while(cadenaRestante.length()>tamanyo){
            System.out.println(cadenaRestante.substring(0, tamanyo));
            cadenaRestante=cadenaRestante.substring(tamanyo);
        }
        System.out.println(cadenaRestante);
    }
    public static void divideCadena3(String cadena,int tamanyo){
        if(cadena.length()<=tamanyo){
            System.out.println(cadena);
        } else {
            System.out.println(cadena.substring(0, tamanyo));
            divideCadena3(cadena.substring(tamanyo),tamanyo);
        }
    }

    public static void main(String[] args) {
        String cad1="Cadena de ejemplo";
        int n1=3;
        String cad2="Otra cadena distinta";
        int n2=5;
        divideCadena3(cad1,n1);
        divideCadena3(cad2,n2);

    }
}
