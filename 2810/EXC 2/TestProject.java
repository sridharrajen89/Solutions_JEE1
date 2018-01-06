package com.htc.Exc2;

public class TestProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project P = new Project();
		P.setProjectId(100);
		P.setProjectName("AGENCY MAMANEGEMENT");
		P.setProjectHead("RAY WILLIAMS");
		P.setNoOfResources(25);
	
		System.out.println("Project ID: " + P.getProjectId());
		System.out.println("Project NAME: " + P.getProjectName());
		System.out.println("Project HEAD: " + P.getProjectHead());
		System.out.println("Project NO OF RESOURCES: " + P.getNoOfResources());

	}
}
