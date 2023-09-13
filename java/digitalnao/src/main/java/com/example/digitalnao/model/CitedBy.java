package com.example.digitalnao.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CitedBy implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private int total;
	private String link;
	@JsonProperty("cites_id")
	private String citesId;
	@JsonProperty("serpapi_scholar_link")
	private String serpapiScholarlLink;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getCitesId() {
		return citesId;
	}
	public void setCitesId(String citesId) {
		this.citesId = citesId;
	}
	public String getSerpapiScholarlLink() {
		return serpapiScholarlLink;
	}
	public void setSerpapiScholarlLink(String serpapiScholarlLink) {
		this.serpapiScholarlLink = serpapiScholarlLink;
	}
	
	
	

}
