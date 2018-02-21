public class Ave extends Animal {
    private boolean puedeVolar;

    public Ave(String nombre, int peso,int tamanyo,boolean vuela){
        super(nombre, peso, tamanyo);
        this.puedeVolar=vuela;
    }
    @Override
    public String emiteSonido(){
        return "PIO PIO";
    }

    protected final boolean getPuedeVolar() {
        return this.puedeVolar;
    }
    protected void setPuedeVolar(Boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
    public void getNumeroHuevosPuesta() {
        //TODO
    }
}
