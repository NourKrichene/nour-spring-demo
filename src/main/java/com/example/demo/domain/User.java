package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_app")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String email;

	public User() {
		super();
	}

	public User(Long idUser, String lastName, String firstName, String email) {
		super();
		this.id = idUser;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}

	public Long getIdUser() {
		return id;
	}

	public void setIdUser(Long idUser) {
		this.id = idUser;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
