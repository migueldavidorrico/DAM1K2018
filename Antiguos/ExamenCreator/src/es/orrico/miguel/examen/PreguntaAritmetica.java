package es.orrico.miguel.examen;

import javax.swing.*;

public class PreguntaAritmetica extends Pregunta{
    private OperacionMatematica operacion;


    public PreguntaAritmetica(double valor, double penalizacion,OperacionMatematica operacion) {
        super("Calcula:", valor, penalizacion);
        this.operacion=operacion;
    }

    @Override
    public void hazPregunta() {
        String enunciadoPregunta=this.getEnunciado();
        enunciadoPregunta+=operacion.getPrimerOperando();
        enunciadoPregunta+=operacion.getSimbolo();
        enunciadoPregunta+=operacion.getSegundoOperando();
        enunciadoPregunta+="=";
        String respuesta=JOptionPane.showInputDialog(null,enunciadoPregunta);
        int respuestaEntera=Integer.parseInt(respuesta);
        if(respuestaEntera==operacion.getRespuesta()){
            this.setBienContestada(true);
        } else {
            this.setBienContestada(false);
        }
    }

}
