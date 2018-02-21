package es.orrico.miguel.examen;

public abstract class Pregunta {
    private final String enunciado;
    private final double valor;
    private final double penalizacion;

    public String getEnunciado() {
        return enunciado;
    }

    public double getValor() {
        return valor;
    }

    public double getPenalizacion() {
        return penalizacion;
    }

    public boolean estaBienContestada() {
        return bienContestada;
    }

    public void setBienContestada(boolean bienContestada) {
        this.bienContestada = bienContestada;
    }

    public Pregunta(String enunciado, double valor, double penalizacion) {
        this.enunciado = enunciado;
        this.valor = valor;
        this.penalizacion = penalizacion;
        this.bienContestada=false;
    }
    public Pregunta(String enunciado, double valor) {
        this.enunciado = enunciado;
        this.valor = valor;
        this.penalizacion = 0;
        this.bienContestada=false;
    }

    private boolean bienContestada;
    public abstract void hazPregunta();
}
