import javax.swing.*;

public class ParqueMovil {

    String nombre;

    private Vehiculo [] listaCoches = new Vehiculo[50];

    public ParqueMovil(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo[] getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(Vehiculo[] listaCoches) {
        this.listaCoches = listaCoches;
    }

    public void rellenarPrimeros(){
        listaCoches[0]= new Vehiculo("4455CCC",MarcaCoche.MERCEDES,750,10000);
        listaCoches[1]= new Vehiculo("5566DDD",MarcaCoche.FORD,1250,300);
        listaCoches[2]= new Vehiculo("6677EEE",MarcaCoche.FORD,880,500);
        listaCoches[3]= new Vehiculo("7788FFF",MarcaCoche.PEGASO,1230,15000);
        listaCoches[4]= new Vehiculo("8899GGG",MarcaCoche.MERCEDES,445,23000);
    }

    public void muestraCoches() {
        String salida="";

        for (Vehiculo v : this.ordenaVehiculos()) {
            if(v != null) {
                salida+=v+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,salida);
    }

    private Vehiculo[] ordenaVehiculos() {

            Vehiculo aux;
            Vehiculo[] vectorSinNulos=this.vectorSinNulos();

            for(int i=0;i<vectorSinNulos.length-1;i++)
                for(int j=0;j<vectorSinNulos.length-i-1;j++)
                    if(vectorSinNulos[j+1].getMatricula().compareTo(vectorSinNulos[j].getMatricula())<0){//comparamos entre String y ordenamos de menor a mayor.
                        aux=vectorSinNulos[j+1];
                        vectorSinNulos[j+1]=vectorSinNulos[j];
                        vectorSinNulos[j]=aux;
                    }
            return vectorSinNulos;
    }

    private Vehiculo[] vectorSinNulos() {

        Vehiculo[] acotado;
        int contador=0;
        int contaplus=0;

            for (Vehiculo v : this.listaCoches) {//Averiguo el tamaño ocupado del vector.
                if(v != null) {
                   contador++;
                }
            }
            acotado = new Vehiculo[contador]; //Utilizo vector auxiliar solo con las posiciones ocupadas.
            for (Vehiculo v : this.listaCoches) {
                if(v != null) {
                    acotado[contaplus]=v;
                    contaplus++;
                }
            }
        return acotado;
    }

    public void agregarCoche() {
        Vehiculo local;

        for (int i=0; i<listaCoches.length; i++){
            if (listaCoches[i]==null){
                local=pedirDatosVehiculoNuevo();
                if(compruebaDuplicados(local)){
                    System.out.println("Este vehiculo ya existe");
                }else{
                    listaCoches[i]=local;
                }
             return;
            }
        }
    }

    private Vehiculo pedirDatosVehiculoNuevo() {
        String matricula= JOptionPane.showInputDialog(null,"Introduce una matricula:");
        MarcaCoche marca =(MarcaCoche)JOptionPane.showInputDialog(null,"Marca","Marca",JOptionPane.PLAIN_MESSAGE,null,MarcaCoche.values(),MarcaCoche.FORD);
        int cargaMaxima= Integer.parseInt(JOptionPane.showInputDialog(null,"¿Peso maximo soportado?"));
        int kilometraje= Integer.parseInt(JOptionPane.showInputDialog(null,"¿Kilometros del vehiculo?"));

        Vehiculo nuevoVehiculo = new Vehiculo(matricula, marca, cargaMaxima, kilometraje);

        return nuevoVehiculo;
    }

    public void preguntaIniciaParque() {

        int respuesta=JOptionPane.showConfirmDialog(null,"¿Quieres inicializar el parque movil?",null,JOptionPane.YES_NO_OPTION);

        if (respuesta==0){
            this.rellenarPrimeros();
            this.muestraCoches();
        }else {
        }
    }

    public boolean compruebaDuplicados(Vehiculo nuevoVehiculo) {

        for (Vehiculo v :
                this.getListaCoches()) {
            if (v != null) {
                if (v.getMatricula().equals(nuevoVehiculo.getMatricula())) {
                    return true;
                }
            }
        }
        return false;
        }

    private void bajaVehiculo() {

        Vehiculo encontrado=this.buscaVehiculo();

        if (encontrado==null){
            return;
        }
        int posicionVehiculo=this.devuelvePosicionVehiculo(encontrado);
            listaCoches[posicionVehiculo]=null;
    }

    private int devuelvePosicionVehiculo(Vehiculo encontrado) {

        for (int i=0;i<listaCoches.length;i++){
            if (encontrado==listaCoches[i]){
                return i;
            }
        }
        return -1;
    }

    private Vehiculo buscaVehiculo() {
        String matricula;

        matricula=this.pedirMatricula();

        for (Vehiculo v : this.listaCoches) {
            if(v != null) {
                if (v.getMatricula().equalsIgnoreCase(matricula)){
                    JOptionPane.showMessageDialog(null,v.toString());
                    return v;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"El vehiculo introducido ¡NO EXISTE!");
        return null;
    }

    private String pedirMatricula() {

        String matricula=JOptionPane.showInputDialog(null,"Introduce la matricula del vehiculo");

        return matricula;
    }

    public void menuprincipal() {

        int opcion=JOptionPane.showOptionDialog(null,null,"Menu Principal",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,OpcionesMenu.values(),null);

        switch (opcion){

            case 0:
                this.agregarCoche();
                this.menuprincipal();
                break;
            case 1:
                this.bajaVehiculo();
                this.menuprincipal();
                break;
            case 2:
                this.buscaVehiculo();
                this.menuprincipal();
                break;
            case 3:
                this.muestraCoches();
                this.menuprincipal();
                break;
            default:
                return;

        }

    }
}

