package com.htc.week1;

public class Project extends Object{
private int projectID;
private String projectName;
private String projectHead;
private int projectNOofResources;

//default constructor;
public Project() {
	projectID = 0;
	projectName = "";
	projectHead = "";
	projectNOofResources = 0;
	
 }

//Overload Constructor 
public Project (int projectID, String projectName,
		String projectHead, int projectNOofResources) {
	this.projectID = projectID;
	this.projectName = projectName;
	this.projectHead= projectHead;
	this.projectNOofResources = projectNOofResources;
}
//setter for projectId
	public void setProjectID(int projectID){
    this.projectID = projectID;	
	}
	
	//setter for projectame
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//setter for projectHead
		public void setProjectHead(String projectHead) {
			this.projectHead = projectHead;
		}
	//setter for projectNOofResource
		public void setProjectNOofResource(int projectNOofResource) {
			this.projectNOofResources = projectNOofResource;
		}
		//getter for ProjectID
			public int getProjectId() {
					return projectID;
				}
				
		//getter for ProjectName
			public String getProjectName() {
				return projectName;
				}
		//getter for ProjectHead
			public String getProjectHead() {
				return projectHead;
			}
						
		//getter for project no of resources
			public int getProjectNOofResources() {
				return projectNOofResources;
				}
}
