package com.manuanand.homeservices;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String title;

	private String category;
	
	private String description;
	
	private Integer userId;
	
	// Status can be - Created, Assigned, Resolved, Dropped
	private TicketStatus status;
	
	private Integer technicianId;
	
	private Date createdDate;
	
	private Date resolvedDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TicketStatus getStatus() {
		return status;
	}

	public void setStatus(TicketStatus status) {
		this.status = status;
	}

	public Integer getTechnicianId() {
		return technicianId;
	}

	public void setTechnicianId(Integer technicianId) {
		this.technicianId = technicianId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getResolvedDate() {
		return resolvedDate;
	}

	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}