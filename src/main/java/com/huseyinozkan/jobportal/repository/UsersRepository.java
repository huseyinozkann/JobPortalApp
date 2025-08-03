package com.huseyinozkan.jobportal.repository;

import com.huseyinozkan.jobportal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
