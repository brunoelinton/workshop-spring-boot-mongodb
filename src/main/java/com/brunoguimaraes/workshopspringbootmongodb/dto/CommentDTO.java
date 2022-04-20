package com.brunoguimaraes.workshopspringbootmongodb.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

	// ID SERIAL VERSION
	private static final long serialVersionUID = 1L;
	
	// BASIC ATRIBUTES FOR COMMENT DTO
	private String text;
	private Date date;
	private AuthorDTO author;
	
	// DEFAULT CONSTRUCTOR
	public CommentDTO() {
	}

	// CONSTRUCTOR
	public CommentDTO(String text, Date date, AuthorDTO author) {
		super();
		this.text = text;
		this.date = date;
		this.author = author;
	}

	// GETTERS AND SETTERS
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
}
