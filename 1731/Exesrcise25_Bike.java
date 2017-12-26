package htc.assignments;

public class Exesrcise25_Bike {

	public static void main(String[] args) {

		// creating an inatance of Bicycle 
		// doing some operations 
		Bicycle bike = new Bicycle();
		bike.applyBrakes();
		bike.speedUp(70,8);
		bike.changeGear(25);	}
}


++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package htc.assignments;

class Bicycle {

	private int bikeRegNo; 
	private String bikeName; 
	private int maxSpeed; 
	private int currentSpeed; 
	private int currentGear; 

	public Bicycle() {
		super();
		this.bikeRegNo = 0;
		this.bikeName = "";
		this.maxSpeed = 0;
		this.currentSpeed = 0;
		this.currentGear = 0;
	}

	public Bicycle(int bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear) {
		super();
		this.bikeRegNo = bikeRegNo;
		this.bikeName = bikeName;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
		this.currentGear = currentGear;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bikeRegNo;
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
		Bicycle other = (Bicycle) obj;
		if (bikeRegNo != other.bikeRegNo)
			return false;
		return true;
	}

	public int getBikeRegNo() {
		return bikeRegNo;
	}
	public void setBikeRegNo(int bikeRegNo) {
		this.bikeRegNo = bikeRegNo;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public int getCurrentGear() {
		return currentGear;
	}
	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public void applyBrakes()
	{
		currentSpeed = 0;
		currentGear = 1;
		System.out.println ("Current speed set to  " + currentSpeed + " for applying brakes");
		System.out.println ("Current gear set to  " + currentGear + " for applying brakes");
	}

	public void speedUp(int maxSpeed, int currentSpeed)
	{
		int parameter =  currentSpeed - maxSpeed;
		if (parameter >= 0)
		{
			currentSpeed = currentSpeed - parameter;	
			System.out.println("Reduce speed by  " + parameter);
		}
		else
		{
			currentSpeed = currentSpeed + parameter;
			System.out.println("Increase speed by  " + parameter);

		}
	}	
		
	public void changeGear(int currentSpeed)
	{
		if (currentSpeed >=0 && currentSpeed <11)
		{
			currentGear = 1;
			System.out.println ("Current Gear set to  " + currentGear + " as speed is " + currentSpeed);
		}
		else if (currentSpeed >10 && currentSpeed <21)
		{
			currentGear =2;
			System.out.println ("Current Gear set to  " + currentGear + " as speed is " + currentSpeed);
		}
		else if (currentSpeed >20 && currentSpeed <31)
		{
			currentGear =3;
			System.out.println ("Current Gear set to  " + currentGear + " as speed is " + currentSpeed);
		}
		else if (currentSpeed >40)
		{
			currentGear =4;
			System.out.println ("Current Gear set to  " + currentGear + " as speed is " + currentSpeed);
		}
		 
	}

}	  