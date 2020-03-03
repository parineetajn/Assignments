package com.example.Vehicle;


public class VehicleType {

    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void showVehicles(){
        vehicle.show();
    }
}
