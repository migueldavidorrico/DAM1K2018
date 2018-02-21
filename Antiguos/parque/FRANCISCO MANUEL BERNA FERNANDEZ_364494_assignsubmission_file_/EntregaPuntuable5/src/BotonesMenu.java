public enum BotonesMenu {
    ALTA("ALTA DE VEHICULO"),
    BAJA("BAJA DE VEHICULO"),
    DATOS("DATOS DEL VEHICULO SELECCIONADO"),
    LISTADO("LISTA DE VEHICULOS EN PARQUE"),
    SALIR("SALIR");

    String nombre;

    BotonesMenu(String nombre) {
        this.nombre = nombre;
    }
}
