package com.agathsya.repository;

import com.agathsya.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByFirstName(String firstName);

    List<User> findAllByFirstName(String firstName);
}
