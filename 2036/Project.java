package test.com;

public class Project {
  private int projectId;
  private String projectName;
  private String projectHead;
  private int noOfResources;
    

//setters 

  
public void setProjectId(int projectId) {
	this.projectId = projectId;
}


public void setProjectName(String projectName) {
	this.projectName = projectName;
}


public void setProjectHead(String projectHead) {
	this.projectHead = projectHead;
}


public void setNoOfResources(int noOfResources) {
	this.noOfResources = noOfResources;
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Project isuuniversity=new Project();
	isuuniversity.setProjectId(2036);
	isuuniversity.setProjectName("Java project");
	isuuniversity.setProjectHead("ssn");
	isuuniversity.setNoOfResources(10);
	
	System.out.println(isuuniversity);
	
}
}