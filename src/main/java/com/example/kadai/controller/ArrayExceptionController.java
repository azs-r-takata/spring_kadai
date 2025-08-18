package com.example.kadai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayExceptionController {
	@GetMapping("/exception")
	public String dummyException(@RequestParam int num) {
		String[] dummyArray = {"侍 一郎", "侍 二郎", "侍 三郎"};
		
		return dummyArray[num];
	}
}
