package director;

import builder.VehicleBuilder;
import exception.ExceptionRule;
import model.Vehicle;
import util.SetSeatForPassengers;

public class Director {
    VehicleBuilder vehicleBuilder;

    public void setVehicleBuilder(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    public Vehicle buildVehicle() {
        vehicleBuilder.createVehicle();

        try {
            vehicleBuilder.buildSeatForDriver();
            vehicleBuilder.buildPassengers();
            vehicleBuilder.buildDriver();
        } catch (ExceptionRule exceptionRule){
            System.out.println(exceptionRule.getMessage());
        }

        Vehicle vehicle = vehicleBuilder.getVehicle();
        vehicle.setKidSeat(SetSeatForPassengers.kidSeat());
        return vehicle;
    }

}
