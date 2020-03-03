package com.example.Vehicle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class VehicleConfig
{
    @Bean
    @Primary
    VehicleType vehicleType()
    {
        VehicleType vehicleType=new VehicleType();
        vehicleType.setVehicle(new Car());
        return vehicleType;
    }
    @Bean
    VehicleType vehicleType2()
    {
        VehicleType vehicleType=new VehicleType();
        vehicleType.setVehicle(new Bike());
        return vehicleType;
    }

}
