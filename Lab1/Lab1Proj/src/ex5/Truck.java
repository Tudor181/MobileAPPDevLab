package ex5;

public class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if (weight > 2000)
            return super.getSalePrice() * 0.9;
        else
            return super.getSalePrice() * 0.8;
    }
}