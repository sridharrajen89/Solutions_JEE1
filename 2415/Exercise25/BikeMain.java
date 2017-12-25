package Exercise25;

public class BikeMain {

    public static void main(String[] args) {

        Bike bike;
        bike = new Bike(100, "ladybird", 100, 20, 2);
        System.out.println("Before Accelerate: " + bike);
        bike.accelarate(35);
        System.out.println("After Accelerate:: " + bike);
        bike.applyBreak();
        System.out.println("After Brake:: " + bike);
    }
}