package lecture4;

public class TestCar {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.drive();
        car1.addPassenger();
        car1.addPassenger();
        System.err.println(
            "The number of passengers in the car is " + car1.getPassenger()
        );
    }
}
