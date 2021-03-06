package Ventanas;

import javax.swing.table.DefaultTableModel;
import Validaciones.Numeros;
import javax.swing.JOptionPane;
import Procesos.*;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Teatro extends javax.swing.JFrame {

    DefaultTableModel modeloTabla, modeloPrecios;
    Object filas[][] = {};
    String cabecera[] = {"IDEvento", "ID_Cat", "Nombre", "Tipo", "Fecha", "Hora", "Duración", "Precio", "Tickets"};
    Object filas2[][] = {};
    String cabecera2[] = {"ID_Ev", "Evento", "Zona", "Cantidad", "Sub_Total"};

    public Teatro() {
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
        modeloPrecios = new DefaultTableModel(filas2, cabecera2) {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        tabaprecios.setModel(modeloPrecios);

        ProcTablas pt = new ProcTablas();

        pt.listaEvento("DR001", "DR", "SAVIA", "Drama", "28/04/2018", "19:30 pm", "120 min", 45, 500, modeloTabla);
        pt.listaEvento("DR002", "DR", "La Tempestad", "Drama", "23/06/2018", "18:30 pm", "110 min", 105, 800, modeloTabla);
        pt.listaEvento("CM001", "CM", "Hasta la patas", "Comedia", "01/02/2018", "15:00 pm", "110 min", 40, 500, modeloTabla);
        pt.listaEvento("CM002", "CM", "SUDAKAS", "Comedia", "15/03/2018", "18:30 pm", "120 min", 45, 600, modeloTabla);
        pt.listaEvento("DA001", "DA", "Libertad D1", "Danza", "10/05/2018", "18:00 pm", "100 min", 55, 750, modeloTabla);
        pt.listaEvento("DA002", "DA", "Arborada", "Danza", "14/08/2018", "17:40 pm", "110 min", 60, 850, modeloTabla);

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
        btnDetalles = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtnomev = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtevento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfec = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txthora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdura = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbzona = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabaprecios = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbConciertos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comedia", "Danza", "Drama" }));
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

        btnDetalles.setText("Ver Detalles");
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre de evento:");

        txtnomev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomevKeyTyped(evt);
            }
        });

        jLabel11.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnomev, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(btnDetalles)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalles)
                    .addComponent(cmbConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtnomev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 230));

        jLabel1.setText("IdEvento");

        txtid.setEditable(false);
        txtid.setBackground(new java.awt.Color(255, 255, 255));
        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Evento");

        txtevento.setEditable(false);
        txtevento.setBackground(new java.awt.Color(255, 255, 255));
        txtevento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Fecha");

        txtfec.setEditable(false);
        txtfec.setBackground(new java.awt.Color(255, 255, 255));
        txtfec.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Hora");

        txthora.setEditable(false);
        txthora.setBackground(new java.awt.Color(255, 255, 255));
        txthora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Duración");

        txtdura.setEditable(false);
        txtdura.setBackground(new java.awt.Color(255, 255, 255));
        txtdura.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtevento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtdura, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txthora, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtfec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtevento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4)))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5)))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 280, 300));

        jLabel7.setText("Zona");

        cmbzona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Popular", "Platinium", "VIP" }));
        cmbzona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbzonaActionPerformed(evt);
            }
        });

        jLabel6.setText("Precio");

        txtprecio.setEditable(false);
        txtprecio.setBackground(new java.awt.Color(255, 255, 255));
        txtprecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setText("Cantidad");

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbzona, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtprecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnagregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbzona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnagregar)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 210, 300));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabaprecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabaprecios.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabaprecios);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, 160));

        jLabel9.setLabelFor(txtTotal);
        jLabel9.setText("Total");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 100, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 360, 300));

        btnVender.setText("Generar Factura");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(btnVender)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 810, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbConciertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConciertosActionPerformed

    }//GEN-LAST:event_cmbConciertosActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        int fila_selec = jTable1.getSelectedRow();
        if (fila_selec == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un evento.");
        } else {
            String idev = jTable1.getValueAt(fila_selec, 0).toString();            
            String nom = jTable1.getValueAt(fila_selec, 2).toString();            
            String fecha = jTable1.getValueAt(fila_selec, 4).toString();
            String hora = jTable1.getValueAt(fila_selec, 5).toString();
            String dura = jTable1.getValueAt(fila_selec, 6).toString();
            String precio = jTable1.getValueAt(fila_selec, 7).toString();            

            txtid.setText(idev);
            txtevento.setText(nom);
            txtfec.setText(fecha);
            txthora.setText(hora);
            txtdura.setText(dura);
            txtprecio.setText(precio);
        }
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void cmbzonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbzonaActionPerformed
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un evento.");
        } else {
            float pre;
            float precio = (float) jTable1.getValueAt(fila, 7);
            switch (cmbzona.getSelectedIndex()) {
                case 0:
                    pre = precio;
                    txtprecio.setText(String.valueOf(pre));
                    break;
                case 1:
                    pre = (float) (precio * 1.3);
                    txtprecio.setText(String.valueOf(pre));
                    break;
                case 2:
                    pre = (float) (precio * 2);
                    txtprecio.setText(String.valueOf(pre));
                    break;
            }
        }
    }//GEN-LAST:event_cmbzonaActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        if (Numeros.esNumero(txtcantidad.getText())) {
            if (Integer.parseInt(txtcantidad.getText()) <= 0) {
                JOptionPane.showMessageDialog(rootPane, "La cantidad mínima es 1");
                txtcantidad.setText("");
                txtcantidad.requestFocusInWindow();
                return;
            } else {
                String ide = txtid.getText();
                String ev = txtevento.getText();
                String zona = (String) cmbzona.getSelectedItem();
                int cant = Integer.parseInt(txtcantidad.getText());
                float prec = Float.parseFloat(txtprecio.getText());
                float subtotal = prec * cant;
                String datos_tic[] = {ide, ev, zona, String.valueOf(cant), String.valueOf(subtotal)};
                modeloPrecios.addRow(datos_tic);

                float total = Calculos.calculaTotal(modeloPrecios);
                txtTotal.setText(String.valueOf(total));
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar valores numéricos enteros");
            txtcantidad.setText("");
            txtcantidad.requestFocusInWindow();
            return;
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tabaprecios.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una fila para eliminar");
            return;
        } else {
            int pos = tabaprecios.getSelectedRow();
            modeloPrecios.removeRow(pos);
            float total = Calculos.calculaTotal(modeloPrecios);
            txtTotal.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea borrar los datos?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == 0) {
            modeloPrecios.setRowCount(0);
            txtTotal.setText("");
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cmbConciertosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbConciertosItemStateChanged
        TableRowSorter cat = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(cat);
        switch (cmbConciertos.getSelectedIndex()) {
            case 0:
                cat.setRowFilter(RowFilter.regexFilter("Comedia", 3));
                break;
            case 1:
                cat.setRowFilter(RowFilter.regexFilter("Danza", 3));
                break;
            case 2:
                cat.setRowFilter(RowFilter.regexFilter("Drama", 3));
                break;
        }
    }//GEN-LAST:event_cmbConciertosItemStateChanged

    private void txtnomevKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomevKeyTyped
        TableRowSorter nomev = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(nomev);
        String filtro = txtnomev.getText();
        nomev.setRowFilter(RowFilter.regexFilter(filtro, 2));
    }//GEN-LAST:event_txtnomevKeyTyped

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        Factura fac = new Factura();
        fac.setVisible(true);
        fac.setLocationRelativeTo(null);
        DefaultTableModel modelo1 = (DefaultTableModel) tabaprecios.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) fac.tablafac.getModel();
        for (int i = 0; i < modelo1.getRowCount(); i++) {
            Object fila[] = new Object[modelo1.getColumnCount()];
            for (int j = 0; j < modelo1.getColumnCount(); j++) {
                fila[j] = modelo1.getValueAt(i, j);
            }
            modelo2.addRow(fila);
        }
        fac.tablafac.setModel(modelo2);
        fac.total.setText(txtTotal.getText());
        float igv = Calculos.calculaIGV(modeloPrecios);
        fac.txtigv.setText(String.valueOf(String.format("%.2f",igv)));
        float pagoT = Calculos.totalPagar(modeloPrecios);
        fac.txtpagot.setText(String.valueOf(String.format("%.2f", pagoT)));
    }//GEN-LAST:event_btnVenderActionPerformed

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
            java.util.logging.Logger.getLogger(Teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teatro().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnagregar;
    private javax.swing.JComboBox<String> cmbConciertos;
    private javax.swing.JComboBox<String> cmbzona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable tabaprecios;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdura;
    private javax.swing.JTextField txtevento;
    private javax.swing.JTextField txtfec;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnomev;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables

}
