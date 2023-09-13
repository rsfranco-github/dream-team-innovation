package com.example.digitalnao.model;

import java.io.Serializable;


public class PublicationInfo implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private String summary;
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	

}
