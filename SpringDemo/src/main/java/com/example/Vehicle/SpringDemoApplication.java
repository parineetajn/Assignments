package com.example.Vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext= SpringApplication.run(SpringDemoApplication.class, args);
		VehicleType vehicleType = applicationContext.getBean(VehicleType.class);
		vehicleType.getVehicle().show();


	}

}
