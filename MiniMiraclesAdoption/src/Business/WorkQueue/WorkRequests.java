/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAcc;
import java.util.Date;

/**
 *
 * @author rohan
 */
public abstract class WorkRequests {

    private String message;
    private UserAcc sender;
    private UserAcc receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;   
   
    
    public WorkRequests(){
        requestDate = new Date();
        this.message = new String();
        sender =  new UserAcc();
        receiver = new UserAcc();
        resolveDate = null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAcc getSender() {
        return sender;
    }

    public void setSender(UserAcc sender) {
        this.sender = sender;
    }

    public UserAcc getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAcc receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    @Override
    public String toString() {
        return message;
    }
    
}
