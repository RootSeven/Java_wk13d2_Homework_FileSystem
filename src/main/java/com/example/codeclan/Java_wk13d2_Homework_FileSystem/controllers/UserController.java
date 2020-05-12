package com.example.codeclan.Java_wk13d2_Homework_FileSystem.controllers;

import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.File;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.User;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.FileRepository;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> foundUsers = userRepository.findAll();
        return new ResponseEntity<List<User>>(foundUsers, HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getUserById(@PathVariable Long id){
        return new ResponseEntity(userRepository.findById(id), HttpStatus.OK);
    }

}
