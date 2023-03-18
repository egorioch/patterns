package org.example;

import builder.BusVehicleBuilder;
import builder.TaxiVehicleBuilder;
import director.Director;
import model.Vehicle;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        director.setVehicleBuilder(new TaxiVehicleBuilder());
        Vehicle taxi = director.buildVehicle();
        System.out.println(taxi.toString());

        director.setVehicleBuilder(new BusVehicleBuilder());
        Vehicle bus = director.buildVehicle();
        System.out.println(bus.toString());
    }


}