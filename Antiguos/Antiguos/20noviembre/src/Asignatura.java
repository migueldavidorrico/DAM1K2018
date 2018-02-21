public class Asignatura {
    private final static int HORAS_POR_DEFECTO=280;
    private final String nombre;
    private int nota;
    private final int horasAnuales;
    private static int sumaNotas;
    private static int numeroNotas;
    public Asignatura(String nombre,int nota, int horasAnuales){
        this.nombre=nombre;
        this.nota=nota;
        this.horasAnuales=horasAnuales;
        Asignatura.numeroNotas++;
        Asignatura.sumaNotas+=nota;

    }
    public Asignatura(String nombre,int nota){
        this(nombre,nota,HORAS_POR_DEFECTO);
    }

    public void setNota(int nota) {
        Asignatura.sumaNotas-=this.nota;
        this.nota = nota;
        Asignatura.sumaNotas+=nota;
    }

    public String devuelveNotaEnPalabras(){
        switch(this.nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return "Insuficiente";
            case 5:return "Suficiente";
            case 6:return "Bien";
            case 7:
            case 8:return "Notable";
            case 9:
            case 10:return "Sobresaliente";
            default:
                return "Nota no reconocida";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public int getHorasAnuales() {
        return horasAnuales;
    }

    public static double getMedia(){
        double media=Asignatura.sumaNotas/(double) Asignatura.numeroNotas;
        return media;
    }
}
