package builder;

import exception.ExceptionRule;
import model.Vehicle;

public abstract class VehicleBuilder {
    Vehicle vehicle;

    public void createVehicle() {
        this.vehicle = new Vehicle();
    }

    public abstract void buildSeatForDriver();
    //public abstract void buildQuantitySeatsForPassengers() throws ExceptionRule;
    public abstract void buildDriver();
    public abstract void buildPassengers() throws ExceptionRule;

    public Vehicle getVehicle() {
        return this.vehicle;
    }

}
