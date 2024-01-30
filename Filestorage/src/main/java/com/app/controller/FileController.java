package com.app.controller;

import java.io.IOException;

//FileController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.service.FileService;
import com.app.service.FolderService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class FileController {

	@Autowired
	private FileService fileService;

	@Autowired
	private FolderService folderService;

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile file) {
		try {
			fileService.uploadFile(file);
			return "File uploaded successfully";
		} catch (IOException e) {
			e.printStackTrace();
			return "Error uploading file";
		}
	}

	@PostMapping("/createFolder")
	public String createFolder(@RequestParam("folderName") String folderName) {
	    folderService.createFolder(folderName);
	    return "Folder created successfully";
	}
}