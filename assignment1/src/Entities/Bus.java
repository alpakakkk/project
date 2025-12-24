package Entities;

public class Bus extends Vehicle {
    public Bus(String id, int capacity) {
        super(id, capacity);
    }

    @Override
    public void move() {
        System.out.println("Bus " + getId() + " is navigating through road traffic.");
    }
}
