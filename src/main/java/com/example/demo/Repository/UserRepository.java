package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Userentity;

public interface UserRepository extends JpaRepository<Userentity, Long> {

    boolean existsByEmail(String email);
}
