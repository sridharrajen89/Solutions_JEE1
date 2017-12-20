package excercise2;

public class Project {
	int projectID; 
	String projectName;
	String projectHead;
	int noOfResources;
	
	public Project() {
		super();
	}

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
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
	public String toString() {
		return "Project [projectID=" + projectID + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}

	public static void main(String args[]) {
		Project project = new Project();
		project.setProjectID(123);
		project.setProjectName("My First Java Project");
		project.setProjectHead("HTC");
		project.setNoOfResources(100);
		
		System.out.println("------Project details------: "+project);
		
	}
}
