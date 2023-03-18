package model;

import exception.ExceptionRule;
import util.UserScanner;

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

    @Override
    public String toString() {
        return "Vehicle{" +
                "seatForDriver=" + seatForDriver +
                ", quantitySeatsForPassengers=" + quantitySeatsForPassengers +
                ", driver=" + driver
                + String.format("(license: %s)", driver.getLicense()) +
                ", passengers=" + passengers +
                '}';
    }
}
