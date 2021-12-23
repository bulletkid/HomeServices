package com.manuanand.homeservices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/homeservices/user") // This means URL's start with /helpdesk (after Application path)
public class UserController {
	@Autowired // This means to get the bean called userRepository
			   // Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;

	///
	// User Repository
	///
	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody User addUser (
			@RequestParam String name, @RequestParam String email, 
			@RequestParam String password, @RequestParam (required = false) Boolean isPremiumCustomer) {

		User newUser = new User();
		newUser.setName(name);
		newUser.setEmail(email);
		newUser.setPassword(password);
		
		userRepository.save(newUser);
		
		return newUser;
	}

	@GetMapping(path="/")
	public @ResponseBody Iterable<User> getAllUsers() {
		
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}

	@GetMapping(path="/{id}")
	public @ResponseBody User getSpecificUser(@PathVariable String id) {
		
		Integer userId = null;
		try {
			userId = Integer.parseInt(id);
		} catch (NumberFormatException ex) {
			return null;
		}

		Optional<User> user = userRepository.findById(userId);
		if (!user.isEmpty()) {
			return user.get();
		} 

		return null;
	}
}