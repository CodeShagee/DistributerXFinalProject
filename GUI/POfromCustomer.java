/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Domain.Customer;
import Domain.Products;
import Domain.SORegistry;
import Domain.SalesOrder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shiyanrox
 */
public class POfromCustomer extends javax.swing.JFrame {

    /**
     * Creates new form POfromCustomer
     */
    public POfromCustomer() {
        initComponents();
        setID();
        loadComboCustomer();
        loadProductTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPONo = new javax.swing.JTextField();
        ddlCustomer = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtRefCodePOC = new javax.swing.JTextField();
        dcPODate = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtProductSeach = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductSelectOPC = new javax.swing.JTable();
        lblProductNamePOC = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQTYPOC = new javax.swing.JTextField();
        btnAddtoCartPOC = new javax.swing.JButton();
        lblProductCodePOC = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPOC = new javax.swing.JTable();
        btnRmvItem = new javax.swing.JButton();
        btnRmvAll = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DistributerX: Purchasing Order from Customer");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Purchasing Order from customer"));

        jLabel1.setText("PO No:");

        jLabel2.setText("Customer");

        jLabel3.setText("Date");

        ddlCustomer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Ref.Code");

        txtRefCodePOC.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRefCodePOC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPONo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ddlCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcPODate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txtPONo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ddlCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtRefCodePOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcPODate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setText("Search");

        txtProductSeach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductSeachKeyReleased(evt);
            }
        });

        tblProductSelectOPC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Code", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductSelectOPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblProductSelectOPCMouseReleased(evt);
            }
        });
        tblProductSelectOPC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProductSelectOPCKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductSelectOPC);
        if (tblProductSelectOPC.getColumnModel().getColumnCount() > 0) {
            tblProductSelectOPC.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jLabel6.setText("QTY");

        txtQTYPOC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYPOCKeyTyped(evt);
            }
        });

        btnAddtoCartPOC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FontAwesome_f067(1)_24.png"))); // NOI18N
        btnAddtoCartPOC.setText("ADD");
        btnAddtoCartPOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartPOCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProductSeach))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtQTYPOC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btnAddtoCartPOC))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblProductCodePOC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblProductNamePOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProductSeach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProductCodePOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProductNamePOC, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQTYPOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddtoCartPOC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblPOC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Product code", "Product Name", "QTY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPOC);
        if (tblPOC.getColumnModel().getColumnCount() > 0) {
            tblPOC.getColumnModel().getColumn(0).setMaxWidth(50);
            tblPOC.getColumnModel().getColumn(1).setMaxWidth(80);
            tblPOC.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        btnRmvItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FontAwesome_f068(0)_24.png"))); // NOI18N
        btnRmvItem.setText("Remove Item");
        btnRmvItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmvItemActionPerformed(evt);
            }
        });

        btnRmvAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FontAwesome_f00d(0)_24.png"))); // NOI18N
        btnRmvAll.setText("Remove All");
        btnRmvAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmvAllActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FontAwesome_f05c(0)_24.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FontAwesome_f0c7(0)_32.png"))); // NOI18N
        btnSave.setText("Enter");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRmvItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRmvAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRmvItem)
                    .addComponent(btnRmvAll)
                    .addComponent(btnCancel)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductSeachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductSeachKeyReleased
        this.searchProduct(txtProductSeach.getText());
    }//GEN-LAST:event_txtProductSeachKeyReleased

    private void tblProductSelectOPCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductSelectOPCKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProductSelectOPCKeyReleased

    private void tblProductSelectOPCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductSelectOPCMouseReleased
        String item = tblProductSelectOPC.getModel().getValueAt(tblProductSelectOPC.getSelectedRow(), 0).toString();
        String itemV = tblProductSelectOPC.getModel().getValueAt(tblProductSelectOPC.getSelectedRow(), 1).toString();
        lblProductCodePOC.setText(item);
        lblProductNamePOC.setText(itemV);
    }//GEN-LAST:event_tblProductSelectOPCMouseReleased

    private void btnAddtoCartPOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartPOCActionPerformed
        if (txtQTYPOC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, " Qty Cannot be Empty!", "Data Missing", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int count = tblPOC.getRowCount();
                DefaultTableModel dtm = (DefaultTableModel) tblPOC.getModel();
                boolean check = false;
                int raw = 0;
                int tbRaw = 0;
                while (count > raw) {
                    if (Integer.parseInt(dtm.getValueAt(raw, 1).toString()) == Integer.parseInt(lblProductCodePOC.getText())) {
                        check = true;
                        tbRaw = raw;

                    }
                    raw++;
                }
                if (check) {
                    int currentQty = Integer.parseInt(dtm.getValueAt(tbRaw, 3).toString());
                    int newQty = currentQty + Integer.parseInt(txtQTYPOC.getText());
                    dtm.setValueAt(newQty, tbRaw, 3);
                } else {

                    count++;

                    Vector v = new Vector();
                    v.add(count);
                    v.add(lblProductCodePOC.getText());
                    v.add(lblProductNamePOC.getText());
                    v.add(txtQTYPOC.getText());
                    dtm.addRow(v);
                }
                lblProductCodePOC.setText("");
                lblProductNamePOC.setText("");
                txtQTYPOC.setText("");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAddtoCartPOCActionPerformed

    private void btnRmvItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmvItemActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblPOC.getModel();
        if (dtm.getRowCount() > 0) {
            try {
        dtm.removeRow(tblPOC.getSelectedRow());
        } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Please Select a Raw !", "Oops", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No Data Available !", "Oops", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRmvItemActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRmvAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmvAllActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblPOC.getModel();
        dtm.setRowCount(0);
    }//GEN-LAST:event_btnRmvAllActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
if (txtPONo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Po No!", "Data Missing", JOptionPane.ERROR_MESSAGE);
        } else {
        if (dcPODate.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Please Select a Date", "Data Missing", JOptionPane.ERROR_MESSAGE);
        } else {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dt = df.format(dcPODate.getDate());
        /*this stat indicate the po active or cancel 1=active 0=cancel*/
        int Stat = 1;

        boolean status = this.addSalesOrder(Integer.parseInt(txtRefCodePOC.getText()), txtPONo.getText(), ddlCustomer.getSelectedItem().toString(), dt, Stat);
        if (status) {
            JOptionPane.showMessageDialog(rootPane, "PO Added Successfully", "Oparation Complete", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error in PO Adding", "Oparation Incomplete", JOptionPane.ERROR);
        }

        this.clearAll();
}}
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtQTYPOCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYPOCKeyTyped
        char c = evt.getKeyChar();
        if (!(c <= '9' && c >= '0')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQTYPOCKeyTyped

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
            java.util.logging.Logger.getLogger(POfromCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POfromCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POfromCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POfromCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POfromCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoCartPOC;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRmvAll;
    private javax.swing.JButton btnRmvItem;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser dcPODate;
    private javax.swing.JComboBox ddlCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblProductCodePOC;
    private javax.swing.JLabel lblProductNamePOC;
    private javax.swing.JTable tblPOC;
    private javax.swing.JTable tblProductSelectOPC;
    private javax.swing.JTextField txtPONo;
    private javax.swing.JTextField txtProductSeach;
    private javax.swing.JTextField txtQTYPOC;
    private javax.swing.JTextField txtRefCodePOC;
    // End of variables declaration//GEN-END:variables
private void setID() {

        int id;
        SalesOrder obj = new SalesOrder();

        id = obj.getLastID();
        id++;
        txtRefCodePOC.setText(id + "");
        Date date = new Date();
        dcPODate.setDate(date);

    }

    private boolean addSalesOrder(int id, String pono, String customer, String date, int stat) {
        boolean status;
        SalesOrder obj = new SalesOrder();
        obj.setRefCode(id);
        obj.setPoNo(pono);
        obj.setCustomer(customer);
        obj.setDate(date);
        obj.setStatus(stat);

        status = obj.addSalesOrder(obj);
        if (status) {
            status = addSoregistryBulk(obj);
        }

        return status;
    }

    private boolean addSoregistryBulk(SalesOrder obj) {
        ArrayList<SORegistry> list = new ArrayList<SORegistry>();
        DefaultTableModel dtm = (DefaultTableModel) tblPOC.getModel();

        for (int raw_id = 0; tblPOC.getRowCount() > raw_id; raw_id++) {
            SORegistry regObj = new SORegistry();
            regObj.setRefCode(obj.getRefCode());
            regObj.setPoNo(obj.getPoNo());
            regObj.setPID(Integer.parseInt(dtm.getValueAt(raw_id, 1).toString()));
            regObj.setPDescription(dtm.getValueAt(raw_id, 2).toString());
            regObj.setQty(Integer.parseInt(dtm.getValueAt(raw_id, 3).toString()));

            list.add(regObj);
        }
        SORegistry PRobj = new SORegistry();
        boolean stat = PRobj.addSORegistryBulk(list);
        return stat;
    }

    private void loadComboCustomer() {
        Customer Customerobj = new Customer();
        ArrayList<Customer> CustomerobjList = Customerobj.loadCustomer();
        if (CustomerobjList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Sorry ! No Customers Found.");
        } else {
            Vector v = new Vector();
            Customer Customerss = new Customer();
            int count = 0;
            while (CustomerobjList.size() > count) {
                // hiddenValue hv= new hiddenValue();
                Customerss = CustomerobjList.get(count);

                // hv.setVisibleField(Categoryss.getCatName());
                // hv.setHiddenField(Categoryss.getCatID());
                v.add(Customerss.getC_name());

                count++;
            }
            ddlCustomer.setModel(new DefaultComboBoxModel(v));

        }
    }

    private void loadProductTable() {
        Products Productsobj = new Products();

        ArrayList<Products> ProductsList = Productsobj.loadProducts();
        if (ProductsList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Sorry ! No Product Found.");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblProductSelectOPC.getModel();
            dtm.setRowCount(0);
            int count = 0;
            while (ProductsList.size() > count) {
                Vector v = new Vector();
                Products Productss = new Products();
                Productss = ProductsList.get(count);

                v.add(Productss.getPID());
                v.add(Productss.getDescription());

                dtm.addRow(v);
                count++;

            }
        }

    }

    private void searchProduct(String text) {
        Products Productsobj = new Products();
        ArrayList<Products> ProductsList = Productsobj.searchProducts(text);
        if (ProductsList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Sorry ! No Product Found.");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblProductSelectOPC.getModel();
            dtm.setRowCount(0);
            int count = 0;
            while (ProductsList.size() > count) {
                Vector v = new Vector();
                Products Productss = new Products();
                Productss = ProductsList.get(count);

                v.add(Productss.getPID());
                v.add(Productss.getDescription());

                dtm.addRow(v);
                count++;

            }
        }

    }

    private void clearAll() {
        DefaultTableModel dtm = (DefaultTableModel) tblPOC.getModel();
        dtm.setRowCount(0);
        loadComboCustomer();
        setID();
    }

}
