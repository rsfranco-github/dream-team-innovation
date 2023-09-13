package com.example.digitalnao.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.digitalnao.model.ResponseGoogleScholar;

@Service
public class GoogleScholarService {
	
	@Autowired
	private RestTemplate clientRest;
	
	private static final String API_KEY="ddb54e522ef6f37417062521e237b07e6388e26152be7d872c490cdec596dea8";
	
	private static final String ENGINE="google_scholar";
	
	private static final String URL_SERPAPI="https://serpapi.com/search.json?engine={engine}&q={q}&api_key={api_key}";

	public ResponseGoogleScholar getGoogleScholar(String q) {
		
		Map<String, String> pathVariables=new HashMap<>();
		
		pathVariables.put("q", q);
		pathVariables.put("engine", ENGINE);
		pathVariables.put("api_key", API_KEY);
		
		return clientRest.getForObject(URL_SERPAPI, ResponseGoogleScholar.class,pathVariables);
	}
	
}
