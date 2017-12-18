package com.java.exercise;

public class Project {

	int projectId;
	String projectname;
	String projecthead;
	int noofresources;
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public void setProjecthead(String projecthead) {
		this.projecthead = projecthead;
	}
	public void setNoofresources(int noofresources) {
		this.noofresources = noofresources;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectname=" + projectname + ", projecthead=" + projecthead
				+ ", noofresources=" + noofresources + "]";
	}
	
}
