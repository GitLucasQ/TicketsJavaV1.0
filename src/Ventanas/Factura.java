package Ventanas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import Entidades.Facturas;
import Procesos.GeneraPDF;

public class Factura extends javax.swing.JFrame {

    DefaultTableModel modelofac;
    Object filas[][] = {};
    String cabecera[] = {"ID_Ev", "Evento", "Zona", "Cantidad", "Sub_Total"};

    public Factura() {
        initComponents();
        modelofac = new DefaultTableModel(filas, cabecera) {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        tablafac.setModel(modelofac);
        Facturas f = new Facturas();
        String codigo = f.getCodigo();
        lbcod.setText(codigo);
        Date fecfac = f.getFecha_fac();
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy   HH:mm:ss");
        txtfecfac.setText(formato.format(fecfac));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupopago = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtape = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtfecfac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbcredito = new javax.swing.JRadioButton();
        rbdebito = new javax.swing.JRadioButton();
        rbcontado = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        lbcod = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablafac = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnpdf = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtpagot = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtigv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 136, 119));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 18, 48));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres: ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        txtnom.setBackground(new java.awt.Color(0, 18, 48));
        txtnom.setForeground(new java.awt.Color(255, 255, 255));
        txtnom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtnom.setNextFocusableComponent(txtape);
        jPanel3.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 143, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtape.setBackground(new java.awt.Color(0, 18, 48));
        txtape.setForeground(new java.awt.Color(255, 255, 255));
        txtape.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtape.setNextFocusableComponent(txtdni);
        jPanel3.add(txtape, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 143, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        txtdni.setBackground(new java.awt.Color(0, 18, 48));
        txtdni.setForeground(new java.awt.Color(255, 255, 255));
        txtdni.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtdni.setNextFocusableComponent(txtfecfac);
        jPanel3.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 131, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha y hora:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtfecfac.setEditable(false);
        txtfecfac.setBackground(new java.awt.Color(0, 18, 48));
        txtfecfac.setForeground(new java.awt.Color(255, 255, 255));
        txtfecfac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfecfac.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtfecfac.setNextFocusableComponent(rbcredito);
        jPanel3.add(txtfecfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 143, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Método Pago:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        rbcredito.setBackground(new java.awt.Color(0, 18, 48));
        grupopago.add(rbcredito);
        rbcredito.setForeground(new java.awt.Color(255, 255, 255));
        rbcredito.setText("Tarjeta Crédito");
        rbcredito.setNextFocusableComponent(rbdebito);
        rbcredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcreditoActionPerformed(evt);
            }
        });
        jPanel3.add(rbcredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        rbdebito.setBackground(new java.awt.Color(0, 18, 48));
        grupopago.add(rbdebito);
        rbdebito.setForeground(new java.awt.Color(255, 255, 255));
        rbdebito.setText("Tarjeta Débito");
        rbdebito.setNextFocusableComponent(rbcontado);
        rbdebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdebitoActionPerformed(evt);
            }
        });
        jPanel3.add(rbdebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        rbcontado.setBackground(new java.awt.Color(0, 18, 48));
        grupopago.add(rbcontado);
        rbcontado.setForeground(new java.awt.Color(255, 255, 255));
        rbcontado.setText("Contado");
        rbcontado.setNextFocusableComponent(btnpdf);
        rbcontado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcontadoActionPerformed(evt);
            }
        });
        jPanel3.add(rbcontado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Factura N°");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lbcod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbcod.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lbcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 20, 122, 22));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 140, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 140, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 630, 230));

        tablafac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablafac.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablafac);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 450, 248));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Suma Total:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        total.setEditable(false);
        total.setBackground(new java.awt.Color(0, 136, 119));
        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("* Incluye IGV");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, -1, -1));

        btnpdf.setBackground(new java.awt.Color(0, 136, 119));
        btnpdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_pdf.png"))); // NOI18N
        btnpdf.setToolTipText("Generar factura en PDF");
        btnpdf.setBorder(null);
        btnpdf.setBorderPainted(false);
        btnpdf.setContentAreaFilled(false);
        btnpdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpdf.setFocusPainted(false);
        btnpdf.setNextFocusableComponent(txtnom);
        btnpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpdfActionPerformed(evt);
            }
        });
        jPanel1.add(btnpdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total a Pagar:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, -1, -1));

        txtpagot.setEditable(false);
        txtpagot.setBackground(new java.awt.Color(0, 136, 119));
        txtpagot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpagot.setForeground(new java.awt.Color(255, 255, 255));
        txtpagot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtpagot, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("IGV:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, -1));

        txtigv.setEditable(false);
        txtigv.setBackground(new java.awt.Color(0, 136, 119));
        txtigv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtigv.setForeground(new java.awt.Color(255, 255, 255));
        txtigv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtigv, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 578, 111, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpdfActionPerformed
        String codfac = lbcod.getText();
        String nom = txtnom.getText();
        String ape = txtape.getText();
        String dni = txtdni.getText();
        String fechor = txtfecfac.getText();
        String tipo = grupopago.getSelection().getActionCommand();
        String sm = total.getText();
        String igv = txtigv.getText();
        String tp = txtpagot.getText();
        GeneraPDF pdf = new GeneraPDF();
        pdf.creaPdf(codfac, nom, ape, dni, fechor, tipo, sm, igv, tp, modelofac);
    }//GEN-LAST:event_btnpdfActionPerformed

    private void rbcreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcreditoActionPerformed
        rbcredito.setActionCommand("Tarjeta Crédito");
    }//GEN-LAST:event_rbcreditoActionPerformed

    private void rbdebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdebitoActionPerformed
        rbdebito.setActionCommand("Tarjeta Débito");
    }//GEN-LAST:event_rbdebitoActionPerformed

    private void rbcontadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcontadoActionPerformed
        rbcontado.setActionCommand("Contado");
    }//GEN-LAST:event_rbcontadoActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpdf;
    private javax.swing.ButtonGroup grupopago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbcod;
    private javax.swing.JRadioButton rbcontado;
    private javax.swing.JRadioButton rbcredito;
    private javax.swing.JRadioButton rbdebito;
    public javax.swing.JTable tablafac;
    public javax.swing.JTextField total;
    public javax.swing.JTextField txtape;
    public javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtfecfac;
    public javax.swing.JTextField txtigv;
    public javax.swing.JTextField txtnom;
    public javax.swing.JTextField txtpagot;
    // End of variables declaration//GEN-END:variables
}
