
package Procesos;

import javax.swing.table.DefaultTableModel;


public class Calculos {
    
    public static float calculaTotal(DefaultTableModel modelo){
        float total = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String cadena = (String) modelo.getValueAt(i, 4);
            float sub = Float.parseFloat(cadena);
            total += sub;
        }
        return total;
    }
    
    public static float calculaIGV(DefaultTableModel modelo){
        float sum_total = calculaTotal(modelo);
        float igv = (float) (sum_total * 0.18);
        return igv;
    }
    
    public static float totalPagar(DefaultTableModel modelo){
        float sum_total = calculaTotal(modelo);
        float igv = calculaIGV(modelo);
        float pago = sum_total + igv;
        return pago;
    }
}
