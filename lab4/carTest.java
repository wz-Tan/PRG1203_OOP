package lab4;

import java.util.ArrayList;

public class carTest {

    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        Car car1 = new Car("Toyota", "Blue", 6, 90);
        Car car2 = new Car("Hyundai", "Green", 3, 20);

        System.err.println(car1);

        car1.setBrand("Mercedes");
        car1.setColour("Red");
        car1.setEngine_size(9);
        car1.setSpeed(50);
        System.out.println(car1);

        car2.accelerate();
        System.out.println(car2);
        car2.decelerate();
        System.out.println(car2);
        car2.stop();
        System.out.println(car2);

        carList.add(car1);
        carList.add(car2);

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
