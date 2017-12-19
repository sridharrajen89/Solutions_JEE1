package com.htc.corejava.trainingexcerise.week1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Project implements Serializable {

	private int projectId;
	private String projectName;
	private String projectHead;
	private int noOfResources;
	
	public Project () {
		// TODO Auto-generated constructor stub
		projectId = 0;
		projectName = "NULL";
		projectHead = "NULL";
		noOfResources = 0;
	}
	
	public Project (int projectId, String projectName, String projectHead, int noOfResources ) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
	}

	public int getprojectId() {
		return projectId;
	}

	public void setprojectId(int projectId) {
		this.projectId = projectId;
	}

	public String getprojectName() {
		return projectName;
	}

	public void setprojectName(String projectName) {
		this.projectName = projectName;
	}

	public String getprojectHead() {
		return projectHead;
	}

	public void setprojectHead(String projectHead) {
		this.projectHead = projectHead;
	}

	public int getnoOfResources() {
		return noOfResources;
	}

	public void setnoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName 
				+ ", projectHead=" + projectHead + ", noOfResources=" + noOfResources + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + projectId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (projectId != other.projectId)
			return false;
		return true;
	}
}