//package com.example.demo.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.catalina.User;
//import org.modelmapper.ModelMapper;
//import org.modelmapper.convention.MatchingStrategies;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dto.UserDto;
//import com.example.demo.httpModel.UserRequestModel;
//import com.example.demo.httpModel.UserResponseModel;
//import com.example.demo.service.UserService;

//@Controller
//public class UserController { 
//	@Autowired
//	private UserService userService;
//	@GetMapping("/")
//	public String redirectToUserList()
//	{
//		return "redirect:/users"; 
//	}
//	
//	@PostMapping("/inserUser")
//	public ResponseEntity<UserResponseModel> insertUser(@RequestBody UserRequestModel requestUser)
//	{
//		ModelMapper mapper = new ModelMapper();
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		UserDto userDto = mapper.map(requestUser, UserDto.class);
//		userDto=userService.insertUser(userDto);
//		UserResponseModel responseModel = mapper.map(userDto, UserResponseModel.class);
//		return ResponseEntity.status(HttpStatus.CREATED).body(responseModel);
//		
//		
//		
//	} 
//	
//	@PostMapping("/userSave")
//	public String userUser(@ModelAttribute("requestModel") UserRequestModel requestUser)
//	{
//		ModelMapper mapper = new ModelMapper();
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		UserDto userDto = mapper.map(requestUser, UserDto.class);
//		userService.insertUser(userDto);
//		
//		return "redirect:/users";
//		
//		
//		
//	}
//	
//	@GetMapping("/users")
//	public String getAllUser(Model theModel)
//	{   ModelMapper mapper = new ModelMapper();
//    	mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		
//		List<UserDto> userDtoList = userService.listAllUser();
//		List<UserResponseModel> userResponseList = new ArrayList<UserResponseModel>();
//		for(UserDto userDto:userDtoList)
//		{
//			userResponseList.add(mapper.map(userDto, UserResponseModel.class));
//			
//		}
//		System.out.println(userResponseList);
//		theModel.addAttribute("userList", userResponseList);
//		
//		return "listUsers";
//	}
//	
//	@PostMapping("/usersFirstName")
//	public String findAllUserByFirstName(@RequestParam("firstName") String firstName,Model theModel)
//	{   ModelMapper mapper = new ModelMapper();
//	  mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//	
//	  List<UserDto> userDtoList = userService.findAllByFirstName(firstName);
//	  List<UserResponseModel> userResponseList = new ArrayList<UserResponseModel>();
//	  for(UserDto userDto:userDtoList)
//	  {
//		userResponseList.add(mapper.map(userDto, UserResponseModel.class));
//		
//	  }
//	  System.out.println(userResponseList);
//	  theModel.addAttribute("userList", userResponseList);
//		
//		return "listUsers";
//	}
//	
//	@GetMapping("/delete")
//	public String deleteByEmail(@RequestParam("email") String email)
//	{
//		userService.deleteByEmail(email);
//		return "redirect:/users";
//	}
//	
//	@GetMapping("/showUserForm")
//	public String redirectToUserForm(Model theModel)
//	{
//		UserRequestModel requestModel = new UserRequestModel();
//		
//		theModel.addAttribute("requestModel", requestModel);
//		return "userForm";
//	}
//	
//}
//	
    

