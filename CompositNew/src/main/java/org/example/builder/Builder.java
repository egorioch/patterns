package org.example.builder;

import org.example.primite.Passenger;
import org.example.primite.Pilot;
import org.example.primite.Stewardess;

import java.util.ArrayList;

public class Builder {
    ArrayList<Passenger> firstList = new ArrayList<>();
    ArrayList<Passenger> businessList = new ArrayList<>();
    ArrayList<Passenger> economyList = new ArrayList<>();
    ArrayList<Pilot> pilots = new ArrayList<>();
    ArrayList<Stewardess> stewardesses = new ArrayList<>();

    public void addFirstType(int quantity) {
        for (int i = 0; i < quantity; i++) {
            Passenger passenger = new Passenger();
            passenger.setWeight(Math.round(Math.random() * 60));

            firstList.add(passenger);
        }
    }
}
