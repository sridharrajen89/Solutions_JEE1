package com.htc.test;

public class ProjectApplicaion {

	public static void main(String[] args) {
		Project p=new Project();
		p.setProjectId(1);
		p.setProjectName("htc sample project");
		p.setNoOfResources(5);
		p.setProjectHead("gautam");
		System.out.println(p);

	}

}
