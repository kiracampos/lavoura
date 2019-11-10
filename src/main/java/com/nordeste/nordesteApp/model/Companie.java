package com.nordeste.nordesteApp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "companies")
public class Companie implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	@NotEmpty()
	private String name;
	
	@Column(name = "social")
	@NotEmpty()
	private String social;
	
	@Column(name = "cnpj")
	@NotEmpty()
	@Size(max = 18)
	private String cnpj;
	
	@Column(name = "address")
	@NotEmpty()
	private String address;
	
	@Column(name = "city")
	@NotEmpty()
	@Size(max = 100)
	private String city;
	
	@Column(name = "state")
	@NotEmpty()
	@Size(max = 50)
	private String state;
	
	@Column(name = "country")
	@NotEmpty()
	@Size(max = 50)
	private String country;
	
	@Column(name = "phone")
	@NotEmpty()
	@Size(max = 20)
	private String phone;
	
	@Column(name = "cellphone")
	@NotEmpty()
	private String cellphone;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "updated_at")
	private Date updatedAt;
	
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
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateAt() {
		return updatedAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updatedAt = updateAt;
	}
}
