package org.patterns.component;

import org.patterns.primitive.Passenger;

import java.util.ArrayList;

public class First implements PersonOnBoard{
    private ArrayList<Passenger> passengers = new ArrayList<>();

    public void add(Passenger passenger) {
        passengers.add(passenger);
    }

    public void remove(Passenger passenger) {
        passengers.remove(passenger);
    }

    @Override
    public boolean correctWeight(double weight, double max) {
    }
}
