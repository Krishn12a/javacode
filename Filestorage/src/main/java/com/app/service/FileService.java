package com.app.service;

import java.io.IOException;

//FileService.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.entity.File;
import com.app.repositories.FileRepository;

@Service
public class FileService {

	@Autowired
	private FileRepository fileRepository;

	public void uploadFile(MultipartFile multipartFile) throws IOException {
		File file = new File();
		file.setName(multipartFile.getOriginalFilename());
		file.setContent(multipartFile.getBytes());
		fileRepository.save(file);
	}
}
