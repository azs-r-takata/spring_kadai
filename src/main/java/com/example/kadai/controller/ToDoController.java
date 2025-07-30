package com.example.kadai.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.kadai.entity.ToDo;
import com.example.kadai.service.ToDoService;

@Controller
public class ToDoController {
	private final ToDoService todoService;
	public ToDoController(ToDoService todoService) {
		this.todoService = todoService;
	}
	
	@GetMapping("/todo")
	public String todo(Model model) {
		List<ToDo> todos = todoService.getAllToDo();
		
		model.addAttribute("todos", todos);
		
		return "todoView";
	}
}
