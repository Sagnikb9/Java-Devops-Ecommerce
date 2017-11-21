package com.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Supplier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int suppId;
	private String suppName;
	private String suppDesp;
	public int getSuppId() {
		return suppId;
	}
	public void setSuppId(int suppId) {
		this.suppId = suppId;
	}
	public String getSuppName() {
		return suppName;
	}
	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}
	public String getSuppDesp() {
		return suppDesp;
	}
	public void setSuppDesp(String suppDesp) {
		this.suppDesp = suppDesp;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/*@OneToMany(targetEntity=Product.class, fetch=FetchType.EAGER, mappedBy="supplier")
    private Set<Supplier>supplier=new HashSet<Supplier>(0);*/

	
		

}
