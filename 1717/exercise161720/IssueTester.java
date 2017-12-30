package com.htc.exercise161720;
import java.util.*;
import java.io.*;

class IssueTester {
	 public static void main(String args[])  {
	  try{
		  Issues allIssues = new Issues("D:\\Ajay\\issues.txt");
		  //loop thru issues and print
		  for(Issue i:allIssues.getListOfIssues()){  
		        System.out.println("issue ID:   " + i.getIssueId());
		        System.out.println("issue dt:   " + i.getIssueGeneratedDate());
		        System.out.println("issue cat:  " + i.getIssueCategory());
		        System.out.println("issue desc: " + i.getIssueDescription());
		  }  
	  }  catch (Exception e){
		  e.printStackTrace();
	  }
   }
}

class Issues {
	private String issuesFile; 
	List<Issue> listOfIssues = new ArrayList<Issue>();

	public Issues(String issuesFile) throws IOException {
		super();
		
		//validate file path etc. here
		this.issuesFile = issuesFile;
		
		// Open the file  
		try (FileInputStream fin = new FileInputStream(issuesFile)) {
			//read file in buffer
			BufferedReader br = new BufferedReader(new InputStreamReader(fin));
			
			String issueLine;
			//TODO: try using java.nio.file Files
			//loop Line By Line
			while ((issueLine = br.readLine())!= null)   {
				//System.out.println(issueLine);
				//parse comma separated values here
				String[] fields = issueLine.split(",");
				listOfIssues.add(new Issue(fields[0],fields[1],fields[2],fields[3]));
			}

			br.close();
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}

	public String getIssuesFile() {
		return issuesFile;
	}

	public void setIssuesFile(String issuesFile) {
		this.issuesFile = issuesFile;
	}

	public List<Issue> getListOfIssues() {
		return listOfIssues;
	}

	public void setListOfIssues(List<Issue> listOfIssues) {
		this.listOfIssues = listOfIssues;
	}
}

class Issue {
	private String issueId;
	private String issueGeneratedDate;
	private String issueCategory;     
	private String issueDescription;
	
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
}

