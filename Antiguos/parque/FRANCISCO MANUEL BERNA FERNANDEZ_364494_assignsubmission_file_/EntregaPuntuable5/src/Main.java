public class Main {
    public static void main(String[] args) {

        ParqueMovil parqueMovil = new ParqueMovil();

        MenuPrincipal menuPrincipal = new MenuPrincipal();

        menuPrincipal.iniciarMenu(parqueMovil);
        menuPrincipal.ejecutarMenuPincipal(parqueMovil);
    }
}
