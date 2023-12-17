package com.eventify.service;

import java.util.List;

import com.eventify.entity.Event;

public interface EventService {
	
	public List<Event> getAll();
	public String addEvent(Event event,Long userId);
	public String editEvent(Event event,Long eventId);
	public String deleteEvent(Long eventId);



}
