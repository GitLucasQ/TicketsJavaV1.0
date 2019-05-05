
package Ventanas;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Dashboard_Adm extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    int x, y;

    public Dashboard_Adm() {
        initComponents();
        //PanelCat.setVisible(false);
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(3, 26, 64));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(0, 18, 48));
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
        jPanel3 = new javax.swing.JPanel();
        btnTickets = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEventos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnlogout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnFechas = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PanelCat = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnEntr = new javax.swing.JButton();
        btnConciertos = new javax.swing.JButton();
        btnTeatro = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbmsj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 18, 48));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 18, 48));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTickets.setBackground(new java.awt.Color(0, 18, 48));
        btnTickets.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnTickets.setForeground(new java.awt.Color(255, 255, 255));
        btnTickets.setText("Tickets");
        btnTickets.setBorder(null);
        btnTickets.setBorderPainted(false);
        btnTickets.setContentAreaFilled(false);
        btnTickets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTickets.setFocusPainted(false);
        btnTickets.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTicketsMousePressed(evt);
            }
        });
        btnTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketsActionPerformed(evt);
            }
        });
        jPanel3.add(btnTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_ticket.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 60));

        jPanel2.setBackground(new java.awt.Color(0, 18, 48));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEventos.setBackground(new java.awt.Color(0, 18, 48));
        btnEventos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEventos.setForeground(new java.awt.Color(255, 255, 255));
        btnEventos.setText("Eventos");
        btnEventos.setBorder(null);
        btnEventos.setBorderPainted(false);
        btnEventos.setContentAreaFilled(false);
        btnEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEventos.setFocusPainted(false);
        btnEventos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEventosMousePressed(evt);
            }
        });
        btnEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventosActionPerformed(evt);
            }
        });
        jPanel2.add(btnEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_calendario.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 60));

        jPanel5.setBackground(new java.awt.Color(0, 18, 48));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogout.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setText("Cerrar Sesión");
        btnlogout.setBorder(null);
        btnlogout.setBorderPainted(false);
        btnlogout.setContentAreaFilled(false);
        btnlogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogout.setFocusPainted(false);
        btnlogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlogout.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnlogoutMousePressed(evt);
            }
        });
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel5.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, 50));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_logout.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 200, 70));

        jPanel8.setBackground(new java.awt.Color(0, 18, 48));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_fecha.png"))); // NOI18N
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        btnFechas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnFechas.setForeground(new java.awt.Color(255, 255, 255));
        btnFechas.setText("Fechas");
        btnFechas.setBorder(null);
        btnFechas.setBorderPainted(false);
        btnFechas.setContentAreaFilled(false);
        btnFechas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechas.setFocusPainted(false);
        btnFechas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFechas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFechasMousePressed(evt);
            }
        });
        btnFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechasActionPerformed(evt);
            }
        });
        jPanel8.add(btnFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, 60));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 199, 490));

        jPanel4.setBackground(new java.awt.Color(0, 136, 137));
        jPanel4.setDoubleBuffered(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashboard");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 10, 10));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/linea.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 10, 10));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 590, 110));

        PanelCat.setBackground(new java.awt.Color(0, 18, 48));
        PanelCat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categorías");
        PanelCat.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        btnEntr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEntr.setForeground(new java.awt.Color(255, 255, 255));
        btnEntr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_fiesta.png"))); // NOI18N
        btnEntr.setText("Entretenimiento");
        btnEntr.setBorderPainted(false);
        btnEntr.setContentAreaFilled(false);
        btnEntr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntr.setFocusPainted(false);
        btnEntr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrActionPerformed(evt);
            }
        });
        PanelCat.add(btnEntr, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 170, 50));

        btnConciertos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConciertos.setForeground(new java.awt.Color(255, 255, 255));
        btnConciertos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_musica.png"))); // NOI18N
        btnConciertos.setText("Conciertos");
        btnConciertos.setBorderPainted(false);
        btnConciertos.setContentAreaFilled(false);
        btnConciertos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConciertos.setFocusPainted(false);
        btnConciertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConciertosActionPerformed(evt);
            }
        });
        PanelCat.add(btnConciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 140, 50));

        btnTeatro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTeatro.setForeground(new java.awt.Color(255, 255, 255));
        btnTeatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_teatro.png"))); // NOI18N
        btnTeatro.setText("Teatro");
        btnTeatro.setBorderPainted(false);
        btnTeatro.setContentAreaFilled(false);
        btnTeatro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTeatro.setFocusPainted(false);
        btnTeatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeatroActionPerformed(evt);
            }
        });
        PanelCat.add(btnTeatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 130, 50));

        getContentPane().add(PanelCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(-520, 108, 590, 270));
        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jPanel7.setBackground(new java.awt.Color(0, 136, 137));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbmsj.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        lbmsj.setForeground(new java.awt.Color(255, 255, 255));
        lbmsj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(lbmsj, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 330, 50));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 590, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventosActionPerformed
        int posicion = this.PanelCat.getX();

        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(199, -739, 2, 2, PanelCat);
        } else {
            Animacion.Animacion.mover_derecha(-739, 199, 2, 2, PanelCat);
        }
    }//GEN-LAST:event_btnEventosActionPerformed

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
        Tickets ti = new Tickets();
        ti.setVisible(true);
        ti.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTicketsActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

    }//GEN-LAST:event_jPanel2MousePressed

    private void btnEventosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventosMousePressed
        setColor(jPanel2);
        resetColor(jPanel3);
        resetColor(jPanel5);
    }//GEN-LAST:event_btnEventosMousePressed

    private void btnTicketsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMousePressed
        setColor(jPanel3);
        resetColor(jPanel2);
        resetColor(jPanel5);
        resetColor(jPanel8);
    }//GEN-LAST:event_btnTicketsMousePressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_formMouseDragged

    private void btnConciertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConciertosActionPerformed
        Conciertos_Adm miForm = new Conciertos_Adm();
        miForm.setVisible(true);
        miForm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnConciertosActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        Login lg = new Login();
        int res = JOptionPane.showConfirmDialog(rootPane, "¿Desea cerrar la sesión?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            lg.setVisible(true);
            lg.setLocationRelativeTo(null);
            this.dispose();
        } else {
            return;
        }

    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnlogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMousePressed
        setColor(jPanel5);
        resetColor(jPanel2);
        resetColor(jPanel3);
        resetColor(jPanel8);
    }//GEN-LAST:event_btnlogoutMousePressed

    private void btnFechasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFechasMousePressed
        setColor(jPanel8);
        resetColor(jPanel2);
        resetColor(jPanel3);
        resetColor(jPanel5);
    }//GEN-LAST:event_btnFechasMousePressed

    private void btnFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechasActionPerformed
        Fechas fe = new Fechas();
        fe.setVisible(true);
        fe.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnFechasActionPerformed

    private void btnEntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrActionPerformed
        Entretenimiento_Adm ent = new Entretenimiento_Adm();
        ent.setVisible(true);
        ent.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEntrActionPerformed

    private void btnTeatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeatroActionPerformed
        Teatro_Adm teadm = new Teatro_Adm();
        teadm.setVisible(true);
        teadm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTeatroActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Adm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCat;
    private javax.swing.JButton btnConciertos;
    private javax.swing.JButton btnEntr;
    private javax.swing.JButton btnEventos;
    private javax.swing.JButton btnFechas;
    private javax.swing.JButton btnTeatro;
    private javax.swing.JButton btnTickets;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JLabel lbmsj;
    // End of variables declaration//GEN-END:variables
}