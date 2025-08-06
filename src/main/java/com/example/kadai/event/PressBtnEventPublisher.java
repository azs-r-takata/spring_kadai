package com.example.kadai.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@EnableScheduling
public class PressBtnEventPublisher {
	private final ApplicationEventPublisher applicationEventPublisher;
	
	public void publishPressBtnEvent() {
		PressBtnEvent event = new PressBtnEvent(this);
		applicationEventPublisher.publishEvent(event);
	}
}
