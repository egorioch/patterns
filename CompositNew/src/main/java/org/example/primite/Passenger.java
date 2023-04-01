package org.example.primite;

import org.example.component.PersonOnBoard;

public class Passenger implements PersonOnBoard {
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
