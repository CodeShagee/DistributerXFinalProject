/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Domain.Customer;
import Domain.Vendor;
import Domain.Vendor;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shiyanrox
 */
public class Vendors extends javax.swing.JFrame {

    /**
     * Creates new form Vendors
     */
    public Vendors() {
        initComponents();
        this.setVid();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVID = new javax.swing.JTextField();
        txtVenName = new javax.swing.JTextField();
        txtContactPreson = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaVAddress = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtVenSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVendor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DistributerX: Vendor");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vendor"));

        jLabel1.setText("Vendor ID");

        jLabel2.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("Contact Person");

        jLabel5.setText("Telephone");

        txtVID.setEditable(false);
        txtVID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVIDActionPerformed(evt);
            }
        });

        txtVenName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVenNameActionPerformed(evt);
            }
        });

        txtaVAddress.setColumns(20);
        txtaVAddress.setRows(5);
        jScrollPane1.setViewportView(txtaVAddress);

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVenName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContactPreson, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtTelephone)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(btnDelete))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnCancel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(txtVID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContactPreson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(txtVenName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setText("Search");

        txtVenSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVenSearchKeyReleased(evt);
            }
        });

        tblVendor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "VrndorID", "Name", "Address", "Contact Preson", "telephone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVendor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblVendorMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblVendor);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtVenSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtVenSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVIDActionPerformed

    private void txtVenNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVenNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVenNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (btnSave.getText() == "Save") {
            boolean stat = this.addVendor(Integer.parseInt(txtVID.getText()), txtVenName.getText(), txtaVAddress.getText(), txtContactPreson.getText(), txtTelephone.getText());
            if (stat) {
                JOptionPane.showMessageDialog(rootPane, "Vendor Added Successfully", "Oparation Complete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error in Vendor Adding", "Oparation Incomplete", JOptionPane.ERROR);
            }
            this.loadTable();
            this.clearAll();
        } else {
            boolean stat = this.updateVendor(Integer.parseInt(txtVID.getText()), txtVenName.getText(), txtaVAddress.getText(), txtContactPreson.getText(), txtTelephone.getText());
            if (stat) {
                JOptionPane.showMessageDialog(rootPane, "Vendor Added Successfully", "Oparation Complete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error in Vendor Adding", "Oparation Incomplete", JOptionPane.ERROR);
            }
            this.loadTable();
            this.clearAll();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtVenSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVenSearchKeyReleased
        this.SearchVendor(txtVenSearch.getText());
    }//GEN-LAST:event_txtVenSearchKeyReleased

    private void tblVendorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendorMouseReleased
       int id = Integer.parseInt(tblVendor.getModel().getValueAt(tblVendor.getSelectedRow(), 1).toString());
        Vendor obj = new Vendor();
        Vendor venObj = obj.viewAVendor(id);
        txtVID.setText(venObj.getV_id() + "");
        txtVenName.setText(venObj.getV_name());
        txtaVAddress.setText(venObj.getV_address());
        txtContactPreson.setText(venObj.getV_contactP());
        txtTelephone.setText(venObj.getV_phone());

        btnSave.setText("Update");
        btnDelete.setVisible(true);
    }//GEN-LAST:event_tblVendorMouseReleased

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int comp= JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete this record?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(comp==0){
           boolean stat= this.deleteVendor(Integer.parseInt(txtVID.getText()));
            if (stat){
                JOptionPane.showMessageDialog(rootPane, "Vendor Delete Successfully", "Oparation Complete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error in Vendor Deleting", "Oparation Incomplete", JOptionPane.ERROR);
            }
            this.loadTable();
        }
        else{
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
            java.util.logging.Logger.getLogger(Vendors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblVendor;
    private javax.swing.JTextField txtContactPreson;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtVID;
    private javax.swing.JTextField txtVenName;
    private javax.swing.JTextField txtVenSearch;
    private javax.swing.JTextArea txtaVAddress;
    // End of variables declaration//GEN-END:variables

    private void setVid() {
        
        int vid;
        Vendor obj = new Vendor();
        vid = obj.getLastVID();
        vid++;
        txtVID.setText(vid + "");
    }
    private boolean addVendor(int vid, String name, String address, String c_person, String phone) {
        boolean status;
        Vendor obj = new Vendor();
        obj.setV_id(vid);
        obj.setV_name(name);
        obj.setV_address(address);
        obj.setV_contactP(c_person);
        obj.setV_phone(phone);

        status = obj.addVendor(obj);

        return status;
    }

    private void clearAll() {
        this.setVid();
        txtVenName.setText("");
        txtaVAddress.setText("");
        txtContactPreson.setText("");
        txtTelephone.setText("");
        btnSave.setText("Save");
        btnDelete.setVisible(false);
    }

    private void loadTable() {
        Vendor vendorobj = new Vendor();
        ArrayList<Vendor> vendorList = vendorobj.loadVendor();
        if (vendorList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Sorry ! No Vendor Found.");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblVendor.getModel();
            dtm.setRowCount(0);
            int count = 0;
            while (vendorList.size() > count) {
                Vector v = new Vector();
                Vendor vendor = new Vendor();
                vendor = vendorList.get(count);
                v.add(count + 1);
                v.add(vendor.getV_id());
                v.add(vendor.getV_name());
                v.add(vendor.getV_address());
                v.add(vendor.getV_contactP());
                v.add(vendor.getV_phone());

                dtm.addRow(v);
                count++;

            }
        }

    }

    private boolean updateVendor(int vid, String name, String address, String c_person, String phone) {
        boolean status;
        Vendor obj = new Vendor();
        obj.setV_id(vid);
        obj.setV_name(name);
        obj.setV_address(address);
        obj.setV_contactP(c_person);
        obj.setV_phone(phone);

        status = obj.updateVendor(obj);

        return status;
    }
    private void SearchVendor(String text) {
        Vendor vendorobj = new Vendor();
        ArrayList<Vendor> vendorList = vendorobj.searchVendor(text);
        if (vendorList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Sorry ! No Vendor Found.");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblVendor.getModel();
            dtm.setRowCount(0);
            int count = 0;
            while (vendorList.size() > count) {
                Vector v = new Vector();
                Vendor vendor = new Vendor();
                vendor = vendorList.get(count);
                v.add(count + 1);
               
                v.add(vendor.getV_id());
                v.add(vendor.getV_name());
                v.add(vendor.getV_address());
                v.add(vendor.getV_contactP());
                v.add(vendor.getV_phone());

                dtm.addRow(v);
                count++;

            }
        }

    }
    
    private boolean deleteVendor(int Vid)
    {
        Vendor obj = new Vendor();
        boolean stat = obj.deleteVendor(Vid);
        return stat;
    }
}