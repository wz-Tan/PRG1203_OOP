package lecture4;

public class Car {

    private int passengerNum = 0;

    // Constructor
    public Car() {
        passengerNum = 67;
    }

    public void drive() {
        System.err.println("TIME TO DRINK AND DRIVE");
    }

    public void addPassenger() {
        passengerNum++;
    }

    public int getPassenger() {
        return passengerNum;
    }
}
