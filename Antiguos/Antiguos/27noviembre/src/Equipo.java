import java.util.Arrays;

public class Equipo {
    private final String nombre;
    private String estadio;
    private final int anyoFundacion;
    private String ciudad;
    private final Futbolista[] futbolistas=new Futbolista[11];

    public boolean anyadeDefensa(Futbolista defensa){
        if(defensa.getPosicion()!=Posicion.DEFENSA){
            return false;
        }
        return insertarEnPosiciones(defensa,1,4);
    }
    public boolean anyadeDelantero(Futbolista delantero){
        if(delantero.getPosicion()!=Posicion.DELANTERO){
            return false;
        }
        return insertarEnPosiciones(delantero,9,10);
    }
    public boolean anyadeMedio(Futbolista medio){
        if(medio.getPosicion()!=Posicion.MEDIO){
            return false;
        }
        return insertarEnPosiciones(medio,5,8);
    }



    public boolean anyadePortero(Futbolista portero){
        if(portero.getPosicion()!=Posicion.PORTERO){
            return false;
        }
        return insertarEnPosiciones(portero,0);
    }
    public boolean insertarEnPosiciones(Futbolista f, int posInicial,int posFinal){
        //Comprobar que quedan posiciones vacías
        boolean hayPosicionesVacias=false;
        int primeraPosicionVacia=-1;
        for(int i=posInicial;i<=posFinal;i++){
            if(this.futbolistas[i]==null){
                hayPosicionesVacias=true;
                if(primeraPosicionVacia==-1){
                    primeraPosicionVacia=i;
                }
            }
        }
        if(!hayPosicionesVacias){
            return false;
        }
        this.futbolistas[primeraPosicionVacia]=f;
        return true;
    }
    public boolean insertarEnPosiciones(Futbolista f,int posInicial){
        return insertarEnPosiciones(f,posInicial,posInicial);
    }


    @Override
    public String toString() {
        String salida= nombre + '\'' +
                ", estadio='" + estadio + '\'' +
                ", anyoFundacion=" + anyoFundacion +
                ", ciudad='" + ciudad + '\'' +
                "\nPLANTILLA:\n";
        for (Futbolista f :
                futbolistas) {
            salida+=f+"\n";
        }
        return salida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getAnyoFundacion() {
        return anyoFundacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Equipo(String nombre, String estadio, int anyoFundacion, String ciudad) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.anyoFundacion = anyoFundacion;
        this.ciudad = ciudad;
    }



    public static void main(String[] args) {
        Equipo barsa=UtilidadPartidos.BARCELONA;
        System.out.println(barsa.devuelveAlineacion(LocalOVisitante.VISITANTE));
    }

    public String devuelveAlineacion(LocalOVisitante lov) {
        String salida="";
        if(lov==LocalOVisitante.LOCAL){
            salida+=lineaPortero()+"\n\n";
            salida+=lineaDefensa()+"\n\n";
            salida+=lineaMediosAtras()+"\n";
            salida+=lineaMediosDelante()+"\n\n";
            salida+=lineaDelanteros();
        }
        else {
            salida+=lineaDelanteros()+"\n\n";
            salida+=lineaMediosDelante()+"\n";
            salida+=lineaMediosAtras()+"\n\n";
            salida+=lineaDefensa()+"\n\n";
            salida+=lineaPortero()+"\n\n";
        }
        return salida;
    }

    private String lineaDelanteros() {
        return String.format("%41s %20s",this.futbolistas[9].posicionNombre(),
                this.futbolistas[10].posicionNombre());
    }

    private String lineaMediosDelante() {
        return String.format("%20s %62s",this.futbolistas[5].posicionNombre(),
                this.futbolistas[8].posicionNombre());
    }

    private String lineaMediosAtras() {
        return String.format("%40s %20s",this.futbolistas[6].posicionNombre(),
                this.futbolistas[7].posicionNombre());
    }

    private String lineaDefensa() {
        return String.format("%20s %20s %20s %20s",this.futbolistas[1].posicionNombre(),
                this.futbolistas[2].posicionNombre(),
                this.futbolistas[3].posicionNombre(),
                this.futbolistas[4].posicionNombre());
    }

    private String lineaPortero() {
        return String.format("%60s",this.futbolistas[0].posicionNombre());
    }
}
