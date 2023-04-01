package org.example.composite;

import org.example.component.PersonOnBoard;
import org.example.primite.Passenger;

import java.util.ArrayList;

//composite
public class PassengerType implements PersonOnBoard {
    private ArrayList<Passenger> passengerTypeList;

    public PassengerType(ArrayList<Passenger> passengerTypeList) {
        this.passengerTypeList = passengerTypeList;
    }

    @Override
    public void getWeight() {
        for (var passenger: passengerTypeList) {
            passenger.getWeight();
        }
    }

    public void addFirst(Passenger first) {
        passengerTypeList.add(first);
    }

    public void removeEconomy(Passenger passenger) {
        passengerTypeList.remove(passenger);
    }

}
