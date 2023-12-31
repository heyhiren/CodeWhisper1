package com.codewhisper.demo.repository;

import com.codewhisper.demo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

// Create SpringBoot RoleRepository JPA repository with findByName
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
