package com.javadev.springbootwebapp.Springbootwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();

	private static int todosCount = 1;
	static {
		todos.add(new Todo(todosCount++, "ibtihaj", "learn aws", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(todosCount++, "Samad", "learn devops", LocalDate.now().plusMonths(6), false));
		todos.add(new Todo(todosCount++, "Ali", "learn full stack", LocalDate.now().plusMonths(2), false));
		todos.add(new Todo(todosCount++, "ibtihaj", "learn java", LocalDate.now().plusMonths(4), false));

	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {

		Todo todo = new Todo(todosCount++, username, description, targetDate, done);
		todos.add(todo);
	}

	public void deleteById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}

}
