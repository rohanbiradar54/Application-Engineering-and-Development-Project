/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdministrativeRole;

import Business.BankAccount.LoanAccount;
import Business.EmailGeneration.EmailGenerator;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FinancialEnterprise;
import Business.Network.Networking;
import Business.Organization.BankerOrganization;
import Business.Organization.Organization;
import Business.People.BirthMother;
import Business.Role.BirthMotherRole;
import Business.UserAccount.UserAcc;
import Business.WorkQueue.BirthMotherCounselor;
import Business.Role.Role;
import Business.Validations.PasswordsValidation;
import Business.Validations.StringsValidation;
import Business.WorkQueue.CounsellorsToAdmin;
import Business.WorkQueue.HospitalToBank;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Dialog.SuccessDialog;

/**
 *
 * @author nishita
 */
public class BirthMotherAcceptWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAcc account;
    private Enterprise enterprise;
    private BirthMother birthMother;
    private Networking network;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public BirthMotherAcceptWorkAreaJPanel(JPanel userProcessContainer, Networking network, UserAcc account, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.network = network;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
        populateComboBox();
    }
    
    public void populateComboBox(){
        for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseDir()){
            if(e.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.FinancialEnterprise.getValue())){
                 bankComboBox.addItem(e);
                }
        }
    
    }
      
    
    public void populateRequestTable(){
        txtPassword.setText("");
        txtUserName.setText("");
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);

        for (CounsellorsToAdmin request : enterprise.getWorkQueue().getCounselorAdmin()){
            if(!(request.getBirthMother().getUsername().equals(""))){
            
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender();
                if (request.getReceiver()== null)
                        row[2] = "";
                else
                    row[2] = request.getReceiver();
                if (request.getStatus() == null)
                        row[3] = "";
                else
                        row[3] = request.getStatus();
                String result = request.getReqResult();
                row[4] = result == null ? "Waiting" : result;

                model.addRow(row);
            }
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        valueLabel1 = new javax.swing.JLabel();
        valueLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bankComboBox = new javax.swing.JComboBox();
        messageTxt = new javax.swing.JTextField();
        valueLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 26, 29));
        setForeground(new java.awt.Color(237, 245, 225));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Approved by", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        btnCreate.setBackground(new java.awt.Color(252, 68, 69));
        btnCreate.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnCreate.setText("CREATE");
        btnCreate.setEnabled(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        refreshTestJButton.setBackground(new java.awt.Color(252, 68, 69));
        refreshTestJButton.setForeground(new java.awt.Color(237, 245, 225));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(237, 245, 225));
        enterpriseLabel.setText("ENTERPRISE:");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(237, 245, 225));
        valueLabel.setText("<value>");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(252, 68, 69));
        btnView.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        valueLabel1.setForeground(new java.awt.Color(237, 245, 225));
        valueLabel1.setText("Username:");

        valueLabel2.setForeground(new java.awt.Color(237, 245, 225));
        valueLabel2.setText("Password");

        jLabel1.setForeground(new java.awt.Color(237, 245, 225));
        jLabel1.setText("Bank Enterprise:");

        bankComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankComboBoxActionPerformed(evt);
            }
        });

        messageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTxtActionPerformed(evt);
            }
        });

        valueLabel3.setForeground(new java.awt.Color(237, 245, 225));
        valueLabel3.setText("Message for Bank Manager:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(valueLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(messageTxt)
                                .addComponent(bankComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(328, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refreshTestJButton)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bankComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        FinancialEnterprise f = (FinancialEnterprise)bankComboBox.getSelectedItem();
        if (f.equals("")){
            JOptionPane.showMessageDialog(null, "Please select a finance enterprise to move further else add a financial enterprise");
            return;
        }
        if (txtUserName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select a row from the table or enter the Username");
            return;
        }
        if(messageTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter message for Admin review");
            return;
        }
        
        CounsellorsToAdmin request = (CounsellorsToAdmin)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Completed")){
            JOptionPane.showMessageDialog(null, "User already exists!");
        }
        else{

        for (Organization org : enterprise.getOrganizationalDirectory().getOrganizationList()){
            if(org.getName().equals("BirthMother Organization")){
                if (org.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())){
                    request.setStatus("Completed");
                    request.setReqResult("User Account Created");
                    request.setReceiver(account);
                    birthMother = request.getBirthMother();
                    Role role = new BirthMotherRole();
                    org.getBirthMotherDirectory().addBirthMother(birthMother);
                    org.getUserAccountDirectory().createUserAccountMother(birthMother.getFirstName(), txtUserName.getText(),txtPassword.getText() , birthMother, role, account.getNetwork() );
                        
                    HospitalToBank h = new HospitalToBank(messageTxt.getText(), birthMother);
                    f.getWorkQueue().getHospitalAdminBank().add(h);

                    
                    SuccessDialog d = new SuccessDialog("Birth Mother account created successfully.");
                    d.setVisible(true);

                     String message =  " <h1>Request Approved</h1> <body>  Your Request is successful approved <br> Your userid is:"
                            + request.getBirthMother().getUsername() + "</br> <br> Your Password is:  "+ request.getBirthMother().getPassword() + "</br>"+"<br>Your Patient ID is " + request.getBirthMother().getId()
                            + "</br> <br> Please update your profile details by logging into our Application ! </br> </body> <h2> Thank you! </h2>";

                    EmailGenerator em = new EmailGenerator(request.getBirthMother().getEmailID(), message , "Request Approved" );
                    em.sendEmail();
                    
                    populateRequestTable();
                    break;
                                     
                }
                else{
                    JOptionPane.showMessageDialog(this, "Username already exists. Please select another username!");
                    }
                
        } 
        }
     
        txtUserName.setText("");
        txtPassword.setText("");
        messageTxt.setText("");
        }   

       
    }//GEN-LAST:event_btnCreateActionPerformed
    
    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table");
            return;
        }
        
        CounsellorsToAdmin request = (CounsellorsToAdmin)workRequestJTable.getValueAt(selectedRow, 0);
        
        txtUserName.setText(request.getBirthMother().getUsername());
        txtPassword.setText(request.getBirthMother().getPassword());

        btnCreate.setEnabled(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void bankComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankComboBoxActionPerformed

    private void messageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bankComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JLabel valueLabel2;
    private javax.swing.JLabel valueLabel3;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
