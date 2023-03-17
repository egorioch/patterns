package model;

import java.util.ArrayList;

public class Vehicle {
    private int seatForDriver;
    private int quantitySeatsForPassengers;
    private Driver driver;
    private ArrayList<Passenger> passengers;

    public void setSeatForDriver(int seatForDriver) {
        this.seatForDriver = seatForDriver;
    }

    public void setQuantitySeatsForPassengers(int quantitySeatsForPassengers) {
        this.quantitySeatsForPassengers = quantitySeatsForPassengers;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
