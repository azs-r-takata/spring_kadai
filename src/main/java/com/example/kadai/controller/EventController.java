package com.example.kadai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.kadai.event.PressBtnEventPublisher;

@Controller
public class EventController {
	private final PressBtnEventPublisher eventPublisher;

	public EventController(PressBtnEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}
	
	@GetMapping("/event")
	public String event() {
		return "eventView";
	}
	
	@PostMapping("/pressButton")
	public String pressButton() {
		eventPublisher.publishPressBtnEvent();
		return "redirect:/event";
	}
}

