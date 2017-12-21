package com.htcinc.oops;
/*
  (i) Create an entity class named Project with member variables as projectId,
         projectName, projectHead, noOfResources.
 (ii) Create an object for the Project class and through setters assign the values
             for all the member variables.
 (iii) Print the corresponding object
*/

import java.io.Serializable;

public class Project implements Serializable{
	
	private static final long serialVersionUID = -1857512699957536678L;

	private int projectId; 
	private String projectName;
	private String projectHead;
	private int noOfResources;
	
	public Project() {
		
	}
	
	public Project(int projectId, String projectName, String projectHead, int noOfResources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectHead() {
		return projectHead;
	}

	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}

	public int getNoOfResources() {
		return noOfResources;
	}

	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		//int result = 1;
		
		// Updated result to hold projectId as projectId would be unique
		int result = projectId;
		result = prime * result + noOfResources;
		result = prime * result + ((projectHead == null) ? 0 : projectHead.hashCode());
		//result = prime * result + projectId;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
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
		if (noOfResources != other.noOfResources)
			return false;
		if (projectHead == null) {
			if (other.projectHead != null)
				return false;
		} else if (!projectHead.equals(other.projectHead))
			return false;
		if (projectId != other.projectId)
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}


}
