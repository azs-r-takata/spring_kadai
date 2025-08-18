package com.example.kadai.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class ErrorHandling {
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleException(Exception ex) {
		
		log.error("[ERROR] - 配列の要素外参照が発生しました。メソッド名：{}, メッセージ：{}",
				ex.getStackTrace()[0].getMethodName(),
				ex.getMessage());
		
		return "errorView";
	}
}
