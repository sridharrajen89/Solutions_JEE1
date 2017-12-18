package com.htc.oops;

public class ProjectObject {

	public static void main(String[] args) {

		Project project = new Project();
		
		project.setProjectId(001);
		project.setProjectName("Java");
		project.setProjectHead("Shankar");
		project.setNoOfResources(10);
		System.out.println("Project:"+project);
		
	}

}