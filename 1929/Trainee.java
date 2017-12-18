package com.htc.week1;

public class Trainee {

		int traineeid;
		String traineename;
		int contactnum;
		String email;
		String gender;
		int age;
		
		public Trainee(int traineeid, String traineename, int contactnum, String email, String gender, int age) {
			super();
			this.traineeid = traineeid;
			this.traineename = traineename;
			this.contactnum = contactnum;
			this.email = email;
			this.gender = gender;
			this.age = age;
		}

		public Trainee() {
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "Trainee [traineeid=" + traineeid + ", traineename=" + traineename + ", contactnum=" + contactnum
					+ ", email=" + email + ", gender=" + gender + ", age=" + age + "]";
		}
		
		
		
	}

