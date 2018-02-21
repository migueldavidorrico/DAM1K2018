import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int respuesta=JOptionPane.showConfirmDialog(null,"Quieres inicializar la flota?","Parque Móvil",
                JOptionPane.OK_OPTION);
        if (respuesta==JOptionPane.OK_OPTION){
            Empresa.Inicializa();
            JOptionPane.showMessageDialog(null, Empresa.listadoVehiculos());
        } else if (respuesta==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "La flota está vacía.");
        } else if (respuesta==-1){
            return;
        }
        int opcion;
        do {
            opcion=JOptionPane.showOptionDialog(null,"Qué quieres hacer?","Parque Móvil",
                    JOptionPane.DEFAULT_OPTION , JOptionPane.QUESTION_MESSAGE, null, Opcion.values(), Opcion.ALTA);
            if (opcion==-1){
                break;
            }else if (opcion==0){
                Empresa.altaVehiculo();
            }else if (opcion==1){
                Empresa.bajaVehiculo();
            }else if (opcion==2){
                JOptionPane.showMessageDialog(null,Empresa.datosDelVehiculo());
            }else if (opcion==3){
                JOptionPane.showMessageDialog(null, Empresa.listadoVehiculos());
            }
        }while (opcion!=4);


    }
}
