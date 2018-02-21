public class Coche {
    String matricula;
    String marca;


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }
}
