package Entities;

public abstract class Vehicle {
    private String id;
    private int capacity;
    private String currentStation;

    public Vehicle(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getId() { return id; }
    public String getCurrentStation() { return currentStation; }
    public void setCurrentStation(String station) { this.currentStation = station; }

    public abstract void move();

    @Override
    public String toString() {
        return "Vehicle " + id + " [Capacity: " + capacity + ", At: " + currentStation + "]";
    }
}
