package com.example.customer;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Borrow {
	
	private String id;
	private Date borrowDate;
	private Date devolutionDate;
	// borrow succesful, delay, lost, 
	private String status;
	//regular - +15days, bestSeller +10days, big books, +20days
	private String type;
	private int fee;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_BOOK")
	private Book book;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_USER")
	private User user;
	
	
	public Borrow(String id, Date borrowDate, Date devolutionDate, String status, String type, int fee, Book book,
			User user) {
		super();
		this.id = id;
		this.borrowDate = borrowDate;
		this.devolutionDate = devolutionDate;
		this.status = status;
		this.type = type;
		this.fee = fee;
		this.book = book;
		this.user = user;
	}
	
	public Borrow() {}

	public Borrow(String id, Date borrowDate, Date devolutionDate, String status, String type, int fee) {
		super();
		this.id = id;
		this.borrowDate = borrowDate;
		this.devolutionDate = devolutionDate;
		this.status = status;
		this.type = type;
		this.fee = fee;

	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public Date getBorrowDate() {
		return borrowDate;
	}




	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}




	public Date getDevolutionDate() {
		return devolutionDate;
	}




	public void setDevolutionDate(Date devolutionDate) {
		this.devolutionDate = devolutionDate;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public int getFee() {
		return fee;
	}




	public void setFee(int fee) {
		this.fee = fee;
	}




	public Book getBook() {
		return book;
	}




	public void setBook(Book book) {
		this.book = book;
	}




	public User getUser() {
		return user;
	}




	public void setUser(User user) {
		this.user = user;
	}




	@Override
	public String toString() {
		return "Borrow [id=" + id + ", borrowDate=" + borrowDate + ", devolutionDate=" + devolutionDate + ", status="
				+ status + ", type=" + type + ", fee=" + fee + ", book=" + book + ", user=" + user + "]";
	}
	
	
	
	

}
