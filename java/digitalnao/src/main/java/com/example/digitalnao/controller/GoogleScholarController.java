package com.example.digitalnao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.digitalnao.model.ResponseGoogleScholar;
import com.example.digitalnao.service.GoogleScholarService;

@RestController
public class GoogleScholarController {
	
	@Autowired
	private GoogleScholarService service;
	
	@GetMapping("/organic_results")
	public ResponseGoogleScholar getGoogleScholar(){
		return this.service.getGoogleScholar();
	}

}
