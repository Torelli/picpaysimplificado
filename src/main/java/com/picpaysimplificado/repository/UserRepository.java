package com.picpaysimplificado.repository;

import com.picpaysimplificado.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> finUserByDocument(String document);
    Optional<User> finUserById(Long id);
}