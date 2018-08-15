/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.DBConnection;

import Domain.batch;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shiyanrox
 */
public class Batch extends javax.swing.JFrame {

    /**
     * Creates new form Batch
     */
    public Batch() {
        initComponents();
        this.setBid();
        this.loadTable();
        btnDelete.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBatchCode = new javax.swing.JTextField();
        txtBatchName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dcBatch = new com.toedter.calendar.JDateChooser();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtBatchSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBatch = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DistributerX: Batch");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Batch"));

        jLabel1.setText("Batch Code");

        jLabel2.setText("Batch Name");

        txtBatchCode.setEditable(false);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FontAwesome_f0c7(0)_32.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Entypo_2716(0)_32.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel3.setText("Batch Date");

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FontAwesome_f014(0)_32.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FontAwesome_f12d(1)_32.png"))); // NOI18N
        btnClear.setText("Clear All");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBatchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBatchName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dcBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(txtBatchCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBatchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(dcBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear)
                        .addComponent(btnDelete))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setText("Search");

        txtBatchSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBatchSearchKeyReleased(evt);
            }
        });

        tbBatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Batch Code", "Batch Name", "Batch Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbBatchMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbBatch);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtBatchSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBatchSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtBatchCode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No Batch Code Available!", "Error", JOptionPane.ERROR);
        } else {
            if (btnSave.getText() == "Save") {
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String dt = df.format(dcBatch.getDate());

                boolean stat = this.addBatch(Integer.parseInt(txtBatchCode.getText()), txtBatchName.getText(), dt);
                if (stat) {
                    JOptionPane.showMessageDialog(rootPane, "Batch Added Successfully", "Oparation Complete", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error in Batch Adding", "Oparation Incomplete", JOptionPane.ERROR);
                }
                this.loadTable();
                this.clearAll();
            } else {
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String dt = df.format(dcBatch.getDate());
                boolean stat = this.updateBatch(Integer.parseInt(txtBatchCode.getText()), txtBatchName.getText(), dt);
                if (stat) {
                    JOptionPane.showMessageDialog(rootPane, "Batch Added Successfully", "Oparation Complete", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error in Batch Adding", "Oparation Incomplete", JOptionPane.ERROR);
                }
                this.loadTable();
                this.clearAll();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbBatchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBatchMouseReleased

        try {
            int id = Integer.parseInt(tbBatch.getModel().getValueAt(tbBatch.getSelectedRow(), 1).toString());

            batch obj = new batch();
            batch venObj = obj.viewAbatch(id);
            txtBatchCode.setText(venObj.getBID() + "");
            txtBatchName.setText(venObj.getBname());
            java.util.Date dat = new SimpleDateFormat("yyyy-MM-dd").parse(venObj.getBdate());
            dcBatch.setDate(dat);

            btnSave.setText("Update");
            btnDelete.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tbBatchMouseReleased

    private void txtBatchSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBatchSearchKeyReleased
        this.Searchbatch(txtBatchSearch.getText());
    }//GEN-LAST:event_txtBatchSearchKeyReleased

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtBatchCode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No Batch Code Available!", "Error", JOptionPane.ERROR);
        } else {
            int comp = JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete this record?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (comp == 0) {
                boolean stat = this.deleteBatch(Integer.parseInt(txtBatchCode.getText()));
                if (stat) {
                    JOptionPane.showMessageDialog(rootPane, "Batch Delete Successfully", "Oparation Complete", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error in Batch Deleting", "Oparation Incomplete", JOptionPane.ERROR);
                }
                this.loadTable();
            } else {
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearAll();
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser dcBatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbBatch;
    private javax.swing.JTextField txtBatchCode;
    private javax.swing.JTextField txtBatchName;
    private javax.swing.JTextField txtBatchSearch;
    // End of variables declaration//GEN-END:variables
private void setBid() {

        int bid;
        batch obj = new batch();
        bid = obj.getLastBID();
        bid++;
        txtBatchCode.setText(bid + "");
    }

    private boolean addBatch(int bid, String name, String date) {
        boolean status;
        batch obj = new batch();
        obj.setBID(bid);
        obj.setBname(name);
        obj.setBdate(date);

        status = obj.addBatch(obj);

        return status;
    }

    private void clearAll() {
        this.setBid();
        txtBatchName.setText("");
        dcBatch.setDate(new java.util.Date());

        btnSave.setText("Save");
        btnDelete.setVisible(false);
    }

    private void loadTable() {
        batch batchobj = new batch();
        ArrayList<batch> batchList = batchobj.loadbatch();
        if (batchList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Sorry ! No Batch Found.");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tbBatch.getModel();
            dtm.setRowCount(0);
            int count = 0;
            while (batchList.size() > count) {
                Vector v = new Vector();
                batch batchs = new batch();
                batchs = batchList.get(count);
                v.add(count + 1);
                v.add(batchs.getBID());
                v.add(batchs.getBname());
                v.add(batchs.getBdate());

                dtm.addRow(v);
                count++;

            }
        }

    }

    private boolean updateBatch(int bid, String name, String date) {

        boolean status;
        batch obj = new batch();
        obj.setBID(bid);
        obj.setBname(name);
        obj.setBdate(date);

        status = obj.updateBatch(obj);

        return status;
    }

    private void Searchbatch(String text) {
        batch vendorobj = new batch();
        ArrayList<batch> batchList = vendorobj.searchbatch(text);
        if (batchList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Sorry ! No batch Found.");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tbBatch.getModel();
            dtm.setRowCount(0);
            int count = 0;
            while (batchList.size() > count) {
                Vector v = new Vector();
                batch batchs = new batch();
                batchs = batchList.get(count);
                v.add(count + 1);
                v.add(batchs.getBID());
                v.add(batchs.getBname());
                v.add(batchs.getBdate());

                dtm.addRow(v);
                count++;

            }
        }

    }

    private boolean deleteBatch(int id) {
        batch obj = new batch();
        boolean stat = obj.deleteBatch(id);
        return stat;
    }

}