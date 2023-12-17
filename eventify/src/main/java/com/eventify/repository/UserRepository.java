package com.eventify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventify.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
