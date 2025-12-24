package Entities;

import java.util.ArrayList;
import java.util.List;

public class TransportPlatform {
    private String city;
    private List<Vehicle> fleet;

    public TransportPlatform(String city) {
        this.city = city;
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        fleet.add(v);
    }

    public void updateLocation(String vehicleId, String stationName) {
        for (Vehicle v : fleet) {
            if (v.getId().equals(vehicleId)) {
                v.setCurrentStation(stationName);
                System.out.println("Update: " + v.getId() + " arrived at " + stationName);
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    public void showStatus() {
        System.out.println("\n--- " + city + " Transport Status ---");
        for (Vehicle v : fleet) {
            System.out.println(v);
        }
    }
}
