package com.prakash.messaging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prakash.messaging.model.User;
import com.prakash.messaging.service.UserService;

@Controller 
@RequestMapping(path="/user") 
public class UserController {

	@Autowired
	private UserService userService;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name
        , @RequestParam String email) {
    	userService.addUser(name, email);
    	return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.findAllUsers();
    }
    

}