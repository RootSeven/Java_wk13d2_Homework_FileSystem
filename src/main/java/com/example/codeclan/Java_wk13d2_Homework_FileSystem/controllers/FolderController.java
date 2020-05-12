package com.example.codeclan.Java_wk13d2_Homework_FileSystem.controllers;

import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.File;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.Folder;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.FileRepository;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        List<Folder> foundFolders = folderRepository.findAll();
        return new ResponseEntity<List<Folder>>(foundFolders, HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getFolderById(@PathVariable Long id){
        return new ResponseEntity(folderRepository.findById(id), HttpStatus.OK);
    }
}
