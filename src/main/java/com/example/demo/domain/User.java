package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(unique = true, nullable = false)
	private Long idUser;
	 @Column
	private String lastName;
	 @Column
	private String firstName;
	 @Column
	private Date birthDate;
	 @Column
	private String email;

	public User() {
		super();
	}

	public User(Long idUser, String lastName, String firstName, Date birthDate, String email) {
		super();
		this.idUser = idUser;
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.email = email;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
