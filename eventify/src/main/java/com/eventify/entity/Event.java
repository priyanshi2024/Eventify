package com.eventify.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String eventName;
	private String description;
	private Date startDate;
	private Date endDate;
	private String location;
	private String duration;
	private String fee;
	private String image;
	@Column(nullable = false)
	private Boolean isActive = true;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userId;

}
