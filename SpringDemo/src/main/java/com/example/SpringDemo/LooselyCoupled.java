package com.example.SpringDemo;

public class LooselyCoupled {

    public static void main(String[] args) {
       journey journey=new journey();
       cars1 cars1=new cars1();
       journey.setVehicles(cars1);
       journey.showVehicles();

       bikes1 bikes1=new bikes1();
       journey.setVehicles(bikes1);
       journey.showVehicles();

    }
}

class journey {
    vehicles vehicles;

    public com.example.SpringDemo.vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(com.example.SpringDemo.vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public void showVehicles(){
        vehicles.display();
    }
}

interface vehicles {
    void display();

}

class cars1 implements vehicles {
    public void display() {
        System.out.println("Car class");
    }

}

class bikes1 implements vehicles {
    public void display() {
        System.out.println("Bike class");
    }

}
