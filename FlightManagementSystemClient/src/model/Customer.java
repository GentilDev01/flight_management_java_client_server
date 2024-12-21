/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


/**
 *
 * @author arthur.mugwaneza
 */

public class Customer implements Serializable{
   
    private String customer_id;
    private String fname;
    private String lname;
    private String gender;
    private String phoneNo;
    private String passsportNo;
    private String dob;
    private String nationality;
    private String email;

    public Customer() {
    }

    public Customer(String customer_id) {
        this.customer_id = customer_id;
    }

    
    public Customer(String customer_id, String fname, String lname, String gender, String phoneNo, String passsportNo, String dob, String nationality, String email) {
        this.customer_id = customer_id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.passsportNo = passsportNo;
        this.dob = dob;
        this.nationality = nationality;
        this.email = email;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPasssportNo() {
        return passsportNo;
    }

    public void setPasssportNo(String passsportNo) {
        this.passsportNo = passsportNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    
}
