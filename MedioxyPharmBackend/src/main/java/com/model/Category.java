package com.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Category implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int catgId;
	
	
	private String catgName;
	
	private String catgDesp;

	public int getCatgId() {
		return catgId;
	}

	public void setCatgId(int catgId) {
		this.catgId = catgId;
	}

	public String getCatgName() {
		return catgName;
	}

	public void setCatgName(String catgName) {
		this.catgName = catgName;
	}

	public String getCatgDesp() {
		return catgDesp;
	}

	public void setCatgDesp(String catgDesp) {
		this.catgDesp = catgDesp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/*@OneToMany(targetEntity=Product.class, fetch=FetchType.EAGER, mappedBy="category")
    private Set<Product>product=new HashSet<Product>(0);*/


	
		

}
