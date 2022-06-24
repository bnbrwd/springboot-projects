package com.example.curd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.curd.model.DemoUser;
import com.example.curd.repository.CurdRepository;

@RestController
public class CurdController {
	
	@Autowired
	private CurdRepository repository;
	
	@GetMapping("/getUser")
    public List<DemoUser> getBooks() {
        
       System.out.println("hello");
       return repository.findAll();
    }
	
	
	@PostMapping("/saveUser")
	public String saveUer(@RequestBody DemoUser user) {
		System.out.println("user");
		repository.save(user);
		return "Added user with id:"+user.getId();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		repository.deleteById(id);
		return "User Deleted"+id;
	}
	
	@PutMapping("/update/{id}")
	public String updateUser(@PathVariable int id, @RequestBody DemoUser demoUser) {
		Optional<DemoUser> optional = repository.findById(id);
		DemoUser user = optional.get();
		user.setName(demoUser.getName());
		user.setCity(demoUser.getCity());
		user.setStatus(demoUser.getStatus());
		repository.save(user);

		return "User updated:"+id;
	}


	
}
