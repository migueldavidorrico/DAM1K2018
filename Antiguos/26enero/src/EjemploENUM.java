public class EjemploENUM {
    enum Interno{
        UNO,DOS,TRES;
    }
    class Persona{
        String nombre;
        int edad;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
    Interno numero;
    int otroNumero;

}
