package com.htc.training;

public class Project {
	int projectId;
	String projectName;
	String projectHead;
	int noOfResources;
	
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
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



	public static void main(String[] args) {
	
		Project p = new Project();
		p.setProjectId(101);
		p.setProjectName("Training Project");
		p.setProjectHead("HTC");
		p.setNoOfResources(100);
		
		System.out.println(p.toString());
		
	}

}
