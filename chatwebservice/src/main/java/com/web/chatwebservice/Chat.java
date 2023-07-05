package com.web.chatwebservice;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chat {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //To auto generate next sequential id
	private int id;
	private String name;
	private String message;
	private String date;
	
	public Chat(int id, String name, String message, String date) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
		this.date = date;
	}
	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, id, message, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chat other = (Chat) obj;
		return Objects.equals(date, other.date) && id == other.id && Objects.equals(message, other.message)
				&& Objects.equals(name, other.name);
	}
	
	
	
}
