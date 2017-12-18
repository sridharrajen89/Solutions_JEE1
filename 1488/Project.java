package com.htc.oops;

//Project Demo - Entity class, Setters & Getters
import java.util.*;
import java.io.Serializable;


public class Project implements Serializable {

	private int projectId;
	private String projectName;
	private String projectHead;
	private int noOfResources;
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



}

