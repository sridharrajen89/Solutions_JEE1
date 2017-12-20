package com.htc.javaweek1;

public class ProjectTest {

	public static void main(String[] args) {
		Project sampleProject1 = new Project();
		sampleProject1.setProjectId(101);
		sampleProject1.setProjectName("Java Training");
		sampleProject1.setProjectHead("Vaithilingam");
		sampleProject1.setNoOfResources(25);
		System.out.println("Output of Project Class..");
		System.out.println("Project ID -- "+sampleProject1.getProjectId());
		System.out.println("Project Name -- "+sampleProject1.getProjectName());
		System.out.println("Project Head -- "+sampleProject1.getProjectHead());
		System.out.println("Project No of Resource -- "+sampleProject1.getNoOfResources());
	}

}
