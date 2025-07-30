package com.example.kadai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.kadai.entity.ToDo;
import com.example.kadai.repository.ToDoRepository;

@Service
public class ToDoService {
	private final ToDoRepository todoRepository;
	public ToDoService(ToDoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public List<ToDo> getAllToDo(){
		return todoRepository.findAll();
	}
}
