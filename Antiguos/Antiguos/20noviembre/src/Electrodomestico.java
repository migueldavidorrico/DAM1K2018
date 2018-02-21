public class Electrodomestico {
    public static final int CLASE_A=0;
    public static final int CLASE_B=1;
    public static final int CLASE_C=2;
    private final String marca;
    private final String modelo;
    private final int consumo; //Si el consumo es de 50-100, eficiencia C, 20-49, eficiencia B, menos, A
    private int precio; //precio en céntimos de euro
    private boolean garantia;
    private boolean cromado;

    public boolean hasGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public boolean isCromado() {
        return cromado;
    }

    public void setCromado(boolean cromado) {
        this.cromado = cromado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getConsumo() {
        return consumo;
    }

    public int getEficienciaEnergetica() {
        if(this.getConsumo()<20){
            return Electrodomestico.CLASE_A;
        }
        if(this.getConsumo()<49){
            return Electrodomestico.CLASE_B;
        }
        return Electrodomestico.CLASE_C;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Electrodomestico(String marca, String modelo, int consumo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.precio = precio;
    }

    public static void main(String[] args) {
        Electrodomestico frigo=new Electrodomestico("Zanussi","Frigo",600,40000);
        System.out.println(frigo.getConsumo());
    }
}
