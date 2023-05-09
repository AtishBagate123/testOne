package com.testone.testone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.testone.testone.entities.User;
import com.testone.testone.entities.UserRepository;

@RestController
@RequestMapping(path="/user") 
public class UserController {

	@Autowired
	private UserRepository  userRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody User addNewUser (@RequestParam String name
		      , @RequestParam String status ,@RequestParam String city) {

		    User n = new User();
		    n.setName(name);
		    n.setCity(city);
		    n.setStatus(status);
		    userRepository.save(n);
		    return n;
		  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<User> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return userRepository.findAll();
	  }

	 


}
