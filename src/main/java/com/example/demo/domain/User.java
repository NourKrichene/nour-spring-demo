package com.example.demo.domain;

import java.util.Date;

public class User {

	private Long idUser;
	private String lastNameame;
	private String firstName;
	private Date birthDate;
	private String email;

	public User() {
		super();
	}

	public User(Long idUser, String lastNameame, String firstName, Date birthDate, String email) {
		super();
		this.idUser = idUser;
		this.lastNameame = lastNameame;
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

	public String getLastNameame() {
		return lastNameame;
	}

	public void setLastNameame(String lastNameame) {
		this.lastNameame = lastNameame;
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
