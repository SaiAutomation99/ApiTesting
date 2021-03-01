package com.selerizationPractise;

public class Fields {
	

	String summary;
	String description;
	Projects pro;
	IssueType issue;
	
	public Fields(String summary,String description,Projects pro,IssueType issue) {
		
		this.summary=summary;
		this.description=description;
		this.pro=pro;
		this.issue=issue;
	}
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Projects getPro() {
		return pro;
	}
	public void setPro(Projects pro) {
		this.pro = pro;
	}
	public IssueType getIssue() {
		return issue;
	}
	public void setIssue(IssueType issue) {
		this.issue = issue;
	}
	
	
	
	
	
	

}
