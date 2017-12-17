package com.htc.excercise1;

public class MainProgram2 {

	public static void main(String[] args) {

		//Declaration of Project object
		Project project = new Project();
		
		//setting the values to project object
		project.setProjectId(100);
		project.setProjectName("Java");
		project.setProjectHead("Ashok");
		project.setNoOfResources(50);
		
		
		//Print the Object using toString
		System.out.println("Project object using toString"+project);
		
		//Print the Object using getters
		System.out.println("Project object using getters");
		System.out.println("Project ID --->"+project.getProjectId());
		System.out.println("Project Name --->"+project.getProjectName());
		System.out.println("Project Head --->"+project.getProjectHead());
		System.out.println("No of resources --->"+project.getNoOfResources());

	}

}
