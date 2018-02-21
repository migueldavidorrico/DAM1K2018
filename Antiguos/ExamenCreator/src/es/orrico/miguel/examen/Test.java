package es.orrico.miguel.examen;

import javax.swing.*;

public class Test extends Pregunta{
    String[] opciones;
    int indiceCorrecta;

    public Test(String enunciado, double valor, double penalizacion, String[] opciones, int indiceCorrecta) {
        super(enunciado, valor, penalizacion);
        this.opciones = opciones;
        this.indiceCorrecta = indiceCorrecta;
    }

    public Test(String enunciado, double valor, String[] opciones, int indiceCorrecta) {
        super(enunciado, valor);
        this.opciones = opciones;
        this.indiceCorrecta = indiceCorrecta;
    }

    @Override
    public void hazPregunta() {
        String entrada= (String) JOptionPane.showInputDialog(
                null,this.getEnunciado(),"Test",JOptionPane.ERROR_MESSAGE,null,this.opciones,this.opciones[0]
        );
        if(entrada.equals(this.opciones[this.indiceCorrecta])){
            this.setBienContestada(true);
        }
    }

    public static void main(String[] args) {
        String[] opciones={
                "Vinalopó","Duero","Mundo","Segura"
        };
        Test t1=new Test("¿Cuál es el río de Murcia?",10,50,opciones,3);
        t1.hazPregunta();
        if(t1.estaBienContestada()){
            JOptionPane.showMessageDialog(null,"ENHORABUENA");
        } else {
            JOptionPane.showMessageDialog(null,"NO Pasa Nada");

        }
    }


}
