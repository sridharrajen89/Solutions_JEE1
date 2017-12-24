package com.htc.test;


public class Batch {

		String batchCode;
        String startDate;
        String endDate;
        Trainee trainees[]= {new Trainee(1,"m"),new Trainee(2,"f"),new Trainee(3,"m")};
        
        
        public Trainee getTrainee(int traineeId) throws TraineeNotFoundException{
        	
        	for(Trainee trainee:trainees) {
        		if(trainee.getTraineeId()==traineeId)
        			return trainee;
        	}
        	return null;
        }
        public Trainee[] getTrainees(String gender) {
        	
        	Trainee traineesArr[]= new Trainee[4];
        	
        	for(Trainee trainee:trainees) {
        		if(trainee.getGender()==gender)
        			traineesArr[0]= trainee;
        			return traineesArr;
        	}
        	return null;
        	
        }

}
