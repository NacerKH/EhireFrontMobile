/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class BaseEntity {
    
    // <editor-fold defaultstate="collapsed" desc="Attributes + Getters & Setters">

    // <editor-fold defaultstate="collapsed" desc="Id">
    int Id; 
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="CreatedDate">
    Date CreatedDate; 
     public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date CreatedDate) {
        this.CreatedDate = CreatedDate;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="UpdatedDate">
     Date UpdatedDate; 
     public Date getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(Date UpdatedDate) {
        this.UpdatedDate = UpdatedDate;
    }
    // </editor-fold>

    
    // </editor-fold>
   
    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public BaseEntity() {
        
    }
    public BaseEntity(int Id, Date CreatedDate, Date UpdatedDate) {
        this.Id = Id;
        this.CreatedDate = CreatedDate;
        this.UpdatedDate = UpdatedDate;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Methods">
    
    // <editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        return "BaseEntity{" + "Id=" + Id + ", CreatedDate=" + CreatedDate + ", UpdatedDate=" + UpdatedDate + '}';
    }
    // </editor-fold>
    
    // </editor-fold>
}
