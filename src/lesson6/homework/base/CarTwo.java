package lesson6.homework.base;

public class CarTwo extends Car {
    int loadCapacity;

    public CarTwo(String brand, int loadCapacity) {
        super(brand);
        this.loadCapacity = loadCapacity;
    }

    public String toString() {
        return "brand = " + brand +
                " load capacity = " + loadCapacity;
    }
}
