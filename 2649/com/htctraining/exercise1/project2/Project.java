package com.htctraining.exercise1.project2;

public class Project implements ProjectInterface {

	 String projectId="";
	 String projectName="";
	 String projectHead="";
	 int noOfResources=0;
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project temp = new Project();
		temp.setProjectId("P2KJ5");
		temp.setProjectName("Welcome World");
		temp.setProjectHead("Santosh");
		temp.setNoOfResources(5);
		System.out.println(temp);

	}
	
	
	/**
	 * 
	 */
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProjectId() {
		return projectId;
	}
	@Override
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	@Override
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectHead() {
		return projectHead;
	}
	@Override
	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}
	public int getNoOfResources() {
		return noOfResources;
	}
	@Override
	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}


	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}
	

}
