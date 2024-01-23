/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.Random;



/**
 *
 * @author rohan
 */
public class Parents {
    
    private String imgPath;
    private String firstName;
    private String lastName;
    private String bloodGroup;
    private int funds;
    private int remainingFunds;

    private String address;
    private String counsellor;
    private String lawyer;
    private int currentFunds;
    private String username;
    private BirthMother birthMother;
    private int parentId;
    private boolean isAvailable;
    private static int count = new Random().nextInt(100);
    private String emailID;
    private String password;
    private boolean worstCaseScenario;
    private boolean finChild;
    private boolean bigChanges;
    private boolean comSituation;
    private boolean currentChildrenOnBoard;
    private boolean eduRealities;
    private boolean promise;
    private boolean guilt;
    private String contactParent;

    public int getRemainingFunds() {
        return remainingFunds;
    }

    public void setRemainingFunds(int remainingFunds) {
        this.remainingFunds = remainingFunds;
    }
    
    public String getContactParent() {
        return contactParent;
    }

    public void setContactParent(String contactParent) {
        this.contactParent = contactParent;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public int getCurrentFunds() {
        return currentFunds;
    }

    public void setCurrentFunds(int currentFunds) {
        this.currentFunds = currentFunds;
    }

    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Parents(String username, String email, String password, boolean worstCaseScenerio, boolean finChild, boolean bigChanges, boolean comSituation, boolean currChildrenOnBoard, boolean eduRealities, boolean promises, boolean guilt) {
        parentId = count;
        count++;
        this.emailID = email;
        this.password = password;
        this.username = username;
        this.bigChanges = bigChanges;
        this.comSituation = comSituation;
        this.currentChildrenOnBoard = currChildrenOnBoard;
        this.eduRealities = eduRealities;
        this.finChild = finChild;
        this.guilt = guilt;
        this.promise = promises;
        this.worstCaseScenario = worstCaseScenerio;
        this.counsellor = new String();
        this.lawyer = new String();
        this.isAvailable = false;
    }

    public String getEmailID() {
        return emailID;
    }

    public String getLawyer() {
        return lawyer;
    }

    public void setLawyer(String lawyer) {
        this.lawyer = lawyer;
    }

    public String getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(String counsellor) {
        this.counsellor = counsellor;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public boolean isWorstCaseScenario() {
        return worstCaseScenario;
    }

    public void setWorstCaseScenario(boolean worstCaseScenario) {
        this.worstCaseScenario = worstCaseScenario;
    }

    public boolean isFinChild() {
        return finChild;
    }

    public void setFinChild(boolean finChild) {
        this.finChild = finChild;
    }

    public boolean isBigChanges() {
        return bigChanges;
    }

    public void setBigChanges(boolean bigChanges) {
        this.bigChanges = bigChanges;
    }

    public boolean isComSituation() {
        return comSituation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setComSituation(boolean comSituation) {
        this.comSituation = comSituation;
    }

    public boolean isCurrentChildrenOnBoard() {
        return currentChildrenOnBoard;
    }

    public void setCurrentChildrenOnBoard(boolean currentChildrenOnBoard) {
        this.currentChildrenOnBoard = currentChildrenOnBoard;
    }

    public boolean isEduRealities() {
        return eduRealities;
    }

    public void setEduRealities(boolean eduRealities) {
        this.eduRealities = eduRealities;
    }

    public boolean isPromise() {
        return promise;
    }

    public void setPromise(boolean promise) {
        this.promise = promise;
    }

    public boolean isGuilt() {
        return guilt;
    }

    public void setGuilt(boolean guilt) {
        this.guilt = guilt;
    }
    
    public Parents() {
        parentId = count;
        count++;
        this.emailID =new String();
        this.password = new String();
        this.username = new String();
        this.bigChanges = false;
        this.comSituation = false;
        this.currentChildrenOnBoard = false;
        this.eduRealities = false;
        this.finChild = false;
        this.guilt = false;
        this.promise = false;
        this.worstCaseScenario = false; 
        this.counsellor = new String();
        this.isAvailable = false;
        
    }

    public int getParentId() {
        return parentId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getUsername() {
        return username;
    }
    
    public void setAllValues(String username, String firstName, String LastName, String email, String blood, int funds, String address, String imgPath, String contact) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = LastName;
        this.emailID = email;
        this.bloodGroup = blood;
        this.funds = funds;
        this.address = address;
        this.imgPath = imgPath;
        this.contactParent = contact;
    }
    
    @Override
    public String toString() {
        return username;
    }

}
