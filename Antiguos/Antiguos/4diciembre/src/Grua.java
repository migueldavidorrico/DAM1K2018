public class Grua {
    Coche c;
    boolean estaOcupada;

    public Coche getCoche() {
        return c;
    }

    public void setC(Coche c) {
        this.c = c;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    public Grua(Coche c) {
        this.c = c;
        this.estaOcupada = true;
    }

    public Grua() {
        this.c=null;
        this.estaOcupada=false;
    }

    @Override
    public String toString() {
        String salida="";
        salida+="Esta grua "+(this.estaOcupada?"sí":"no")+ " está ocupada";
        if(this.estaOcupada){
            salida+=" con el coche "+c.getMatricula();
        }
        return salida;
    }

    public static void main(String[] args) {
        Grua vacia=new Grua();
        System.out.println(vacia);
//        Grua conCoche=new Grua(new Coche("MU-3051-Y","Ford"));
        Coche malAparcado=new Coche("MU-3051-Y","Ford");
        Grua conCoche=new Grua(malAparcado);
        System.out.println(conCoche);
        Coche remolcado=conCoche.getCoche();
        System.out.println(remolcado.getMatricula());
        System.out.println(conCoche.getCoche().getMatricula());
        malAparcado.setMatricula("FALSA");
        System.out.println(remolcado.getMatricula());
        System.out.println(conCoche.getCoche().getMatricula());
    }
}
