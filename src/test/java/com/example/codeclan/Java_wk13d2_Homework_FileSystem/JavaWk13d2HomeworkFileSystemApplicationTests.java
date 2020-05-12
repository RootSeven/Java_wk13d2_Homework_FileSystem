package com.example.codeclan.Java_wk13d2_Homework_FileSystem;

import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.File;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.Folder;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.FileRepository;
import com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories.FolderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaWk13d2HomeworkFileSystemApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canMakeFolder(){
		Folder folder = new Folder("NewFolder");
		folderRepository.save(folder);
	}

	@Test
	void canMakeFile(){
		Folder folder = new Folder("Anime");
		folderRepository.save(folder);

		File file = new File("GiornoGiovanna", "png", 500, folder);
		fileRepository.save(file);
	}

}
