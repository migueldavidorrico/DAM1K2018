import javax.swing.*;

public class Partido {
    private final Equipo local;
    private final Equipo visitante;
    private final String estadio;
    private int golesLocal;
    private int golesVisitante;

    public void golLocal(){
        this.golesLocal++;
    }
    public void golVisitante(){
        this.golesVisitante++;
    }
    public String cadenaResultado(){
        return golesLocal+" - "+golesVisitante;
    }




    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public String getEstadio() {
        return estadio;
    }

    public int getGolesLocal() {
        return golesLocal;
    }


    public int getGolesVisitante() {
        return golesVisitante;
    }


    Partido(Equipo local, Equipo visitante){
        this(local,visitante,local.getEstadio());
    }
    Partido(Equipo local, Equipo visitante,String estadio){
        this.local=local;
        this.visitante=visitante;
        this.estadio=estadio;
        this.golesLocal=0;
        this.golesVisitante=0;
    }
    public String devuelveAlineaciones(){
        String salida=String.format("%20s %20s %20s%n",
                this.local.getNombre(),
                this.cadenaResultado(),
                this.visitante.getNombre());
        salida+=local.devuelveAlineacion(LocalOVisitante.LOCAL);
        salida+="\n-------------------------------------------------------------------------------------------\n";
        salida+=visitante.devuelveAlineacion(LocalOVisitante.VISITANTE);
        return salida;
    }

    public static void main(String[] args) {
        Partido derby=new Partido(UtilidadPartidos.BARCELONA,UtilidadPartidos.REAL_MADRID);
        JOptionPane.showMessageDialog(null,derby.devuelveAlineaciones());
        int numeroGoles=(int)(Math.random()*10);
        for(int i=0;i<numeroGoles;i++){
            if((int)(Math.random()*700)%2==0){
                derby.golLocal();
                System.out.println("Marca el local");
            } else {
                derby.golVisitante();
                System.out.println("Marca el visitante");
            }
            JOptionPane.showMessageDialog(null,derby.devuelveAlineaciones());
        }
        JOptionPane.showMessageDialog(null,"<html><h3>Fin del Partido</h3><h1>"+derby.cadenaResultado());
    }
}
