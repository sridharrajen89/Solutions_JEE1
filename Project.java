package com.htc.exe1;

public class Project {
	private String projectID;
	private String projectName;
	private String projectHead;
	private int noOfResources;
	
	//Default Constructor
	public Project() {
		projectID	= " ";
		projectName = " ";
		projectHead = " ";
		noOfResources = 0;
	}
	
	//Constructor 
	public Project(String projectID, String projectName, String projectHead, int noOfResources) {
		super();
		this.projectID = projectID;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
	}
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectHead() {
		return projectHead;
	}
	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}
	public int getNoOfResources() {
		return noOfResources;
	}
	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}
	@Override
	public String toString() {
		return "Project [projectID=" + projectID + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}
	

}
