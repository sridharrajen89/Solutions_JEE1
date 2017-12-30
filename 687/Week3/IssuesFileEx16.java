package com.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 * Ex 16 - Read File
 * File 'issues.txt' that contains comma separated issue records 
 * Read each line of issue records and 
 * load into an ArrayList<Issue> in a Java program. 
 *
 */
class Issues {
	private int issueId;
	private Date issueGeneratedDate;
	private String issueCategory;
	private String issueDescription;
	/**
	 * 
	 */
	public Issues() {
		super();
		this.issueId = 0;
		this.issueGeneratedDate = null;
		this.issueCategory = null;
		this.issueDescription = null;
	}
	/**
	 * @param issueId
	 * @param issueGeneratedDate
	 * @param issueCategory
	 * @param issueDescription
	 */
	public Issues(int issueId, Date issueGeneratedDate, String issueCategory, String issueDescription) {
		super();
		this.issueId = issueId;
		this.issueGeneratedDate = issueGeneratedDate;
		this.issueCategory = issueCategory;
		this.issueDescription = issueDescription;
	}
	/**
	 * @return the issueId
	 */
	public int getIssueId() {
		return issueId;
	}
	/**
	 * @param issueId the issueId to set
	 */
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	/**
	 * @return the issueGeneratedDate
	 */
	public Date getIssueGeneratedDate() {
		return issueGeneratedDate;
	}
	/**
	 * @param issueGeneratedDate the issueGeneratedDate to set
	 */
	public void setIssueGeneratedDate(Date issueGeneratedDate) {
		this.issueGeneratedDate = issueGeneratedDate;
	}
	/**
	 * @return the issueCategory
	 */
	public String getIssueCategory() {
		return issueCategory;
	}
	/**
	 * @param issueCategory the issueCategory to set
	 */
	public void setIssueCategory(String issueCategory) {
		this.issueCategory = issueCategory;
	}
	/**
	 * @return the issueDescription
	 */
	public String getIssueDescription() {
		return issueDescription;
	}
	/**
	 * @param issueDescription the issueDescription to set
	 */
	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + issueId;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "issues [issueId=" + issueId + ", issueGeneratedDate=" + issueGeneratedDate + ", issueCategory="
				+ issueCategory + ", issueDescription=" + issueDescription + "]";
	}

}
public class IssuesFileEx16 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try{
			String sep = File.separator;
		    String fileName = "C:"+sep+"Java"+sep+"issues.txt";
		    Issues issue = new Issues();
		    ArrayList<Issues> issueList = new ArrayList<Issues>();
		    String issueArray[] = null;
		    
		    Path path = Paths.get(fileName);
			BufferedReader reader = Files.newBufferedReader(path);
			
			String line = null;
			while ((line = reader.readLine()) != null) {
			     issueArray= line.split(",");
			      
			      issue = new Issues(Integer.parseInt(issueArray[0]),
			    		  new SimpleDateFormat("MM/dd/yyyy").parse(issueArray[1]),
			              issueArray[2],
			              issueArray[3]);
			      issueList.add(issue);
			      
			}
			System.out.println(issueList.toString());
				
		}
		catch (FileNotFoundException FNFE) {
			System.out.println("In FileNotFoundException");
		}
		catch (Exception FNFE) {
			System.out.println("In Exception");
		}
		finally {
			System.out.println("In finally");
		}	
	
		
	}
}
