package com.htc.Exc2;

import java.util.*;
import java.io.*;

public class Issues {

	private int issueId;
	private String issueGeneratedDate;
	private int issueCategory;
	private String issueDescription;
	
	public Issues() {
		super();
		this.issueId = 0;
		this.issueGeneratedDate = null;
		this.issueCategory = 0;
		this.issueDescription = null;
	}	

	public Issues(int issueId, String issueGeneratedDate, int issueCategory, String issueDescription) {
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

	public int getIssueCategory() {
		return issueCategory;
	}

	public void setIssueCategory(int issueCategory) {
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
		Issues other = (Issues) obj;
		if (issueId != other.issueId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Issues [issueId=" + issueId + ", issueGeneratedDate=" + issueGeneratedDate + ", issueCategory="
				+ issueCategory + ", issueDescription=" + issueDescription + "]";
	}
}
