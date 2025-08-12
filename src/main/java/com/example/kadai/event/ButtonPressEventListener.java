package com.example.kadai.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ButtonPressEventListener {
	private int count;
	
	@EventListener
	private void onPressBtnEvent(ButtonPressEvent event) {
		this.count++;
		System.out.println("ボタンが" + count + "回押されました！");
	}
}
