package com.thoughtworks.aceleradora.servicos;

import com.thoughtworks.aceleradora.domain.User;
import com.thoughtworks.aceleradora.repository.UserRepository;
import com.thoughtworks.aceleradora.service.UserService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UserServiceTest {

    @Test
    public void shouldReturnOkIfRepositorySaveValidUser(){
        User userExpected = new User("Lucilaine", "lucilaine@email.com");
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        List<User> users = userService.save(userExpected);

        User userResult = users.get(0);
        Assert.assertEquals(userResult.getName(), "Lucilaine");
        Assert.assertEquals(userResult.getEmail(), "Lucilaine@email.com");

    }
}