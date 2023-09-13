package com.example.digitalnao.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resource implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String title;
	@JsonProperty("file_format")
	private String fileFormat;
	private String link;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFileFormat() {
		return fileFormat;
	}
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	

}
