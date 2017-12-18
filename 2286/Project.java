package com.java.training;

public class Project {

	private String projectId;
	private String projectName;
	private String projectHead;
	private int noOfResources;

	public static void main(String[] args) {

		Project project = new Project();

		project.setProjectId("J2EE Training");
		project.setProjectName("Training");
		project.setProjectHead("Ashok");
		project.setNoOfResources(100);


		System.out.println("J2EE Training Details");
		System.out.println(project.getProjectId());
		System.out.println(project.getProjectName());
		System.out.println(project.getProjectHead());
		System.out.println(project.getNoOfResources());

	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
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

}
