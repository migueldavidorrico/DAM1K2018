public class Coche implements Audible{
    String matricula;



    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void hazSonido() {
        System.out.println("MECK MECK");
    }

    @Override
    public void preparaSonido() {

    }

    @Override
    public void finalizaSonido() {

    }
}
