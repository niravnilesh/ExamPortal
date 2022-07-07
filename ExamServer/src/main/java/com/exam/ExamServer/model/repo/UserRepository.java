package com.exam.ExamServer.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exam.ExamServer.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findByUsername(String username);
	

}
