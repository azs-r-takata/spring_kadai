package com.example.kadai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kadai.entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer> {
	List<ToDo> findByTodoTitle(String todoTitle);
}
