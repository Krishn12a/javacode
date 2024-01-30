package com.app.repositories;

//FolderRepository.java

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Folder;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

