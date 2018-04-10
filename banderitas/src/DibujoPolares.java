
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class DibujoPolares {
    private static Color devuelveRadianes(double radio, double angulo) {
        //Método a modificar. radio y angulo están entre 0 y 1.
        //El radio vale 1 en las esquinas
        //El angulo empieza en la parte superior de la vertical y va en sentido antihorario
        if (angulo < 0.25 || angulo > 0.75) {

            return new Color(((int) (radio * 255)) % 255, (int) (angulo * 200) % 255, 128);
        }
        return new Color(255, ((int) (radio * 800)) % 255, 255);
    }

    //NO MODIFICAR A PARTIR DE AQUÍ


    public static int ANCHO = 400;
    public static int ALTO = 400;
    public static int diagonal = (int) Math.sqrt(ANCHO * ANCHO + ALTO * ALTO);


    public static void repinta(Canvas cnvs) {
        Graphics g = cnvs.getGraphics();
        Dimension dimension = cnvs.getSize();
        ANCHO = dimension.width;
        ALTO = dimension.height;
        for (int x = 0; x < ANCHO; x++) {
            for (int y = 0; y < ALTO; y++) {
                double r = radioRadianes(x, y);
                double angulo = anguloRadianes(x, y);
                Color color = devuelveRadianes(r, angulo);
                g.setColor(color);
                g.drawOval(x, y, 1, 1);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frmMain = new JFrame();
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setSize(ANCHO, ALTO + 50);

        final Canvas cnvs = new Canvas();
        cnvs.setSize(ANCHO, ALTO);

        frmMain.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                Component c = (Component) componentEvent.getSource();
                repinta(cnvs);

            }

            @Override
            public void componentMoved(ComponentEvent componentEvent) {
                Component c = (Component) componentEvent.getSource();

                repinta(cnvs);
            }

            @Override
            public void componentShown(ComponentEvent componentEvent) {

                repinta(cnvs);
            }

            @Override
            public void componentHidden(ComponentEvent componentEvent) {

            }
        });
        frmMain.add(cnvs);
        frmMain.setVisible(true);


        repinta(cnvs);
    }

    private static double anguloRadianes(int x, int y) {
        return mapeaPI(Math.atan2((double) (x - ANCHO / 2), (double) (y - ALTO / 2)));
    }

    private static double radioRadianes(int x, int y) {
        return 2 * Math.sqrt((x - ANCHO / 2) * (x - ANCHO / 2) + (y - ALTO / 2) * (y - ALTO / 2)) / diagonal;
    }


    private static double mapeaPI(double theta) {
        double positivo = theta + Math.PI;
        return positivo / (Math.PI * 2);
    }
}
