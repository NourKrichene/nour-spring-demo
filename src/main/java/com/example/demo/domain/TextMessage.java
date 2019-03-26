package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "textMessage")
public class TextMessage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;
	@Column
	private String text;

	public TextMessage() {
		super();
	}

	public TextMessage(Long idTextMessage, String text) {
		super();
		this.id = idTextMessage;
		this.text = text;
	}

	public Long getIdTextMessage() {
		return id;
	}

	public void setIdTextMessage(Long idTextMessage) {
		this.id = idTextMessage;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
