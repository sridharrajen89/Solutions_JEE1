package com.htc.week3;

public class Issue {

	private int issueId;
	private String issueGeneratedDate;
	private int issueCategory;
	private String issueDescription;
	
	//Constructor
	public Issue(int issueId, String issueGeneratedDate, int issueCategory, String issueDescription) {
		super();
		this.issueId = issueId;
		this.issueGeneratedDate = issueGeneratedDate;
		this.issueCategory = issueCategory;
		this.issueDescription = issueDescription;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	//toString()
	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueGeneratedDate=" + issueGeneratedDate + ", issueCategory="
				+ issueCategory + ", issueDescription=" + issueDescription + "]";
	}
	
	
	
	
}
