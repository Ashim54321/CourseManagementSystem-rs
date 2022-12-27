package com.project.CourseManagementSystem.repository;

import com.project.CourseManagementSystem.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
