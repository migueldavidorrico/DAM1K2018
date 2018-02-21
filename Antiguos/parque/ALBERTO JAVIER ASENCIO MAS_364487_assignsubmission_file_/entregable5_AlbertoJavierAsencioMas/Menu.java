public enum Menu {
    Alta("Alta de vehiculo"),
    Baja("Baja de vehiculo"),
    Datos("Datos de un vehiculo"),
    Listado("Listado de vehiculos"),
    Salir("Salir");

    private final String cadena;

    Menu(String opcion) {
        this.cadena = opcion;
    }
}
