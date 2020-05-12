package com.example.codeclan.Java_wk13d2_Homework_FileSystem;

import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.File;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.Folder;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.User;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.FileRepository;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.FolderRepository;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaWk13d2HomeworkFileSystemApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canMakeFolder(){
		User user = new User("Mairi");
		userRepository.save(user);

		Folder folder = new Folder("NewFolder", user);
		folderRepository.save(folder);
	}

	@Test
	void canMakeFile(){
		User user = new User("Mairi");
		userRepository.save(user);

		Folder folder = new Folder("Anime", user);
		folderRepository.save(folder);

		File file = new File("GiornoGiovanna", "png", 500, folder);
		fileRepository.save(file);
	}

}
