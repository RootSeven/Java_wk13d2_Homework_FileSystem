package com.example.codeclan.Java_wk13d2_Homework_FileSystem.repositories;

import com.example.codeclan.Java_wk13d2_Homework_FileSystem.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
