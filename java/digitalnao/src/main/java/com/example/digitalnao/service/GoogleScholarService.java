package com.example.digitalnao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.digitalnao.model.ResponseGoogleScholar;

@Service
public class GoogleScholarService {
	
	@Autowired
	private RestTemplate clientRest;
	
	private static final String URL_SERPAPI="https://serpapi.com/search.json?engine=google_scholar&q=biology&api_key=ddb54e522ef6f37417062521e237b07e6388e26152be7d872c490cdec596dea8";

	public ResponseGoogleScholar getGoogleScholar() {
		return clientRest.getForObject(URL_SERPAPI, ResponseGoogleScholar.class);
	}
	
}
