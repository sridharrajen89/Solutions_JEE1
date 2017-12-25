package Exercise25;

public class Bike {
    private int bikeRegNo;
    private String bikeName;
    private int maxSpeed;
    private int currentSpeed;
    private int currentGear;

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

    public Bike(int bikeRegNo, String bikeName, int maxSpeed, int currentSpeed, int currentGear) {

        this.bikeRegNo = bikeRegNo;
        this.bikeName = bikeName;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.currentGear = currentGear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bike bike = (Bike) o;

        if (bikeRegNo != bike.bikeRegNo) return false;
        if (maxSpeed != bike.maxSpeed) return false;
        if (currentSpeed != bike.currentSpeed) return false;
        if (currentGear != bike.currentGear) return false;
        return bikeName != null ? bikeName.equals(bike.bikeName) : bike.bikeName == null;
    }

    @Override
    public int hashCode() {
        int result = bikeRegNo;
        result = 31 * result + (bikeName != null ? bikeName.hashCode() : 0);
        result = 31 * result + maxSpeed;
        result = 31 * result + currentSpeed;
        result = 31 * result + currentGear;
        return result;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeRegNo=" + bikeRegNo +
                ", bikeName='" + bikeName + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                ", currentGear=" + currentGear +
                '}';
    }

    public void applyBreak() {
        setCurrentSpeed(0);
        setCurrentGear(1);
    }

    public int accelarate(int speed){

        speed = getCurrentSpeed()+speed;

        setCurrentSpeed(speed);

        if (speed>=0 && speed <=10) {
            setCurrentGear(1);
        }
        else if (speed>=11 && speed <=20){
            setCurrentGear(2);
        }
        else if (speed>=21 && speed <=40){
            setCurrentGear(3);
        }
        else{
            setCurrentGear(4);
        }

        return getCurrentGear();
    }
}
