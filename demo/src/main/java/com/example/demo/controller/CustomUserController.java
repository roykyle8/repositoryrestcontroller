package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
public class CustomUserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/users/createUserWithEmploymentType")
    public @ResponseBody String  createUserWithEmploymentType(@RequestBody EntityModel<User> user) {
        System.out.println(user);
        // ....
        return "SUCCESS";
    }

    @PostMapping(path = "/users/createUserWithSkill")
    public @ResponseBody String  createUserWithSkill(@RequestBody CollectionModel<User> user) {
        System.out.println(user);
        // ....
        return "SUCCESS";
    }

}
