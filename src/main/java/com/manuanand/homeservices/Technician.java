package com.manuanand.homeservices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Technician {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

	private String email;
	
	private int ticketsResolved;
	
	private Integer currentTicket;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTicketsResolved() {
		return ticketsResolved;
	}

	public void setTicketsResolved(int ticketsResolved) {
		this.ticketsResolved = ticketsResolved;
	}

	public Integer getCurrentTicket() {
		return currentTicket;
	}

	public void setCurrentTicket(Integer currentTicket) {
		this.currentTicket = currentTicket;
	}

}
