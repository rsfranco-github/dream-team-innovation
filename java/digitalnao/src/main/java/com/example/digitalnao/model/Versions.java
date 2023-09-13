package com.example.digitalnao.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Versions implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private int total;
	private String link;
	@JsonProperty("cluster_id")
	private String clusterId;
	@JsonProperty("serpapi_scholar_link")
	private String serpapiScholarLink;
	

}
