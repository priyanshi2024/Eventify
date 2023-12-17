package com.eventify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eventify.entity.Event;
import com.eventify.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	EventService eventService;
	
	@GetMapping("/getAll")
	public List<Event> getAll() {
		return eventService.getAll();
	}
	
	@PostMapping("/save")
	public String addEvent(@RequestBody Event event , @RequestParam Long userId) {
		return eventService.addEvent(event , userId);
	}
	
	@PutMapping("/edit")
	public String editEvent(@RequestBody Event event, @RequestParam Long eventId) {
		return eventService.editEvent(event,eventId);
	}
	
	@DeleteMapping("/delete")
	public String deleteEvent(@RequestParam Long eventId) {
		return eventService.deleteEvent(eventId);
	}
	
	

}
