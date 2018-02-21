package es.orrico.miguel.examen;

public class Pruebas {
    public static void main(String[] args) {
        Pregunta p=new PreguntaAritmetica(3,10,new Suma());
        p.hazPregunta();
        if(p.estaBienContestada()){
            System.out.println("BIEN");
        } else {
            System.out.println("MAL");
        }
    }


}
