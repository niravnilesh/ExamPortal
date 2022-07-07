package com.exam.ExamServer;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.ExamServer.model.Role;
import com.exam.ExamServer.model.User;
import com.exam.ExamServer.model.UserRole;
import com.exam.ExamServer.service.UserService;

@SpringBootApplication
public class ExamServerApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Running Code....");
		
		
//		User user = new User();
//		user.setFirstName("Varsha");
//		user.setLastName("Bairwa");
//		user.setUsername("varsha7877");
//		user.setPassword("abc123");
//		user.setEmail("abc@gmail.com");
//		user.setProfile("default.png");
//		
//		Role role1 = new Role();
//		role1.setRoleId(10L);
//		role1.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleSet =  new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		User user1 = this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());
		
		
	}

}
