/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Register;

import Business.EcoSystem;
import Business.People.Orphanage;
import Business.People.OrphanageDirectory;
import Business.WorkQueue.OrphanageToCounsellor;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Validations.EmailTextFieldValidation;
import Business.Validations.PasswordsValidation;
import Business.Validations.StringsValidation;
import Business.Validations.UserNameValidation;
import javax.swing.InputVerifier;
import userinterface.Dialog.SuccessDialog;
import userinterface.MainJFrameFinal;

/**
 *
 * @author naved
 */
public class registerOrphanage extends javax.swing.JPanel {
      
    public OrphanageDirectory orphanageDirectory;
    public Orphanage orphanage;
    public OrphanageToCounsellor ocWorkQueue;
     JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form NewJPanel
     */
    public registerOrphanage(JPanel userProcessContainer, EcoSystem system) {

           initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.orphanage = new Orphanage(); 
      
       
    }
    
      private void addInputVerifiers() {
        InputVerifier stringValidation = new StringsValidation(); InputVerifier userNameValidation = new UserNameValidation();
        nameTxt.setInputVerifier(stringValidation);
        userNameTxt.setInputVerifier(stringValidation);
       // locationTxt.setInputVerifier(stringValidation);
        InputVerifier passwordValidation = new PasswordsValidation();
        InputVerifier emailValidation = new EmailTextFieldValidation();
        
        passwordTxt.setInputVerifier(passwordValidation);
        confirmPassTxt.setInputVerifier(passwordValidation);
        
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        confirmPassTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 26, 29));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(237, 245, 225));
        jLabel1.setText("Username*:");

        jLabel2.setForeground(new java.awt.Color(237, 245, 225));
        jLabel2.setText("Password*:");

        jLabel3.setForeground(new java.awt.Color(237, 245, 225));
        jLabel3.setText("Confirm Password*:");

        jLabel4.setForeground(new java.awt.Color(237, 245, 225));
        jLabel4.setText("Location*:");

        btnConfirm.setBackground(new java.awt.Color(252, 68, 69));
        btnConfirm.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(237, 245, 225));
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(237, 245, 225));
        jLabel6.setText("Name*:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(384, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        // TODO add your handling code here:
      
         try{
            String name = nameTxt.getText();

            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Name");
                throw new RuntimeException("Please enter the Name");
            }
            String username = userNameTxt.getText();
            if (username.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Username");
                throw new RuntimeException("Please enter the Username");
            }
            String emailId = locationTxt.getText();
            if (emailId.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Email Id");
                throw new RuntimeException("Please enter the Email Id");
            }
            String password = passwordTxt.getText();
            String confpassword = confirmPassTxt.getText();
            if (password.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the password");
                throw new RuntimeException("Please enter the password");
            }
            if (!password.equals(confpassword)){
                JOptionPane.showMessageDialog(null, "Confirm Password and Password should match");
                throw new RuntimeException("Confirm Password and Password should match");
            }
            orphanage.setName(name);
            orphanage.setUsername(username);
            orphanage.setPassword(password);
            orphanage.setLocation(locationTxt.getText());
            
            
             MainJFrameFinal.getOrphanageDirectory().addOrphanage(orphanage);
             
               SuccessDialog d = new SuccessDialog("Your Registration was successful! Please Logout!");
        d.setVisible(true);
         } catch(Exception e){
          JOptionPane.showMessageDialog(this, "Please enter valid data", "warning", JOptionPane.WARNING_MESSAGE);
          return;   
         }
        
        nameTxt.setText("");
        userNameTxt.setText("");
        locationTxt.setText("");
        passwordTxt.setText("");
        confirmPassTxt.setText("");
      

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JTextField confirmPassTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
