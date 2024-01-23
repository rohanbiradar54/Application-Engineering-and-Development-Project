/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAcc;
import userinterface.HospitalAdministrativeRole.HospitalAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nihil
 */
public class HospitalsAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalAdminWorkAreaJPanel(userProcessContainer, business,enterprise, account);
    }

    
    
}
