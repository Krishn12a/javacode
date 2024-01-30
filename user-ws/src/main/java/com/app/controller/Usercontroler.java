package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.UserDetailsRequsetModel;
import com.app.model.UserRest;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

@RestController
@RequestMapping("/user")
public class Usercontroler {
	
//	@GetMapping(path = "/{userid}/{count}")
//	public String getuser(@PathVariable String userid,@PathVariable String count) {
//		return "get user created"+userid+count;
//	}
//	@GetMapping
//	public String getuser(@RequestParam(value="page",defaultValue = "1")int page,@RequestParam(value="limit" ,defaultValue = "10") int limit,@RequestParam(value="sort",required = false)String sort) {
//		return "get user called with page ="+page+"limit ="+limit+"sort "+sort;
//		}
	
//	@GetMapping(path="/{userid}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
//	public UserRest getuser(@PathVariable String userid) {
//		UserRest returnvalue=new UserRest();
//		returnvalue.setFirstName("Muthu");
//		returnvalue.setLastName("krishna");
//		returnvalue.setEmail("krishna@gmail.com");
//		return returnvalue;
//	}
	
	@GetMapping(path="/{userid}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<UserRest> getuser(@PathVariable String userid) {
		UserRest returnvalue=new UserRest();
		returnvalue.setFirstName("Muthu");
		returnvalue.setLastName("krishna");
		returnvalue.setEmail("krishna@gmail.com");
		return new ResponseEntity<UserRest>(returnvalue, HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE} )
	public ResponseEntity<UserRest> createUser(@RequestBody UserDetailsRequsetModel userDetails){
		UserRest returnvalue=new UserRest();
		returnvalue.setFirstName(userDetails.getFirstName());
		returnvalue.setLastName(userDetails.getLastName());
		returnvalue.setEmail(userDetails.getEmail());
		
		return new ResponseEntity<UserRest>(returnvalue, HttpStatus.OK);
	}
	
	
	@PutMapping
	public String puttuser() {
		return "put user created";
	}
	@DeleteMapping
	public String delettuser() {
		return "delet user created";
	}

}
