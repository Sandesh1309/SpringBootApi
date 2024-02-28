package com.example.demo.SwaggerOpenApi.repo;

import com.example.demo.SwaggerOpenApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<User, String> {
}
