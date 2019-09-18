package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.httpModel.UserRequestModel;
import com.example.demo.httpModel.UserResponseModel;
import com.example.demo.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;
	@GetMapping("/")
	public String redirectToUserList()
	{
		return "redirect:/users"; 
	}
	
	@PostMapping("/users")
	public ResponseEntity<UserResponseModel> insertUser(@RequestBody UserRequestModel requestUser)
	{
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto userDto = mapper.map(requestUser, UserDto.class);
		userDto=userService.insertUser(userDto);
		UserResponseModel responseModel = mapper.map(userDto, UserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(responseModel);
		
		
		
	} 
	
	@GetMapping("/users")
	public ResponseEntity<List<UserResponseModel>> getAllUser(Model theModel)
	{   ModelMapper mapper = new ModelMapper();
    	mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		List<UserDto> userDtoList = userService.listAllUser();
		List<UserResponseModel> userResponseList = new ArrayList<UserResponseModel>();
		for(UserDto userDto:userDtoList)
		{
			userResponseList.add(mapper.map(userDto, UserResponseModel.class));
			
		}
		System.out.println(userResponseList);
		theModel.addAttribute("userList", userResponseList);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(userResponseList);
	}
	
	@GetMapping("/users/{firstName}")
	public ResponseEntity<List<UserResponseModel>> findAllUserByFirstName(@PathVariable("firstName") String firstName)
	{   ModelMapper mapper = new ModelMapper();
	  mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	
	  List<UserDto> userDtoList = userService.findAllByFirstName(firstName);
	  List<UserResponseModel> userResponseList = new ArrayList<UserResponseModel>();
	  for(UserDto userDto:userDtoList)
	  {
		userResponseList.add(mapper.map(userDto, UserResponseModel.class));
		
	  }
		return ResponseEntity.status(HttpStatus.CREATED).body(userResponseList);
	}
	@GetMapping("/users/findByEmail/{email}")
	public ResponseEntity<List<UserResponseModel>> findAllUserByEmailContaining(@PathVariable("email") String email)
	{   ModelMapper mapper = new ModelMapper();
	  mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	
	  List<UserDto> userDtoList = userService.findAllByEmailContaining(email);
	  List<UserResponseModel> userResponseList = new ArrayList<UserResponseModel>();
	  for(UserDto userDto:userDtoList)
	  {
		userResponseList.add(mapper.map(userDto, UserResponseModel.class));
		
	  }
		return ResponseEntity.status(HttpStatus.CREATED).body(userResponseList);
	}
	
	@DeleteMapping("/users/{email}")
	public ResponseEntity<String> deleteByEmail(@PathVariable("email") String email)
	{
		userService.deleteByEmail(email);
		return ResponseEntity.status(HttpStatus.CREATED).body("deleted");
	}
	
	@GetMapping("/showUserForm")
	public String redirectToUserForm(Model theModel)
	{
		UserRequestModel requestModel = new UserRequestModel();
		
		theModel.addAttribute("requestModel", requestModel);
		return "userForm";
	}
	
}
	