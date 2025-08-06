package com.example.kadai.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class PressBtnEventListener {
	private int count;
	
	@EventListener
	private void onPressBtnEvent(PressBtnEvent event) {
		this.count++;
		System.out.println("ボタンが" + count + "回押されました！");
	}
}
