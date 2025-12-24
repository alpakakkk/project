package Entities;

public class Train extends Vehicle {
    public Train(String id, int capacity) {
        super(id, capacity);
    }

    @Override
    public void move() {
        System.out.println("Train " + getId() + " is moving along the rail tracks.");
    }
}