package com.htc.assignments;

	public class Project {
		private int projectId;
		private String projectName;
		private String projectHead;
		private int resourcesNumber;
		
		//Default Constructor
		public Project() {
			projectId = 0;
			projectName = " ";
			projectHead = " ";
			resourcesNumber = 0;
			}
		
		//Constructor
		public Project(int projectId, String projectName, String projectHead, int resourcesNumber) {
			super();
			this.projectId = projectId;
			this.projectName = projectName;
			this.projectHead= projectHead;
			this.resourcesNumber = resourcesNumber;
		}
		
		public int getProjectId() {
			return projectId;
		}
		public  void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		
		public String getprojectName() {
			return projectName;
		}
		public  void setprojectName(String projectName) {
			this.projectName = projectName;
		}

		public String getprojectHead() {
			return projectHead;
		}
		public  void setprojectHead(String projectHead) {
			this.projectHead = projectHead;
		}

		public int getresourcesNumber() {
			return resourcesNumber;
		}
		public void setresourcesNumber(int resourcesNumber) {
			this.resourcesNumber = resourcesNumber;
		}

		@Override
			public String toString() {
			return "EntityClass [Project Id=" + projectId + ", Project Name =" + projectName + ", Project Head=" + projectHead 
					+ ", "	+ " Total Resources " +resourcesNumber+"]";
		}

	}


