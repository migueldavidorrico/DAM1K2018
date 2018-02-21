import java.util.Arrays;
import java.util.Comparator;

public class Eurovision {
    private Pais[] participantes=new Pais[50];
    private int anyo;
    private int numParticipantes=0;

    public Pais[] ordenaParticipacion(){
        Pais[] salida=Arrays.copyOf(this.participantes,numParticipantes);
        Arrays.sort(salida);
        return salida;
    }
    public Pais[] ordenaNombrePais(){
        Pais[] salida=Arrays.copyOf(this.participantes,numParticipantes);
        Arrays.sort(salida, new Comparator<Pais>() {
            @Override
            public int compare(Pais o1, Pais o2) {
                return o1.getNombreIngles().compareTo(o2.getNombreIngles());
            }
        });
        return salida;
    }


    private int indiceParticipante=1;
    public void ordenaPorPuntuacion(){
        for (int i = 0; i < numParticipantes - 1; i++) {
            for (int j = 0; j < numParticipantes-1; j++) {
                if (participantes[j].getPuntuacion()<participantes[j+1].getPuntuacion()){
                    Pais aux=participantes[j];
                    participantes[j]=participantes[j+1];
                    participantes[j+1]=aux;
                }
            }
        }
    }

    public boolean addParticipante(Pais pais){
        for (int i = 0; i < numParticipantes; i++) {
            if(participantes[i].getNombreIngles().equals(pais.getNombreIngles()) ||
                    participantes[i].getNombreFrances().equals(pais.getNombreFrances())){
                return false;
            }
        }
        participantes[numParticipantes++]=pais;
        pais.setOrdenParticipacion(indiceParticipante++);
        return true;
    }

    public String listadoPaises(){
        this.ordenaPorPuntuacion();
        String salida="EUROVISION "+this.anyo+"\n";
        for (int i = 0; i < numParticipantes; i++) {
            salida+=participantes[i].toString()+"\n";
        }
        return salida;
    }



    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Eurovision(int anyo) {
        this.anyo = anyo;
    }


}
