package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@Entity
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int proId;
	private String proName;
	private String proCatg;
	private String proSupp;
	private String proDesp;
	private int proStock;
	private int proPrice;
	
	@Transient
	MultipartFile file;

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProCatg() {
		return proCatg;
	}

	public void setProCatg(String proCatg) {
		this.proCatg = proCatg;
	}

	public String getProSupp() {
		return proSupp;
	}

	public void setProSupp(String proSupp) {
		this.proSupp = proSupp;
	}

	public String getProDesp() {
		return proDesp;
	}

	public void setProDesp(String proDesp) {
		this.proDesp = proDesp;
	}

	public int getProStock() {
		return proStock;
	}

	public void setProStock(int proStock) {
		this.proStock = proStock;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
