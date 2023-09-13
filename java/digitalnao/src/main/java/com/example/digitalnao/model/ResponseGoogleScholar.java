package com.example.digitalnao.model;

import java.io.Serializable;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseGoogleScholar implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("organic_results")
	private List<OrganicResult> organicResults;
	
	

}
