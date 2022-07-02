/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Enums.UserType;
import java.util.Date;
 
public class User extends BaseEntity
{
    // <editor-fold defaultstate="collapsed" desc="Attributes + Getters & Setters">
    
    // <editor-fold defaultstate="collapsed" desc="UserName">
    String UserName;  
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Password">
    String Password; 
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Email">
    String Email; 
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="UserType">
    UserType UserType; 
    public UserType getUserType() {
        return UserType;
    }

    public void setUserType(UserType UserType) {
        this.UserType = UserType;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="ProfilePicture">
    String ProfilePicture;
     public String getProfilePicture() {
        return ProfilePicture;
    }

    public void setProfilePicture(String ProfilePicture) {
        this.ProfilePicture = ProfilePicture;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Birthday">
    Date Birthday;
    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="JobTitle">
    String JobTitle; 
    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }
    // </editor-fold>
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructors">
    
    // For Post User
    public User(String UserName, String Password, String Email, UserType UserType, String ProfilePicture, Date Birthday, String JobTitle) {
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
        this.UserType = UserType;
        this.ProfilePicture = ProfilePicture;
        this.Birthday = Birthday;
        this.JobTitle = JobTitle;
    }

    // For Get User
    public User(String UserName, String Password, String Email, UserType UserType, String ProfilePicture, Date Birthday, String JobTitle, int Id, Date CreatedDate, Date UpdatedDate) {
        super(Id, CreatedDate, UpdatedDate);
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
        this.UserType = UserType;
        this.ProfilePicture = ProfilePicture;
        this.Birthday = Birthday;
        this.JobTitle = JobTitle;
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Methods">
    
    // <editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        return "User{" +"Id="+ Id + ", UserName=" + UserName + ", Password=" + Password + ", Email=" + Email + ", UserType=" + UserType + ", ProfilePicture=" + ProfilePicture + ", Birthday=" + Birthday + ", JobTitle=" + JobTitle+ ", CreatedDate=" + CreatedDate + ", UpdatedDate=" + UpdatedDate + '}';
    }
    // </editor-fold>
    
    // </editor-fold>
}


