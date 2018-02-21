public class PruebaAsignatura {
    public static void main(String[] args) {
        Asignatura lengua=new Asignatura("Lengua",5);
        Asignatura fol=new Asignatura("FOL",7,230);
        Asignatura entornos=new Asignatura("Entornos",7,120);
        System.out.println("El alumno tiene de media: "+Asignatura.getMedia());
        fol.setNota(10);
        System.out.println("Ahora la media es: "+Asignatura.getMedia());
//Ejercicio 2
        System.out.printf("%20s %2d %15s%n",lengua.getNombre(),lengua.getNota(),lengua.devuelveNotaEnPalabras());
        System.out.printf("%20s %2d %15s%n",fol.getNombre(),fol.getNota(),fol.devuelveNotaEnPalabras());
        System.out.printf("%20s %2d %15s%n",entornos.getNombre(),entornos.getNota(),entornos.devuelveNotaEnPalabras());
        System.out.println("                ----------");
        System.out.printf("%20s %5.2f","Media",Asignatura.getMedia());
    }
}
