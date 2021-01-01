package com.bean;

import java.math.BigDecimal;

public class User {

	String id ;
	String name ;
	private BigDecimal familyMemberQuantity ;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", familyMemberQuantity=" + familyMemberQuantity + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getFamilyMemberQuantity() {
		return familyMemberQuantity;
	}
	public void setFamilyMemberQuantity(BigDecimal familyMemberQuantity) {
		this.familyMemberQuantity = familyMemberQuantity;
	}
	public User(String id, String name, BigDecimal familyMemberQuantity) {
		super();
		this.id = id;
		this.name = name;
		this.familyMemberQuantity = familyMemberQuantity;
	}
	
	
}
