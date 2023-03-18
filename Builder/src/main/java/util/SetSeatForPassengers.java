package util;

import model.Passenger;
import model.Role;

import java.util.ArrayList;

public class SetSeatForPassengers {
    private static ArrayList<Passenger> passengers = new ArrayList<>();

    public static ArrayList<Passenger> setPassengers(int quantity) {

        for (int i = 0; i < quantity; i++) {

            Passenger passenger = new Passenger();
            passenger.setRole(getRole((int) (Math.random() * 3)));
            passengers.add(passenger);
        }

        return passengers;
    }

    private static Role getRole(int role) {
        switch (role) {
            case 0 -> {
                return Role.ADULT;
            }
            case 1 -> {
                return Role.PREFERENTIAL;
            }
            case 2 -> {
                return Role.KID;
            }
        }

        return null;
    }

    public static boolean kidSeat() {
        for (var passenger : passengers) {
            if (passenger.getRole() == Role.KID) {
                return true;
            }
        }

        return false;
    }
}
