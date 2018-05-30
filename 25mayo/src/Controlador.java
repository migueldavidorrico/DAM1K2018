public class Controlador {
    Texto1 frame3;
    Texto1 frame4;
    Texto1 frame1;
    Texto2 frame2;


    public void cambiadoNumero(int numero) {
        frame1.setNumeroDigito(numero * 2);
        frame3.setNumeroDigito(numero * 2);
        frame4.setNumeroDigito(numero * 2);
    }

    public void inicializa() {
        frame1 = new Texto1(this);
        frame1.incializa();
        frame3 = new Texto1(this);
        frame3.incializa();
        frame4 = new Texto1(this);
        frame4.incializa();
        frame2 = new Texto2(this);
        frame2.inicializa();
    }
}
