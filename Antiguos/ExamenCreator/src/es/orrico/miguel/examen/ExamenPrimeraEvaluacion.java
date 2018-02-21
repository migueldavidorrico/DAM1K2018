package es.orrico.miguel.examen;

public class ExamenPrimeraEvaluacion {
    public static void main(String[] args) {
        Examen e=new Examen();
        e.addPregunta(new PreguntaAritmetica(1,1,new Suma()));
        e.addPregunta(new PreguntaAritmetica(1,1,new Suma()));
        e.addPregunta(new PreguntaAritmetica(1,1,new Resta()));
        e.addPregunta(new PreguntaAritmetica(1,1,new Resta()));
        e.addPregunta(new PreguntaAritmetica(1,1,new Multiplicacion()));
        String[] opciones={
                "Vinalopó","Duero","Mundo","Segura"
        };
        e.addPregunta(new Test("¿Cuál es el río de Murcia?",10,500,opciones,3));
        String[] opciones2={
                "No lo suficiente",
                "Demasiado poco",
                "NULL",
                "Si eso, pa'l año que viene",
                "Mucho"
        };
        e.addPregunta(new Test("¿Cuánto tiempo le dedicas a la asignatura de programación?",10,1,opciones2,4));
        e.hazExamen();
        e.presentaResultados();


    }
}
