package com.htc.exe4;

import java.util.Date;

public class Issue {
	private int issueID;
	private Date issueGeneratedDate;
	private String issueCategory;
	private String issueDescription;
	
	public Issue(int issueID, Date issueGeneratedDate, String issueCategory, String issueDescription) {
		super();
		this.issueID = issueID;
		this.issueGeneratedDate = issueGeneratedDate;
		this.issueCategory = issueCategory;
		this.issueDescription = issueDescription;
	}

	public int getIssueID() {
		return issueID;
	}

	public void setIssueID(int issueID) {
		this.issueID = issueID;
	}

	public Date getIssueGeneratedDate() {
		return issueGeneratedDate;
	}

	public void setIssueGeneratedDate(Date issueGeneratedDate) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + issueID;
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
		if (issueID != other.issueID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Issue [issueID=" + issueID + ", issueGeneratedDate=" + issueGeneratedDate + ", issueCategory="
				+ issueCategory + ", issueDescription=" + issueDescription + "]";
	}
}
