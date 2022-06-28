package com.demo.jpa;

import com.demo.jpa.entity.User;
import com.demo.jpa.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

    private final UserDAOService userDAOService;

    public UserDAOServiceCommandLineRunner(UserDAOService userDAOService) {
        this.userDAOService = userDAOService;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long userId = userDAOService.insert(user);
        log.info("new user created: {}, {}", userId, user);
    }
}
