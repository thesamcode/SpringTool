package com.thesamecode.saveTravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expenses")
public class Expense {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @NotNull (message="Must not be blank")
    @Size(min = 1, max = 40, message="Must be between 1 and 40 characters")
    private String name;
    
    @NotNull (message="Must not be blank")
    @Size(min = 1, max = 40, message="Must be between 1 and 40 characters")
    private String vendor;
        
    @NotNull (message="Must not be blank")
    @Min(value=0, message="Must be greater than 0")
    private Double amount;
    
    @NotNull (message="Must not be blank")
    @Size(min = 1, max = 40, message="Must be between 1 and 200 characters")
    private String description;
    
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    public Expense() {
	}
    
	public Expense(String name, String vendor, Double amount, String description) {
		this.name = name;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	@PrePersist
    protected void onCreate() {
    	this.createdAt = new Date();
    }
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
}
