package com.htc.oops;

public class ProjectTest {

	public ProjectTest() {
		// ProjectTest Sample
	}

	public static void main(String[] args) {
		// ProjectTest Sample
		Project PJ=new Project();
		// Input
		
		PJ.setProjectId(100);
		PJ.setProjectName("Migration Project");
		PJ.setProjectHead("Michael");
		PJ.setNoOfResources(4);
		
		//Output 
		
		
		System.out.println(PJ.getProjectId()+"--"+PJ.getProjectName()+"--"+PJ.getProjectHead()+"--"+PJ.getNoOfResources());
		
		

	}

}
