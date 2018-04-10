

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.Method;


public class DibujoCartesianas {
    public static final Color rojoValencia = new Color(198, 11, 30);
    //Método a modificar. x e y están entre 0 y 1.
    //El origen (0,0) está en la esquina inferior izquierda


    private static Color banderaTricolor(double direccion, Color izquierda, Color centro, Color derecha) {
        if (direccion < 0.3) {
            return izquierda;
        }
        if (direccion < 0.66) {
            return centro;
        }
        return derecha;
    }

    public static Color tricolorVertical(double x, double y, Color izquierda, Color centro, Color derecha) {
        return banderaTricolor(x, izquierda, centro, derecha);
    }

    public static Color tricolorHorizontal(double x, double y, Color izquierda, Color centro, Color derecha) {
        return banderaTricolor(y, izquierda, centro, derecha);
    }

    private static Color bandasHorizontales(double x, double y, Color... colores) {
        int bandas = colores.length;
        double paso = (double) 1 / (double) (bandas);
        for (int i = 0; i < bandas; i++) {
            if (y < paso * (i + 1)) {
                return colores[i];
            }
        }
        return Color.BLACK;
    }

    private static Color devuelveColor(double x, double y) {
        //return bandasHorizontales(x,y,Color.BLACK,Color.YELLOW,Color.RED,Color.BLACK,Color.YELLOW,Color.RED);
        return bandasHorizontales(x, y,
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                Color.WHITE,
                Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK,
                Color.WHITE,
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242),
                new Color(12, 183, 242)
        );

        //Irlanda
        //return tricolorVertical(x,y,Color.GREEN,Color.WHITE,Color.ORANGE);
        //Francia
        //return tricolorVertical(x,y,Color.BLUE,Color.WHITE,Color.RED);
        //Alemania
        //   return tricolorHorizontal(x,y,Color.BLACK,Color.RED,Color.YELLOW);
//
//
//
// if(x<0.2){
//            return Color.BLUE;
//        }
//        if (y >0.1 && y<0.2 || y >0.3 && y<0.4 || y >0.5 && y<0.6 || y >0.7 && y<0.8) {
//            return new Color(198, 11, 30);
//        }
//        return new Color(247, 244, 30);
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
                Color color = devuelveColor(x / (double) ANCHO, y / (double) ALTO);
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
}
