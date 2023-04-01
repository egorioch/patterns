package org.example.composite;

import org.example.component.PersonOnBoard;
import org.example.primite.Passenger;
import org.example.primite.Pilot;
import org.example.primite.Stewardess;

import java.util.ArrayList;
import java.util.HashMap;

public class Plane implements PersonOnBoard {
    private ArrayList<Passenger> firstList;
    private ArrayList<Passenger> businessList;
    private ArrayList<Passenger> economyList;
    private ArrayList<Pilot> pilots;
    private ArrayList<Stewardess> stewardesses;

    private HashMap<String, Double> seatAndWeight = new HashMap<>();

    public Plane(
            ArrayList<Passenger> firstList,
            ArrayList<Passenger> businessList,
            ArrayList<Passenger> economyList,
            ArrayList<Pilot> pilots,
            ArrayList<Stewardess> stewardesses

    ) {
        this.firstList = firstList;
        this.businessList = businessList;
        this.economyList = economyList;
        this.pilots = pilots;
        this.stewardesses = stewardesses;
    }

    @Override
    public double getWeight() {
        createMapRecord(firstList, 60,"F");
        createMapRecord(businessList, 35, "B");
        createMapRecord(businessList, 20, "E");
    }

    public void createMapRecord(ArrayList<Passenger> passengers, double weight, String typeName) {
        String overweight = "";
        double total_weight = 0;

        for (int i = 0; i < passengers.size(); i++) {
            weight = passengers.get(i).getWeight();
            if (weight > 60) {
                overweight = "; перегруз; ";
            } else {
                overweight = "";
            }
            total_weight += total_weight;
            seatAndWeight.put(i + typeName + overweight, weight);
        }
    }
}
