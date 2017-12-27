package com.htcinc.weekone;

public class Trainee {
    int traineeId; 
    String traineeName; 
    int contactNo;
    String email;
    String gender;
    int age;   

    Trainee(int traineeId,String traineeName, int contactNo, String email, String gender, int age) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.contactNo = contactNo;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    public String toString ()
    {
       return "Trainee[traineeId="+traineeId+",traineeName="+traineeName+",contactNo="+contactNo+",email="+email+",gender="+gender+",age="+age;
    }
}

class Batch 
{
   private String batchCode;
   private String startDate;
   private String endDate;
   private Trainee [] trainees;
   Batch (String batchCode, String startDate, String endDate, Trainee [] trainees)
   {
      this.batchCode = batchCode;
      this.startDate = startDate;
      this.endDate = endDate;
      this.trainees = trainees;
   }
 
   public Trainee getTrainee(Trainee traineeId) 
   {
	   return traineeId;
   }
   public Trainee[] getTrainees(Trainee[] gender)
   {
	   return gender;
   }

public int getTrainee(int traineeId) {
	// TODO Auto-generated method stub
	return traineeId;
}
}
class Training
{
   public static void main (String [] args)
   {
      Trainee [] trainees = { new Trainee (1000,"Sreeram",309807,"ram.sree@test.com","male",42), new Trainee (1001,"Sairam",91234,"sai.ram@test.com","male",35) };
      Batch b = new Batch ("b1","12/03/2015","15/05/2016", trainees);
      System.out.println (b.getTrainee(1)+ "Trainee id details:\n");
      System.out.println (b.getTrainees(trainees)+ "Trainee gender details:\n");
      
   }
}