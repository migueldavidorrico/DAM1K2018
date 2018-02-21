import javax.swing.*;

public enum Valor {
    AS(1,"uno","1"),DOS(2,"dos","2"),TRES(3,"tres","3"),CUATRO(4,"cuatro","4"),CINCO(5,"cinco","5"),SEIS(6,"seis","6"),SIETE(7,"siete","7"),SOTA(0.5,"media","10"),CABALLO(0.5,"media","11"),REY(0.5,"media","12");
    private double valor;
    private String valorCadena;
    private String nombreFichero;

    public String getNombreFichero() {
        return nombreFichero;
    }

    Valor(double valor, String valorCadena, String nombreFichero){
        this.valor=valor;
        this.valorCadena=valorCadena;
        this.nombreFichero=nombreFichero;

    }

    public double getValor() {
        return valor;
    }
    public String getValorCadena(){
        return this.valorCadena;
    }
    @Override
    public String toString() {
        String salida=this.name().substring(0,1).toUpperCase();
        salida+=this.name().substring(1).toLowerCase();
        return salida;
    }
}
