package com.example.kadai.event;

import org.springframework.context.ApplicationEvent;

public class ButtonPressEvent extends ApplicationEvent {
	public ButtonPressEvent(Object source) {
		super(source);
	}
}
