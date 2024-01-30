package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Folder;
import com.app.repositories.FolderRepository;

@Service
public class FolderService {

	@Autowired
	private FolderRepository folderRepository;

	public void createFolder(String folderName) {
		Folder folder = new Folder();
		folder.setName(folderName);
		folderRepository.save(folder);
	}
}
