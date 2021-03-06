package com.user.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.Model.UserModel;
import com.user.Service.UserService;


@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping
	@RequestMapping("/user")
	public ResponseEntity<UserModel> createUser(@Valid@RequestBody UserModel userRequest) {
		UserModel userResponse = userService.addUser(userRequest);
		return ResponseEntity.status(HttpStatus.OK).body(userResponse);
	}
	
	
	@PostMapping
	@RequestMapping("/user/{id}")
	public ResponseEntity<UserModel> getUser(@Valid@PathVariable(value="id") Integer id) {
		UserModel userResponse = userService.getUser(id);
		return ResponseEntity.status(HttpStatus.OK).body(userResponse);
	}
	
	@GetMapping
	@RequestMapping("/allUsers")
	public ResponseEntity<List<UserModel>> getAllUsers(){
		List<UserModel> userResponse=userService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(userResponse);
		
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void deleteUser(@Valid@PathVariable(value="id") Integer id){
		userService.deleteUser(id);
		
	}
}
