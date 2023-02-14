/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balance;

import javax.swing.JTable;

/**
 *
 * @author Hemmat
 */
public class UserLists extends javax.swing.JFrame {

    
    String id; 
    String auth ;
    String name;
    String username;
    //they are for update a row
    
    
    int current_user_auth=1;
    
    public UserLists() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btng_update_auth = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        tf_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_name = new javax.swing.JTextField();
        tf_username = new javax.swing.JTextField();
        rbtn_admin = new javax.swing.JRadioButton();
        rbtn_user = new javax.swing.JRadioButton();
        rbtn_editor = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Full Name", "UserName", "Auth"
            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_update.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        tf_search.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tf_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_searchMouseClicked(evt);
            }
        });
        tf_search.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tf_searchInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Search:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Users List");

        tf_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

        tf_username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btng_update_auth.add(rbtn_admin);
        rbtn_admin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtn_admin.setText("Admin");

        btng_update_auth.add(rbtn_user);
        rbtn_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtn_user.setText("User");

        btng_update_auth.add(rbtn_editor);
        rbtn_editor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtn_editor.setText("Editor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Update User");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Full-Name:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("UserName:");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Set");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtn_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(rbtn_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(rbtn_user, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(169, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_admin)
                    .addComponent(rbtn_user)
                    .addComponent(rbtn_editor))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(276, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGap(41, 41, 41)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_update)
                            .addComponent(btn_delete)
                            .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
      
    }//GEN-LAST:event_jTable1FocusGained

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
      
            if(current_user_auth==4){
                btn_delete.setEnabled(true);
           }
            
        else{
            btn_delete.setEnabled(false);
        }
        
        Helper.center(this);
       this.setSize(jTable1.getSize().width+40, 450);
        jPanel1.setVisible(false);
    
        DBConnect c = new DBConnect();
        String query ="SELECT id, name, username, auth FROM users";
   
       Object[][]  userData = c.select_table(query);
       String column []= {"id", "Name", "UserName", "Auth"}; 
       jTable1 = new JTable(userData, column);
    
       jScrollPane1.setViewportView(jTable1);
     

    }//GEN-LAST:event_formWindowOpened

    private void tf_searchInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tf_searchInputMethodTextChanged

        Helper.showNotification(tf_search.getText());
    }//GEN-LAST:event_tf_searchInputMethodTextChanged

    private void tf_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_searchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_searchMouseClicked

    private void tf_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyPressed

     
    }//GEN-LAST:event_tf_searchKeyPressed

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
       DBConnect c = new DBConnect();
        String query ="SELECT id, name, username, auth FROM users WHERE name LIKE '"+tf_search.getText()+"%' OR username LIKE '"+tf_search.getText()+"%' OR auth LIKE '"+tf_search.getText()+"%'";
   
       Object[][]  userData = c.select_table(query);
       String column []= {"id", "Name", "UserName", "Auth"}; 
       jTable1 = new JTable(userData, column);
    
       jScrollPane1.setViewportView(jTable1);
    }//GEN-LAST:event_tf_searchKeyReleased

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        
        
        this.setSize(jTable1.getSize().width+400, 450);
        jPanel1.setVisible(true);
       id  =  jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
       name  =  jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
       username  =  jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
       auth  =  jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
       
       tf_name.setText(name);
       tf_username.setText(username);
       if(Integer.parseInt(auth)==4){
            btng_update_auth.setSelected(rbtn_admin.getModel(), rootPaneCheckingEnabled);
       }else if(Integer.parseInt(auth)==2){
     btng_update_auth.setSelected(rbtn_editor.getModel(), rootPaneCheckingEnabled);
       }else{
            btng_update_auth.setSelected(rbtn_user.getModel(), rootPaneCheckingEnabled);
       
       }
       
        if(current_user_auth< 4){
            rbtn_admin.setEnabled(false);
            rbtn_editor.setEnabled(false);
            rbtn_user.setEnabled(false);
            if(Integer.parseInt(auth) > current_user_auth){
                tf_username.setEnabled(false);
                tf_name.setEnabled(false);
            }else{
                 tf_username.setEnabled(true);
                tf_name.setEnabled(true);
            }
        }
      
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.setSize(jTable1.getSize().width+40, 450);
        jPanel1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        int auth =1;
        
        if(btng_update_auth.isSelected(rbtn_admin.getModel())){
            auth = 4;
        }else if(btng_update_auth.isSelected(rbtn_editor.getModel())){
            auth =2;
        }else{
            auth =1;
        }
        
       
        String query = "UPDATE users SET username='"+tf_username.getText()+"', name='"+tf_name.getText()+"', auth= "+auth+" WHERE id = "+ Integer.parseInt(id);
        
        DBConnect c = new DBConnect();
       boolean res =  c.excute(query);
       if(res){
         
        String query1 ="SELECT id, name, username, auth FROM users";
   
       Object[][]  userData = c.select_table(query1);
       String column []= {"id", "Name", "UserName", "Auth"}; 
       jTable1 = new JTable(userData, column);
    
       jScrollPane1.setViewportView(jTable1);
           Helper.showNotification("You have successfully update it");
       }else{
           Helper.showNotification("You can not update the data");
       }
       this.setSize(jTable1.getSize().width+40, 450);
        jPanel1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
          name  =  jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        javax.swing.JOptionPane.showConfirmDialog(this, "Do you want to delete "+name);
        
        
        id  =  jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
      
        String myDeleteQuery = "DELETE FROM users WHERE id = "+Integer.parseInt(id);
        DBConnect c =new DBConnect();
        boolean deleted = c.excute(myDeleteQuery);
        if(deleted){
         
        String query1 ="SELECT id, name, username, auth FROM users";
   
       Object[][]  userData = c.select_table(query1);
       String column []= {"id", "Name", "UserName", "Auth"}; 
       jTable1 = new JTable(userData, column);
    
       jScrollPane1.setViewportView(jTable1);
        Helper.showNotification("You have successfully delete the user");
       }else{
           Helper.showNotification("You can not delete the user");
       }
        
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(UserLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLists().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup btng_update_auth;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbtn_admin;
    private javax.swing.JRadioButton rbtn_editor;
    private javax.swing.JRadioButton rbtn_user;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_search;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
