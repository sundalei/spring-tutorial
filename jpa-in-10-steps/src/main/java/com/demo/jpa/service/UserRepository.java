package com.demo.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
