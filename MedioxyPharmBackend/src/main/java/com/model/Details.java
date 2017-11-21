package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@Entity
public class Details implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	private int proId;
	private String proName;
	private int proPrice;
	private String username;
	@Transient
	MultipartFile file;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
