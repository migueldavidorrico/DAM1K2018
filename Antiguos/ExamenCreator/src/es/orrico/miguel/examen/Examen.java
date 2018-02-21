package es.orrico.miguel.examen;

import javax.swing.*;

/**
 * Clase que modela un examen
 * @author miguel
 * @version 1.0
 */

public class Examen {
    Pregunta[] preguntas=new Pregunta[1000]; //Sitio de sobra para las preguntas
    int preguntaActual=0;


    /**
     * Añade una pregunta al examen
     * @param p Pregunta a añadir
     */
    public void addPregunta(Pregunta p){
        preguntas[preguntaActual++]=p;
    }

    /**
     * Hace todas las preguntas del examen.
     */
    public void hazExamen(){
        for (int i = 0; i < preguntaActual; i++) {

            preguntas[i].hazPregunta();
        }
    }

    /**
     * Con un examen que:
     * <ul>
     *     <li><b>
     *         Se ha hecho
     *     </b></li>
     *     <li>
     *         Tiene preguntas añadidas
     *     </li>
     * </ul>
     * Presenta en pantalla (showMessage) el resultado del examen
     *
     */
    public void presentaResultados(){
        int nota=0;
        int notaPosible=0;
        int correctas=0;
        int falladas=0;  //Tontería, falladas=totalPreguntas-correctas
        for (int i = 0; i < preguntaActual; i++) {

            if (preguntas[i].estaBienContestada()) {
                nota+=preguntas[i].getValor();
                correctas++;
            } else {
                nota-=preguntas[i].getPenalizacion();
            }
            notaPosible+=preguntas[i].getValor();
        }
        String salida="De un total de: "+preguntaActual+" preguntas \n has acertado: "+correctas+" \n Has sacado un:"+nota+" de un total de: "+notaPosible;
        JOptionPane.showMessageDialog(null,salida);
    }
}
