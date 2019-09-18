package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.repo.UserRepository;

@Service
public class UserService {
    @Autowired
	private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    
    public UserDto insertUser(UserDto userDto)
    {
    	ModelMapper mapper = new ModelMapper();
    	mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    	UserEntity user = mapper.map(userDto, UserEntity.class);
    	
    	user.setUserId(UUID.randomUUID().toString());
    	user.setPassword(passwordEncoder.encode(user.getPassword()));
    	userRepository.save(user);
    	userDto = mapper.map(user, UserDto.class);
    	return userDto;
    }
    
    public List<UserDto> listAllUser()
    {   ModelMapper mapper = new ModelMapper();
	    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    	List<UserEntity> listUsers = userRepository.findAll();
    	List<UserDto> listUserDto = new ArrayList<UserDto>();
    	for(UserEntity userEntity:listUsers)
    	{
    		listUserDto.add(mapper.map(userEntity, UserDto.class));
    	}
    	return listUserDto;
    }
    
    public List<UserDto> findAllByFirstName(String firstName)
    {   ModelMapper mapper = new ModelMapper();
	    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    	List<UserEntity> listUsers = userRepository.findAllByFirstName(firstName);
    	List<UserDto> listUserDto = new ArrayList<UserDto>();
    	for(UserEntity userEntity:listUsers)
    	{
    		listUserDto.add(mapper.map(userEntity, UserDto.class));
    	}
    	return listUserDto;
    }
    
    public List<UserDto> findAllByEmailContaining(String email)
    {   ModelMapper mapper = new ModelMapper();
	    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    	List<UserEntity> listUsers = userRepository.findAllByEmailContaining(email);
    	List<UserDto> listUserDto = new ArrayList<UserDto>();
    	for(UserEntity userEntity:listUsers)
    	{
    		listUserDto.add(mapper.map(userEntity, UserDto.class));
    	}
    	return listUserDto;
    }
    public void deleteByEmail(String email)
    {
    	UserEntity user = userRepository.findByEmail(email).get();
    	userRepository.deleteById(user.getId());
    }
    
    
}
