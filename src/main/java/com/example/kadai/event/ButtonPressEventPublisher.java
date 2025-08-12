package com.example.kadai.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ButtonPressEventPublisher {
	private final ApplicationEventPublisher applicationEventPublisher;
	
	public void publishPressBtnEvent() {
		ButtonPressEvent event = new ButtonPressEvent(this);
		applicationEventPublisher.publishEvent(event);
	}
}
