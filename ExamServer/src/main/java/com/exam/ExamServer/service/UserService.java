package com.exam.ExamServer.service;

import java.util.Set;

import com.exam.ExamServer.model.User;
import com.exam.ExamServer.model.UserRole;

public interface UserService {
	//creating user
	public User createUser(User user,Set<UserRole> userRoles) throws Exception;
	
}
