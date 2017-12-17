/**
 * 
 */
package com.test;
import java.io.*;

/**
 * @author Ramkey_IBM_PC
 * Follow the given instructions and create an application using Java.  
 *  (i) Create an entity class named Project with member variables as projectId, projectName, projectHead, 
 *  noOfResources.  
 *  (ii) Create an object for the Project class and through setters assign the values for all the member variables.   
 *  (iii) Print the corresponding object. 
 */
public class Project implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int projectId;
	private String projectName;
	private String projectHead; 
	private int noOfResources;
	/**
	 * Default Constructor
	 */
	public Project() {
		super();
		this.projectId = 0;
		this.projectName = "";
		this.projectHead = "";
		this.noOfResources = 0;
	}
	/**
	 * Overloaded Constructor
	 * @param projectId
	 * @param projectName
	 * @param projectHead
	 * @param noOfResources
	 */
	public Project(int projectId, String projectName, String projectHead, int noOfResources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
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
		result = prime * result + projectId;
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
		if (projectId != other.projectId)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}
	
	/*
	 * To test Exercise #2 - Project Class
	 */
	public static void main(String[] args) {
		Project javaProject = new Project ();
		
		javaProject.setProjectId(100);
		javaProject.setProjectName("Java");
		javaProject.setProjectHead("Jennie");
		javaProject.setNoOfResources(20);

		System.out.println(javaProject);
	}
	
	
}
