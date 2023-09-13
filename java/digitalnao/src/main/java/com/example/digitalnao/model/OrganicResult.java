package com.example.digitalnao.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrganicResult implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private int position;
	private String title;
	@JsonProperty("result_id")
	private String resultId;
	private String link;
	private String snippet;
	@JsonProperty("publication_info")
	private PublicationInfo publicationInfo;
	private List<Resource> resources;
	@JsonProperty("inline_links")
	private Inlinelinks inlinelinks;
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getResultId() {
		return resultId;
	}
	public void setResultId(String resultId) {
		this.resultId = resultId;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getSnippet() {
		return snippet;
	}
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}
	public PublicationInfo getPublicationInfo() {
		return publicationInfo;
	}
	public void setPublicationInfo(PublicationInfo publicationInfo) {
		this.publicationInfo = publicationInfo;
	}
	public List<Resource> getResources() {
		return resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	public Inlinelinks getInlinelinks() {
		return inlinelinks;
	}
	public void setInlinelinks(Inlinelinks inlinelinks) {
		this.inlinelinks = inlinelinks;
	}
	
	
	

}
