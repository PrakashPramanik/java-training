package com.example.demo.controller;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/api/users")
	public String CreateUser() {
		return "User is Created";
	}

	@PostMapping("/api/users")
	public String AddUser() {
		return "Add User";
	}

	@PutMapping("/api/users/{id}")
	public String updateUser(@PathVariable("id") Long userId) {

		return "User " + userId + " Updated";
	}

	@DeleteMapping("/api/users/{id}")
	public String deleteUser(@PathVariable("id") Long userId) {

		return "User " + userId + " Delete";
	}
}
