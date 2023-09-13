package com.example.digitalnao.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Inlinelinks implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@JsonProperty("serpapi_cite_link")
	private String serpapiCiteLink;
	@JsonProperty("html_version")
	private String htmlVersion;
	@JsonProperty("cited_by")
	private CitedBy citedBy;
	@JsonProperty("related_pages_link")
	private String relatedPagesLink;
	@JsonProperty("serpapi_related_pages_link")
	private String serpapiRelatedPagesLink;
	private Versions versions;
	
	public String getSerpapiCiteLink() {
		return serpapiCiteLink;
	}
	public void setSerpapiCiteLink(String serpapiCiteLink) {
		this.serpapiCiteLink = serpapiCiteLink;
	}
	public String getHtmlVersion() {
		return htmlVersion;
	}
	public void setHtmlVersion(String htmlVersion) {
		this.htmlVersion = htmlVersion;
	}
	public CitedBy getCitedBy() {
		return citedBy;
	}
	public void setCitedBy(CitedBy citedBy) {
		this.citedBy = citedBy;
	}
	public String getRelatedPagesLink() {
		return relatedPagesLink;
	}
	public void setRelatedPagesLink(String relatedPagesLink) {
		this.relatedPagesLink = relatedPagesLink;
	}
	public String getSerpapiRelatedPagesLink() {
		return serpapiRelatedPagesLink;
	}
	public void setSerpapiRelatedPagesLink(String serpapiRelatedPagesLink) {
		this.serpapiRelatedPagesLink = serpapiRelatedPagesLink;
	}
	public Versions getVersions() {
		return versions;
	}
	public void setVersions(Versions versions) {
		this.versions = versions;
	}
	
	

}
