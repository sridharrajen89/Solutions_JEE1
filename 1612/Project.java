package com.htc.week1;

public class Project {
	int ProjectId;
	String ProjectName;
	String ProjectHead;
	int noofResources;
	@Override
	public String toString() {
		return "Project [projectId=" + ProjectId + ", projectName=" + ProjectName + ", projectHead=" +ProjectHead+", noofResources=" +noofResources+"]";
		
	}
	public int getProjectId() {
		return ProjectId; 
		}
	public void setProjectId(int ProjectId) {
		this.ProjectId=ProjectId;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String ProjectName) {
		this.ProjectName=ProjectName;
	}
	public String getProjectHead() {
		return ProjectHead;
	}
	public void setProjectHead(String ProjectHead) {
		this.ProjectHead=ProjectHead;
	}
	public int getnoofResources() {
		return noofResources;
	}
	public void setnoofResources(int noofResources) {
		this.noofResources=noofResources;
	}
	

		public static void main(String[] args) {
			Project Project = new Project();
					Project.setProjectId(100);
					Project.setProjectName("HTC Java Training Batch One");
					Project.setProjectHead("Trainin Batch");
					Project.setnoofResources(200);
		
		}
	

	}


