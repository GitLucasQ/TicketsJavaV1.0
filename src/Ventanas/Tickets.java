package Ventanas;

import javax.swing.table.DefaultTableModel;
import Procesos.*;
import Validaciones.Numeros;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Tickets extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    Object filas[][] = {};
    String cabecera[] = {"Categoría", "IDEvento", "Nombre", "Tickets"};

    public Tickets() {
        initComponents();
        modeloTabla = new DefaultTableModel(filas, cabecera) {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        jTable1.setModel(modeloTabla);
        //para ordenar la tabla
        TableRowSorter<TableModel> orden = new TableRowSorter<TableModel>(modeloTabla);
        jTable1.setRowSorter(orden);

        ProcTablas pt = new ProcTablas();
        pt.agregaTickets("Conciertos", "RO001", "PSV", 500, modeloTabla);
        pt.agregaTickets("Conciertos", "RO002", "AC-DC", 800, modeloTabla);
        pt.agregaTickets("Conciertos", "RO003", "6 voltios", 500, modeloTabla);
        pt.agregaTickets("Conciertos", "SA001", "DLG", 600, modeloTabla);
        pt.agregaTickets("Conciertos", "SA002", "Víctor Manuel", 750, modeloTabla);
        pt.agregaTickets("Conciertos", "SA003", "Oscar de León", 850, modeloTabla);
        pt.agregaTickets("Conciertos", "CU001", "Grupo 5", 850, modeloTabla);
        pt.agregaTickets("Conciertos", "CU002", "Agua Marina", 800, modeloTabla);
        pt.agregaTickets("Conciertos", "CU003", "Coazón Serrano", 950, modeloTabla);
        pt.agregaTickets("Teatro", "DR001", "SAVIA", 500, modeloTabla);
        pt.agregaTickets("Teatro", "DR002", "La Tempestad", 800, modeloTabla);
        pt.agregaTickets("Teatro", "CM001", "Hasta la patas", 500, modeloTabla);
        pt.agregaTickets("Teatro", "CM002", "SUDAKAS", 600, modeloTabla);
        pt.agregaTickets("Teatro", "DA001", "Libertad D1", 750, modeloTabla);
        pt.agregaTickets("Teatro", "DA002", "Arborada", 850, modeloTabla);
        pt.agregaTickets("Entretenimiento", "FI001", "Fiesta Blanca Año Nuevo", 500, modeloTabla);
        pt.agregaTickets("Entretenimiento", "FI002", "Fiesta Año Nuevo", 800, modeloTabla);
        pt.agregaTickets("Entretenimiento", "FI003", "Urban Party", 800, modeloTabla);
        pt.agregaTickets("Entretenimiento", "PE001", "Almuerzo Show", 600, modeloTabla);
        pt.agregaTickets("Entretenimiento", "PE002", "Folclor en la Candelaria", 750, modeloTabla);
        pt.agregaTickets("Entretenimiento", "PE003", "Peña Criolla", 850, modeloTabla);
        pt.agregaTickets("Entretenimiento", "TO001", "Tour del Miedo - Cementerio", 800, modeloTabla);
        pt.agregaTickets("Entretenimiento", "TO002", "Laguna Huacachina", 800, modeloTabla);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbConciertos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtnomev = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnmodificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();
        btnaumenta = new javax.swing.JButton();
        btnquita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbConciertos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conciertos", "Teatro", "Entretenimiento" }));
        cmbConciertos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbConciertosItemStateChanged(evt);
            }
        });
        cmbConciertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConciertosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel10.setText("Nombre de evento:");

        txtnomev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomevKeyTyped(evt);
            }
        });

        jLabel11.setText("Categoría:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnomev, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtnomev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 240));

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad:");

        btnaumenta.setText("Aumentar");
        btnaumenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaumentaActionPerformed(evt);
            }
        });

        btnquita.setText("Quitar");
        btnquita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnmodificar)
                .addGap(18, 18, 18)
                .addComponent(btnaumenta)
                .addGap(18, 18, 18)
                .addComponent(btnquita)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnmodificar)
                        .addComponent(btnaumenta)
                        .addComponent(btnquita)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 580, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbConciertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConciertosActionPerformed

    }//GEN-LAST:event_cmbConciertosActionPerformed

    private void cmbConciertosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbConciertosItemStateChanged
        TableRowSorter cat = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(cat);
        switch (cmbConciertos.getSelectedIndex()) {
            case 0:
                cat.setRowFilter(RowFilter.regexFilter("Conciertos", 0));
                break;
            case 1:
                cat.setRowFilter(RowFilter.regexFilter("Teatro", 0));
                break;
            case 2:
                cat.setRowFilter(RowFilter.regexFilter("Entretenimiento", 0));
                break;
        }
    }//GEN-LAST:event_cmbConciertosItemStateChanged

    private void txtnomevKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomevKeyTyped
        TableRowSorter nomev = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(nomev);
        String filtro = txtnomev.getText();
        nomev.setRowFilter(RowFilter.regexFilter(filtro, 2));
    }//GEN-LAST:event_txtnomevKeyTyped

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        int filasele = jTable1.getSelectedRow();
        if (filasele == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleecionar un evento", "Error", HEIGHT);
            return;
        } else {
            if (Numeros.esNumero(txtcant.getText())) {
                if (Integer.parseInt(txtcant.getText()) <= 0) {
                    JOptionPane.showMessageDialog(rootPane, "La cantidad mínima es 1");
                    txtcant.setText("");
                    txtcant.requestFocusInWindow();
                    return;
                } else {
                    int cantidad = Integer.parseInt(txtcant.getText());
                    int op = JOptionPane.showConfirmDialog(rootPane, "¿Desea modificar la fecha del evento?", "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (op == 0) {
                        modeloTabla.setValueAt(cantidad, filasele, 3);
                        JOptionPane.showMessageDialog(null, "Cantidad de tickets modificada con éxtio");
                    }else{
                        return;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar valores numéricos enteros");
                txtcant.setText("");
                txtcant.requestFocusInWindow();
                return;
            }
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnaumentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaumentaActionPerformed
        int filasele = jTable1.getSelectedRow();
        if (filasele == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleecionar un evento", "Error", HEIGHT);
            return;
        } else {
            if (Numeros.esNumero(txtcant.getText())) {
                if (Integer.parseInt(txtcant.getText()) <= 0) {
                    JOptionPane.showMessageDialog(rootPane, "La cantidad mínima es 1");
                    txtcant.setText("");
                    txtcant.requestFocusInWindow();
                    return;
                } else {
                    int cantidad = Integer.parseInt(txtcant.getText());
                    String cadena = modeloTabla.getValueAt(filasele, 3).toString();
                    int cant_actual = Integer.parseInt(cadena);
                    int cant_nueva = cantidad + cant_actual;
                    modeloTabla.setValueAt(cant_nueva, filasele, 3);
                    JOptionPane.showMessageDialog(null, "Cantidad de tickets aumentada con éxtio");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar valores numéricos enteros");
                txtcant.setText("");
                txtcant.requestFocusInWindow();
                return;
            }
        }
    }//GEN-LAST:event_btnaumentaActionPerformed

    private void btnquitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitaActionPerformed
        int filasele = jTable1.getSelectedRow();
        if (filasele == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleecionar un evento", "Error", HEIGHT);
            return;
        } else {
            if (Numeros.esNumero(txtcant.getText())) {
                if (Integer.parseInt(txtcant.getText()) <= 0) {
                    JOptionPane.showMessageDialog(rootPane, "La cantidad mínima es 1");
                    txtcant.setText("");
                    txtcant.requestFocusInWindow();
                    return;
                } else {
                    int cantidad = Integer.parseInt(txtcant.getText());
                    String cadena = modeloTabla.getValueAt(filasele, 3).toString();
                    int cant_actual = Integer.parseInt(cadena);
                    int cant_nueva = cant_actual - cantidad;
                    if (cant_nueva <= 0) {
                        JOptionPane.showMessageDialog(rootPane, "La cantidad ingresada no puede ser mayor que la cantidad actual");
                        txtcant.setText("");
                        txtcant.requestFocusInWindow();
                    } else {
                        modeloTabla.setValueAt(cant_nueva, filasele, 3);
                        JOptionPane.showMessageDialog(null, "Cantidad de tickets disminuida con éxtio");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar valores numéricos enteros");
                txtcant.setText("");
                txtcant.requestFocusInWindow();
                return;
            }
        }
    }//GEN-LAST:event_btnquitaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tickets().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaumenta;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnquita;
    private javax.swing.JComboBox<String> cmbConciertos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtnomev;
    // End of variables declaration//GEN-END:variables

}
