package com.example.kadai.event;

import org.springframework.context.ApplicationEvent;

public class PressBtnEvent extends ApplicationEvent {
	public PressBtnEvent(Object source) {
		super(source);
	}
}
