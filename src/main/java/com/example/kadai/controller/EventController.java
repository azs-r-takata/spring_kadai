package com.example.kadai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.kadai.event.ButtonPressEventPublisher;

@Controller
public class EventController {
	private final ButtonPressEventPublisher eventPublisher;

	public EventController(ButtonPressEventPublisher eventPublisher) {
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

