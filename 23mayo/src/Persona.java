public class Persona {
    static String nombre;
    static String apellido;

    public static String cadenaConSaludo() {
        return "Sr/Sra " + nombre + " " + apellido;
    }

    public static void main(String[] args) {
        nombre = "Pepe";
        apellido = "López";
        System.out.println(cadenaConSaludo());
    }
}
