package com.htc.test;

public class Project {
	
	String projectName;
	String projectHead;
	int noOfResources;
	int projectId;
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	/**
	 * @return the projectHead
	 */
	public String getProjectHead() {
		return projectHead;
	}
	/**
	 * @param projectHead the projectHead to set
	 */
	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}
	/**
	 * @return the noOfResources
	 */
	public int getNoOfResources() {
		return noOfResources;
	}
	/**
	 * @param noOfResources the noOfResources to set
	 */
	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfResources;
		result = prime * result + ((projectHead == null) ? 0 : projectHead.hashCode());
		result = prime * result + projectId;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", projectHead=" + projectHead + ", noOfResources="
				+ noOfResources + ", projectId=" + projectId + "]";
	}
	
	

}
