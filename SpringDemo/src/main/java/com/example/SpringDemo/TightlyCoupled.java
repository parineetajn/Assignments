package com.example.SpringDemo;

public class TightlyCoupled {
    cars cars=new cars();
    void setVehicles()
    {
       cars.display();
    }
    public static void main(String[] args) {
        TightlyCoupled tightlyCoupled = new TightlyCoupled();
        tightlyCoupled.setVehicles();
    }
}

class cars{
    public void display()
    {
        System.out.println("Car class");
    }

}

class bikes{
    public void display()
    {
        System.out.println("Bike class");
    }

}
