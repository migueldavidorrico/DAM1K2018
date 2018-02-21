package es.orrico.miguel.examen;

public class Multiplicacion implements OperacionMatematica {
    boolean primeroValido=false;
    boolean segundoValido=false;
    int primero;
    int segundo;
    @Override
    public int getPrimerOperando() {
        if(primeroValido){
            return primero;
        }
        primeroValido=true;
        primero=(int)(Math.random()*10)+1;
        return primero;
    }

    @Override
    public String getSimbolo() {
        return "*";
    }

    @Override
    public int getSegundoOperando() {
        if(segundoValido){
            return segundo;
        }
        segundoValido=true;
        segundo=(int)(Math.random()*10)+1;
        return segundo;
    }

    @Override
    public int getRespuesta() {
        return primero*segundo;
    }
}

