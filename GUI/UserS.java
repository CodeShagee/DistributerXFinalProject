/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Domain.User;
import Domain.UserLevel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shiyanrox
 */
public class UserS extends javax.swing.JFrame {

    /**
     * Creates new form UserS
     */
    public UserS() {
        initComponents();
        btnDelete.setVisible(false);
        setPid();
        this.loadTable();
        loadComboLevel();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        ddlAuthlevel = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DistributerX: User");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("User"));

        jLabel1.setText("UserID");

        jLabel2.setText("Name");

        jLabel3.setText("Email");

        jLabel4.setText("UserName");

        jLabel5.setText("Password");

        jLabel6.setText("Authority  Level");

        txtUID.setEditable(false);

        ddlAuthlevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(ddlAuthlevel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtEmail)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(txtUsername)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ddlAuthlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "UID", "Name", "Email", "UserName", "Password", "Authority Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblUserMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblUser);
        if (tblUser.getColumnModel().getColumnCount() > 0) {
            tblUser.getColumnModel().getColumn(0).setMaxWidth(35);
            tblUser.getColumnModel().getColumn(1).setMaxWidth(40);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtUID.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(rootPane, "User ID and Name cannot be empty!", "Error", JOptionPane.ERROR);
        } else {
        int comp= JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete this record?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(comp==0){
            boolean stat =this.deleteUser(Integer.parseInt(txtUID.getText()));
            if (stat){
                JOptionPane.showMessageDialog(rootPane, "User Delete Successfully", "Oparation Complete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error in User Deleting", "Oparation Incomplete", JOptionPane.ERROR);
            }
            this.loadTable();
        }
        else{
        }}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearAll();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtUID.getText().isEmpty() | txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "User ID and Name cannot be empty!", "Error", JOptionPane.ERROR);
        } else {
            if (txtUsername.getText().isEmpty() | txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Username and Password cannot be empty!", "Error", JOptionPane.ERROR);
        } else {
        if (btnSave.getText() == "Save") {
//            

            boolean stat = this.addUser(Integer.parseInt(txtUID.getText()), txtName.getText(),txtEmail.getText(), txtUsername.getText(),txtPassword.getText(),ddlAuthlevel.getSelectedItem().toString());
            if (stat) {
                JOptionPane.showMessageDialog(rootPane, "User Added Successfully", "Oparation Complete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error in User Adding", "Oparation Incomplete", JOptionPane.ERROR);
            }
            this.loadTable();
            this.clearAll();
        } else {
            boolean stat = this.updateUser(Integer.parseInt(txtUID.getText()), txtName.getText(),txtEmail.getText(), txtUsername.getText(),txtPassword.getText(),ddlAuthlevel.getSelectedItem().toString());
            if (stat) {
                JOptionPane.showMessageDialog(rootPane, "User Added Successfully", "Oparation Complete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error in User Adding", "Oparation Incomplete", JOptionPane.ERROR);
            }
            this.loadTable();
            this.clearAll();
        }}}
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseReleased
       int id = Integer.parseInt(tblUser.getModel().getValueAt(tblUser.getSelectedRow(), 1).toString());
        
       
        
        
            User obj = new User();
            User venObj = obj.viewAUser(id);
            txtUID.setText(venObj.getUID()+ "");
            txtName.setText(venObj.getName());
            txtEmail.setText(venObj.getEmail());
            txtUsername.setText(venObj.getUsername());
            txtPassword.setText(venObj.getPassword());
            ddlAuthlevel.setSelectedItem(venObj.getLevel());

            btnSave.setText("Update");
            btnDelete.setVisible(true);
    }//GEN-LAST:event_tblUserMouseReleased

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
            java.util.logging.Logger.getLogger(UserS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox ddlAuthlevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
private void loadComboLevel() {
UserLevel UserLevelobj = new UserLevel();
        ArrayList<UserLevel> UserLevelobjList = UserLevelobj.loadUserLevel();
        if (UserLevelobjList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Sorry ! No Vendors Found.");
        } else {
        Vector v = new Vector();
        UserLevel Vendorss = new UserLevel();
        int count=0;
        while(UserLevelobjList.size()>count){
           // hiddenValue hv= new hiddenValue();
            Vendorss = UserLevelobjList.get(count);
               
               // hv.setVisibleField(Categoryss.getCatName());
               // hv.setHiddenField(Categoryss.getCatID());
                
                v.add(Vendorss.getLvlName());
                
                count++;
        }
        ddlAuthlevel.setModel(new DefaultComboBoxModel(v));
            
        }
    }
private void setPid() {

        int bid;
        User obj = new User();
        bid = obj.getLastID();
        bid++;
        txtUID.setText(bid + "");
    }

    private boolean addUser(int id, String Name, String email,String uName,String pWord,String authLvl) {
        boolean status;
        User obj = new User();
        obj.setUID(id);
        obj.setName(Name);
        obj.setEmail(email);
        obj.setUsername(uName);
        obj.setPassword(pWord);
        obj.setLevel(authLvl);

        status = obj.addUser(obj);

        return status;
    }

    private void clearAll() {
        this.setPid();
        txtName.setText("");
        txtEmail.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        this.loadComboLevel();
        this.loadTable();

        btnSave.setText("Save");
        btnDelete.setVisible(false);
    }

    private void loadTable() {
        User Usersobj = new User();
        
        ArrayList<User> UsersList = Usersobj.loadUser();
        if (UsersList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Sorry ! No User Found.");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblUser.getModel();
            dtm.setRowCount(0);
            int count = 0;
            while (UsersList.size() > count) {
                Vector v = new Vector();
                User Userss = new User();
                Userss = UsersList.get(count);
                v.add(count + 1);
                v.add(Userss.getUID());
                v.add(Userss.getName());
                v.add(Userss.getEmail());
                v.add(Userss.getUsername());
                v.add(Userss.getPassword());
                v.add(Userss.getLevel());
                

                dtm.addRow(v);
                count++;

            }
        }

    }

    private boolean updateUser(int id, String Name, String email,String uName,String pWord,String authLvl) {

        boolean status;
        User obj = new User();
        obj.setUID(id);
        obj.setName(Name);
        obj.setEmail(email);
        obj.setUsername(uName);
        obj.setPassword(pWord);
        obj.setLevel(authLvl);

        status = obj.updateUser(obj);

        return status;
    }

    private void SearchUsers(String text) {
        User vendorobj = new User();
        ArrayList<User> UsersList = vendorobj.searchUser(text);
        if (UsersList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Sorry ! No Users Found.");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblUser.getModel();
            dtm.setRowCount(0);
            int count = 0;
            while (UsersList.size() > count) {
                Vector v = new Vector();
                User Userss = new User();
                Userss = UsersList.get(count);
                v.add(count + 1);
                v.add(Userss.getUID());
                v.add(Userss.getName());
                v.add(Userss.getEmail());
                v.add(Userss.getUsername());
                v.add(Userss.getPassword());
                v.add(Userss.getLevel());

                dtm.addRow(v);
                count++;

            }
        }

    }
    private boolean deleteUser(int id)
    {
        User obj = new User();
        boolean stat = obj.deleteUser(id);
        return stat;
    }
}
