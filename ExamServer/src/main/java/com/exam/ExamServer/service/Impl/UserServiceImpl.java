package com.exam.ExamServer.service.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.ExamServer.model.User;
import com.exam.ExamServer.model.UserRole;
import com.exam.ExamServer.model.repo.RoleRepository;
import com.exam.ExamServer.model.repo.UserRepository;
import com.exam.ExamServer.service.UserService;

@Service 
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	//creating user...
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User local = this.userRepository.findByUsername(user.getUsername());
		if(local != null) {
			System.out.println("User is already there..");
			throw new Exception("User already persent..");
		}else {
			
			for(UserRole ur : userRoles) {
				roleRepository.save(ur.getRole()); 
			}
			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
			
		}
		
		return local;
	}
	
}
