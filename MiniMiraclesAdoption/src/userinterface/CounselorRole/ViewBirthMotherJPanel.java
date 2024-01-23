/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CounselorRole;

import Business.Enterprise.Enterprise;
import Business.People.BirthMother;
import Business.People.BirthMotherDirectory;
import Business.UserAccount.UserAcc;
import Business.WorkQueue.BirthMotherCounselor;
import Business.WorkQueue.CounsellorsToAdmin;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author naved
 */
public class ViewBirthMotherJPanel extends javax.swing.JPanel {
    public BirthMotherDirectory birthMotherDirectory;
    public BirthMother birthMother;
    public BirthMotherCounselor bmWorkQueue;
    private Enterprise enterprise;
    private UserAcc account;
    private BirthMotherCounselor request;
    

    /**
     * Creates new form registerMother
     */
    JPanel userProcessContainer;
    

    public ViewBirthMotherJPanel(JPanel userProcessContainer, BirthMotherCounselor bmc, UserAcc account, Enterprise enterprise) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = bmc;
        this.account = account;
        this.enterprise = enterprise;
        populateComponents();

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
        jLabel4 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        patientID = new javax.swing.JLabel();
        patientIDTxt = new javax.swing.JTextField();
        patientID1 = new javax.swing.JLabel();
        messageTxt = new javax.swing.JTextField();
        patientID2 = new javax.swing.JLabel();
        txtFundsRequired = new javax.swing.JTextField();

        setBackground(new java.awt.Color(26, 26, 29));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(237, 245, 225));
        jLabel1.setText("Username:");

        jLabel4.setForeground(new java.awt.Color(237, 245, 225));
        jLabel4.setText("Email:");

        btnApprove.setBackground(new java.awt.Color(252, 68, 69));
        btnApprove.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(237, 245, 225));
        btnApprove.setText("ACCEPT");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(252, 68, 69));
        btnReject.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnReject.setForeground(new java.awt.Color(237, 245, 225));
        btnReject.setText("REJECT");
        btnReject.setBorder(null);
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        patientID.setForeground(new java.awt.Color(237, 245, 225));
        patientID.setText("Patient ID");

        patientIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDTxtActionPerformed(evt);
            }
        });

        patientID1.setForeground(new java.awt.Color(237, 245, 225));
        patientID1.setText("Message:");

        messageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTxtActionPerformed(evt);
            }
        });

        patientID2.setForeground(new java.awt.Color(237, 245, 225));
        patientID2.setText("Total Funds:");

        txtFundsRequired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundsRequiredActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(patientID2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFundsRequired))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(patientID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(patientIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBack)
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(patientID1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientID)
                    .addComponent(patientIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientID1)
                    .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientID2)
                    .addComponent(txtFundsRequired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        request.setReceiver(account);
        request.setResolveDate(new Date());
        request.setRequestResult("Completed by Counselor" + account.getCounselor().getEmpName());
     
        String msg = messageTxt.getText();
        if(msg.equals("")){
              JOptionPane.showMessageDialog(null, "Please input your message for the patient ");
              throw new NullPointerException("Enter message");
        }

        request.setStatus("Completed");
        int totalfund;
        try{
        totalfund = Integer.parseInt(txtFundsRequired.getText());
        if(totalfund == 0){
              JOptionPane.showMessageDialog(null, "Please input the total fund required by the patient ");
              throw new NullPointerException("Enter funds");
        }
        }
        catch( NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Please input the total fund required by the patient in number format");
              throw new NullPointerException("Enter funds");
        }
        
        request.setCounsellorFeedback(msg);
        request.setMessage(msg);
        request.getBirthMother().setRequiredFund(totalfund);

        
        CounsellorsToAdmin counselorReq = new CounsellorsToAdmin(messageTxt.getText(), request.getBirthMother());
        
        counselorReq.setStatus("Processing");
        counselorReq.setSender(account);
        
        enterprise.getWorkQueue().getCounselorAdmin().add(counselorReq);
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BirthMotherRequestWorkAreaJPanel birthMotherRequestWorkAreaJPanel = (BirthMotherRequestWorkAreaJPanel) component;
        birthMotherRequestWorkAreaJPanel.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 

        
    }//GEN-LAST:event_btnApproveActionPerformed
   
    private void populateComponents() {
        //hospitalJComboBox.removeAllItems();
        String msg = new String();
        userNameTxt.setText(request.getBirthMother().getUsername());
        emailTxt.setText(request.getBirthMother().getEmailID());
        patientIDTxt.setText(String.valueOf(request.getBirthMother().getId()));
       
  
    }
    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        request.setReceiver(account);
        request.setResolveDate(new Date());
        request.setRequestResult("Rejected by " + account.getCounselor().getEmpName());
        
     
        String msg = messageTxt.getText();
        if(msg.equals("")){
              JOptionPane.showMessageDialog(null, "Please input your message for the patient ");
              throw new NullPointerException("Enter message");
        }
        request.setStatus("Rejected");
        request.setCounsellorFeedback(msg);
        request.setMessage(msg);
        request.setSender(account);
        
       userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BirthMotherRequestWorkAreaJPanel birthMotherRequestWorkAreaJPanel = (BirthMotherRequestWorkAreaJPanel) component;
        birthMotherRequestWorkAreaJPanel.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }//GEN-LAST:event_btnRejectActionPerformed

    private void patientIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDTxtActionPerformed

    private void messageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTxtActionPerformed

    private void txtFundsRequiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundsRequiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundsRequiredActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JLabel patientID;
    private javax.swing.JLabel patientID1;
    private javax.swing.JLabel patientID2;
    private javax.swing.JTextField patientIDTxt;
    private javax.swing.JTextField txtFundsRequired;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
