package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String emailid;
	private String profession;
	
	public Contact(){
		
	}
	public Contact(Long id, String name, String emailid, String profession) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.profession = profession
				;
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	

}
