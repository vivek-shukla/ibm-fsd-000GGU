package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
  
	public List<UserEntity> findAllByFirstName(String firstName);
	public Optional<UserEntity> findByEmail(String email);
	
	public List<UserEntity> findAllByEmailContaining(String email);
	
	
}
