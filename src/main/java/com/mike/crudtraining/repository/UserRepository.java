package com.mike.crudtraining.repository;

import com.mike.crudtraining.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
        List<User> findByLastName(String lastName);
}
