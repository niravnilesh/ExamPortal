package com.exam.ExamServer.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exam.ExamServer.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
