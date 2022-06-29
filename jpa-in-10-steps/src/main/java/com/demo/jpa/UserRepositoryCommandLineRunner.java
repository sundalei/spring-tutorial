package com.demo.jpa;

import com.demo.jpa.entity.User;
import com.demo.jpa.service.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    private final UserRepository userRepository;

    public UserRepositoryCommandLineRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        User savedUser = userRepository.save(user);
        log.info("new user created: {}, {}", savedUser.getId(), savedUser);
    }
}
