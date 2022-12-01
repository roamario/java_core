package lesson6.homework.base;

public class CarOne extends Car {
    int speed;

    public CarOne(String brand, int speed) {
        super(brand);
        this.speed = speed;
    }

    public String toString() {
        return "brand = " + brand +
        " speed = " + speed;

    }
}
