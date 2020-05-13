package com.example.codeclan.Java_wk13d2_Homework_FileSystem.components;

import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.File;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.Folder;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.User;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.FileRepository;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.FolderRepository;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FileRepository fileRepository;

    @Autowired
    private FolderRepository folderRepository;

    public void run(ApplicationArguments args){
        folderRepository.deleteAll();
        fileRepository.deleteAll();
        userRepository.deleteAll();


        User user1 = new User("Mairi");
        userRepository.save(user1);

        Folder folder1 = new Folder("Jojo", user1);
        folderRepository.save(folder1);

        File file1 = new File("JosephJoestar", "png", 500, folder1);
        fileRepository.save(file1);
    }

}
