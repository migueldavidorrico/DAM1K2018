import javax.swing.*;

import java.util.Arrays;

public class ListaNumeros {
    static int lista[]={4,5,7,3,5,7,3,1,4,56,7,4,234,45,56};

    static void imprimeLista(){
        String salida=" ";
        for (int i :
                lista) {
            salida+=i+" ";
        }
        JOptionPane.showMessageDialog(null,salida);
    }

    public static void main(String[] args) {
        imprimeLista();
        insertarAlFinal(-1);
        imprimeLista();
        borrarTodos(4);
        imprimeLista();
    }

    private static void borrarTodos(int i) {
        int igualesAI = 0;
        for (int n :
                lista) {
            if (i == n) {
                igualesAI++;
            }
        }
        int[] nueva=new int[lista.length-igualesAI];
        int enElQueInserto=0;
        for (int j = 0; j < lista.length; j++) {
            if(lista[j]!=i){
                nueva[enElQueInserto++]=lista[j];
            }

        }
        lista=nueva;
    }

    private static void insertarAlFinal(int n) {
        int[] nuevo=new int[lista.length+1];
        for (int i = 0; i <lista.length; i++) {
            nuevo[i]=lista[i];
        }
        nuevo[lista.length]=n;
        lista=nuevo;
    }

}
