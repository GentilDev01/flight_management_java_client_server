package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author arthur.mugwaneza
 */
@Entity
public class Employee implements Serializable{
    @Id
    private String emp_id;
    private String fname;
    private String lname;
    private String gender;
    private String phoneNo;
    private String username;
    private String password;
    private String role;

    public Employee() {
    }

    public Employee(String emp_id) {
        this.emp_id = emp_id;
    }

    public Employee(String emp_id, String fname, String lname, String gender, String phoneNo, String username, String password, String role) {
        this.emp_id = emp_id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}
