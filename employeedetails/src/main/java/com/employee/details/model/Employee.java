package com.employee.details.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Email
    @NotBlank
    @Column(name = "email",nullable = false)
    private String email;
    
	@Column(name = "permanentaddress")
    private String permanentaddress;
    
    @Column(name = "correspondenceaddress")
    private String correspondenceaddress;
    
    public long getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPermanentaddress() {
		return permanentaddress;
	}
    
	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}
	
	public String getCorrespondenceaddress() {
		return correspondenceaddress;
	}
	
	public void setCorrespondenceaddress(String correspondenceaddress) {
		this.correspondenceaddress = correspondenceaddress;
	}
	
}