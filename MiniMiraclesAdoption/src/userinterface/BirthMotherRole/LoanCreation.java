/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BirthMotherRole;

import Business.BankAccount.LoanAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Networking;
import Business.People.BirthMother;
import Business.UserAccount.UserAcc;
import Business.WorkQueue.BirthMotherLoan;
import java.awt.CardLayout;
import java.io.File;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import userinterface.Dialog.SuccessDialog;

/**
 *
 * @author naved
 */
public class LoanCreation extends javax.swing.JPanel {

    private UserAcc userAccount;
    private JPanel userProcessContainer;
    private EcoSystem system;
    private BirthMother BirthMother;
    private String firstName;
    private String lastName;
    private String emailId;
    private int funds;
    private String address;
    private String passportNumber;
    private String username;
    private String docPath;
    private Enterprise enterprise;
    
    public LoanCreation(UserAcc userAccount, JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userAccount = userAccount;
        this.BirthMother = userAccount.getBirthmother();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        txtFirstName.setText(BirthMother.getFirstName());
        txtLastName.setText(BirthMother.getLastName());
        txtAddress.setText(BirthMother.getAddress());
        txtEmail.setText(BirthMother.getEmailID());
        
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
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFunds = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtPassport = new javax.swing.JTextField();
        txtDocument = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 26, 29));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 245, 225));
        jLabel1.setText("LOAN DETAILS");

        jLabel3.setForeground(new java.awt.Color(237, 245, 225));
        jLabel3.setText("FIRST NAME:");

        jLabel4.setForeground(new java.awt.Color(237, 245, 225));
        jLabel4.setText("LAST NAME:");

        jLabel5.setForeground(new java.awt.Color(237, 245, 225));
        jLabel5.setText("EMAIL ID:");

        jLabel11.setForeground(new java.awt.Color(237, 245, 225));
        jLabel11.setText("FUNDS REQUESTED:");

        txtFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundsActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(237, 245, 225));
        jLabel12.setText("ADDRESS:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(237, 245, 225));
        jLabel17.setText("UPLOAD DOCUMENT:");

        btnBrowse.setBackground(new java.awt.Color(252, 68, 69));
        btnBrowse.setForeground(new java.awt.Color(237, 245, 225));
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(252, 68, 69));
        btnCreate.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(237, 245, 225));
        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(237, 245, 225));
        jLabel13.setText("PASSPORT NO.:");

        txtPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassportActionPerformed(evt);
            }
        });

        txtDocument.setForeground(new java.awt.Color(237, 245, 225));
        txtDocument.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jLabel11))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFunds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(0, 110, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel17)
                        .addGap(60, 60, 60)
                        .addComponent(btnBrowse))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(txtDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(btnBrowse))
                .addGap(35, 35, 35)
                .addComponent(txtDocument)
                .addGap(43, 43, 43)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundsActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed

        JFileChooser file = new JFileChooser();
          file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter extensionfilter =  new FileNameExtensionFilter("*.Images", "jpg","png");
        file.addChoosableFileFilter(extensionfilter);
        int result = file.showSaveDialog(null);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            this.docPath = path;
            txtDocument.setText(path);
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No File Select");
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        this.firstName = txtFirstName.getText();
        this.lastName = txtLastName.getText();
        this.emailId = txtEmail.getText();
        this.funds = Integer.parseInt(txtFunds.getText());
        if(funds > this.BirthMother.getNetFunding()){
            
            JOptionPane.showMessageDialog(null, "Amount need to less or equal to net funding. Net funding :" + BirthMother.getNetFunding());
            return;
        }
        this.address = txtAddress.getText();
        
        this.passportNumber = txtPassport.getText();
        
        if(passportNumber.equals("")){
              JOptionPane.showMessageDialog(null, "Please enter passport number");
            return;
        
        }
        
         try {
                    if(docPath.equals("")|| docPath == null){
           
          JOptionPane.showMessageDialog(this, "Please upload a Document", "warning", JOptionPane.WARNING_MESSAGE);
          return;     
                
           }
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Please upload a Document", "warning", JOptionPane.WARNING_MESSAGE);
          return;   
            }
        
        

                
        LoanAccount loan = new LoanAccount();
        for(Networking network: system.getNetworkList()){
            if(network.getName().equals(userAccount.getNetwork()))
            {
                for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseDir()){
                    if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.FinancialEnterprise))
                    {
                        for(LoanAccount l : e.getLoanDirectory().getLoanAccountList())
                            if(l.getFirstName().equals(userAccount.getName()))
                            { this.enterprise = e;
                                l.addValues(emailId, funds, address, passportNumber, docPath);
                                
                                loan = l ;
                            }
                        
                    }
                }
            }
        }
        
        //Initiated LoanAccount amount Requested
        BirthMother.setLoanRequestAmount(funds);
        loan.setHospital(userAccount.getBirthmother().getHospital());
        BirthMotherLoan motherLoan = new BirthMotherLoan("Create new Loan", loan, userAccount.getBirthmother());
        motherLoan.setStatus("Pending");
        motherLoan.setSender(userAccount);
        motherLoan.setRequestDate(new Date());
        BirthMother.setTypeL(1);
        
        enterprise.getWorkQueue().getBirthMotherLoan().add(motherLoan);
       
        SuccessDialog d = new SuccessDialog("Successfully initiate Loan Process");
        d.setVisible(true);       
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtPassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JLabel txtDocument;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFunds;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassport;
    // End of variables declaration//GEN-END:variables
}
