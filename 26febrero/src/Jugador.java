public class Jugador extends IntegranteSeleccion {
    public Jugador(String nombre) {
        super(nombre);
    }


    @Override
    public void cobrar() {
        System.out.println(this.getNombre() + " Se va de fiesta");
    }

    @Override
    public void vaAlpartido() {
        System.out.println(this.getNombre() + " Intenta marcar goles y que no le marquen");

    }

    @Override
    public void vaAlEntrenamiento() {
        System.out.println(this.getNombre() + " Se pone fuerte para el partido");
    }
}

