/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.People.BirthMother;
import Business.People.Parents;

/**
 *
 * @author rohan
 */
public class CounsellorsToAdmin extends WorkRequests{
    
     private String reqResult;
     private Parents parent;
     private BirthMother birthMother;
     
     public CounsellorsToAdmin(String message, Parents parent) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.reqResult = new String();
        this.parent = parent;   
        this.birthMother = new BirthMother();
    }
    
    public CounsellorsToAdmin(String message, BirthMother BM) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.reqResult = new String();
        this.birthMother = BM;   
        this.parent = new Parents();
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }


    public Parents getParent() {
        return parent;
    }

    public void setParent(Parents parent) {
        this.parent = parent;
    }

    public CounsellorsToAdmin(String requestResult) {
        this.reqResult = requestResult;
    }

    public String getReqResult() {
        return reqResult;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }
     
    @Override
    public String toString() {
        return super.getMessage();
    } 
    
}
