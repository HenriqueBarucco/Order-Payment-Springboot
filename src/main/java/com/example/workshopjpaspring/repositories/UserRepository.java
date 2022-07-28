package com.example.workshopjpaspring.repositories;

import com.example.workshopjpaspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
