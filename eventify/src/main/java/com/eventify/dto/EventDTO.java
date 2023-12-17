package com.eventify.dto;

import java.util.Date;

import com.eventify.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
	private String eventName;
	private String description;
	private Date startDate;
	private Date endDate;
	private String location;
	private String duration;
	private String fee;
	private String image;
	private Boolean isActive;
	private User userId;

}
