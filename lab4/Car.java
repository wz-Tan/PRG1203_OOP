package lab4;

public class Car {

    private String brand;
    private String colour;
    private int engine_size;
    private int speed;

    public Car() {}

    public Car(String b, String c, int e, int s) {
        brand = b;
        colour = c;
        engine_size = e;
        speed = s;
    }

    public String toString() {
        return (
            "The car with brand " +
            brand +
            ", colour " +
            colour +
            ", engine size " +
            engine_size +
            " is running at speed " +
            speed
        );
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String b) {
        brand = b;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String c) {
        colour = c;
    }

    public int getEngine_size() {
        return engine_size;
    }

    public void setEngine_size(int e) {
        engine_size = e;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public void accelerate() {
        speed++;
    }

    public void decelerate() {
        speed--;
    }

    public void stop() {
        speed = 0;
    }
}
