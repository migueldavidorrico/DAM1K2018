package es.orrico.miguel;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import java.awt.*;

/**
 * Clase para mostrar en bonito una Tabla
 *
 * @author miguel
 * @version 1.0
 */

public class Utilidades {

    private static int ANCHO=50;
    private static int ALTO=30;

    /**
     * Muestra una tabla con un JOption y un botón aceptar
     * @param tabla la tabla a mostrar
     */
    public static void muestraTabla(int[][] tabla){
        TableModel dataModel = new AbstractTableModel() {
            public int getColumnCount() { return tabla[0].length; }
            public int getRowCount() { return tabla.length;}
            public Object getValueAt(int row, int col) { return new Integer(tabla[row][col]); }
        };
        JTable table = new JTable(dataModel);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        table.setAutoCreateRowSorter(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        Font fuente=centerRenderer.getFont();

        centerRenderer.setFont(new Font(fuente.getName(), Font.BOLD, fuente.getSize()+10));
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for (int i = 0; i < tabla[0].length; i++) {
//            table.getColumnModel().getColumn(i).setPreferredWidth(ANCHO);
            table.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }

        JScrollPane panel=new JScrollPane(table);
        Dimension d=new Dimension((tabla[0].length-1)*ANCHO,tabla.length*ALTO);
        panel.setPreferredSize(d);

        JOptionPane.showMessageDialog(null, table);
    }

    public static void main(String[] args) {
        int[][] tabla={
                {2,3,45},
                {3,5,1}
        };

        muestraTabla(tabla);
    }
}
