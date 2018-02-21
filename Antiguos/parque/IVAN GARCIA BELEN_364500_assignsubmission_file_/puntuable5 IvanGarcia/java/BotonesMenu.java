public enum BotonesMenu {
    ALTA("Alta"),
    BAJA("Baja"),
    DATOS("Datos"),
    LISTADO("Listado"),
    SALIR("Salir");

    private String BotonMenu;

    BotonesMenu(String BotonMenu) {
        this.BotonMenu = BotonMenu;
    }

    public String getBotonMenu() {
        return BotonMenu;
    }

    @Override
    public String toString() {
        return BotonMenu;
    }
}
