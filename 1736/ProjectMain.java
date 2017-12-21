package com.htcinc.oops;

public class ProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project project=new Project();
		project.setProjectId(1);
		project.setProjectName("Project test");
		project.setProjectHead("Srinivas");
		project.setNoOfResources(25);
		
		System.out.println("Project entered is : \n" + project);

	}

}
