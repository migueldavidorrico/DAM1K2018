public class Masajista extends IntegranteSeleccion {
    public Masajista(String nombre) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return this.nombre.toUpperCase();
    }

    @Override
    public void cobrar() {
        System.out.println(this.getNombre() + " Cobra lo mínimo");
    }

    @Override
    public void vaAlpartido() {
        System.out.println(this.getNombre() + " Esperar y esperar");

    }

    @Override
    public void vaAlEntrenamiento() {
        System.out.println(this.getNombre() + " Mira a los jugadores");
    }
}

