package htc.exercises.week1;

public class Project {

	int projectId;
	String projectName;
	String projectHead;
	int noOfResources;

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

	public static void main(String[] args) {

		Project project = new Project();

		project.setProjectId(12345);
		project.setProjectHead("Prabakaran");
		project.setProjectName("HTC Training");
		project.setNoOfResources(15);

		System.out.println("Project ID: " + project.getProjectId());
		System.out.println("Project Name: " + project.getProjectName());
		System.out.println("Project Head: " + project.getProjectHead());
		System.out.println("No Of Resources in Project: " + project.getNoOfResources());

	}

}
