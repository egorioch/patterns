package builder;

import model.Vehicle;

public abstract class VehicleBuilder {
    Vehicle vehicle;

    void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    abstract void buildSeatForDriver();
    abstract void buildQuantitySeatsForPassengers();
    abstract void buildDriver();
    abstract void buildPassengers();

}
