package com.htcinc.oops.day12;

import java.io.Serializable;

public class Issue implements Serializable {
	private static final long serialVersionUID = 707407282180271904L;
	
	private int issueId;
	private String issueGeneratedDate;
	private String issueCategory;
	private String issueDescription;
	
	public Issue(int issueId, String issueGeneratedDate, String issueCategory, String issueDescription) {
		super();
		this.issueId = issueId;
		this.issueGeneratedDate = issueGeneratedDate;
		this.issueCategory = issueCategory;
		this.issueDescription = issueDescription;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public String getIssueGeneratedDate() {
		return issueGeneratedDate;
	}

	public void setIssueGeneratedDate(String issueGeneratedDate) {
		this.issueGeneratedDate = issueGeneratedDate;
	}

	public String getIssueCategory() {
		return issueCategory;
	}

	public void setIssueCategory(String issueCategory) {
		this.issueCategory = issueCategory;
	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueGeneratedDate=" + issueGeneratedDate + ", issueCategory="
				+ issueCategory + ", issueDescription=" + issueDescription + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + issueId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Issue other = (Issue) obj;
		if (issueId != other.issueId)
			return false;
		return true;
	}
	
	
	

}
