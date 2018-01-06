package com.htc.dec29;

public class Issue 
{
	private String issueId;
	private String issueGeneratedDate;
	private String issueCategory;
	private String issueDescription;
	/**
	 * 
	 */
	public Issue() {
		super();
	}
	/**
	 * @param issueId
	 * @param issueGeneratedDate
	 * @param issueCategory
	 * @param issueDescription
	 */
	public Issue(String issueId, String issueGeneratedDate, String issueCategory, String issueDescription) {
		super();
		this.issueId = issueId;
		this.issueGeneratedDate = issueGeneratedDate;
		this.issueCategory = issueCategory;
		this.issueDescription = issueDescription;
	}
	public String getIssueId() {
		return issueId;
	}
	public void setIssueId(String issueId) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((issueId == null) ? 0 : issueId.hashCode());
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
		if (issueId == null) {
			if (other.issueId != null)
				return false;
		} else if (!issueId.equals(other.issueId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueGeneratedDate=" + issueGeneratedDate + ", issueCategory="
				+ issueCategory + ", issueDescription=" + issueDescription + "]";
	}  
	
	
	

}
