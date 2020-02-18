package com.user.data.contrller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.data.model.User;
import com.user.data.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository repository;

	@GetMapping("/getAll")
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@GetMapping("/getUser/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId) throws Exception {
		User user = repository.findById(userId).orElseThrow(() -> new RuntimeException("No user present with this id"));
		return ResponseEntity.ok().body(user);

	}

	@PostMapping("/save")
	public User createUser(@RequestBody User user) {
		return repository.save(user);
	}

	@PutMapping("/save/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId,
			@Validated @RequestBody User userDetails) {
		User user = repository.findById(userId).orElseThrow(() -> new RuntimeException("No user found...!"));

		user.setFirstName(userDetails.getFirstName());
		user.setLastName(userDetails.getLastName());
		user.setEmail(userDetails.getEmail());
		user.setUpdatedAt(new Date());

		final User updatedUser = repository.save(user);
		return ResponseEntity.ok().body(updatedUser);

	}
}
