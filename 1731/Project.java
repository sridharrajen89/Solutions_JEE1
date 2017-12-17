package htc.test;

import java.io.Serializable;

public class Project extends Object implements Serializable {
	
	private int projectId;
	private String projectName;
	private String projectHead;
	private int resources;
	
//	public EntityClass() {
//		super();
//		projectId = 101;
//		projectName = "Vijay";
//		contactNo = 309664562;
//		projectHead= "test@gmail.com";
//		gender="Male";
//		resources= 16;
//	}
	
	public Project(int projectId, String projectName, String projectHead, int resources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead= projectHead;
		this.resources= resources;
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

	public int getresources() {
		return resources;
	}
	public void setresources(int resources) {
		this.resources = resources;
	}

	@Override
	public String toString() {
		return "EntityClass [Project Id=" +projectId +", Project Name ="+projectName+", Project Head=" + projectHead+", Total Number of Resources is " +resources+"]";
	}

}
