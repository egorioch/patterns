package director;

import builder.VehicleBuilder;
import exception.ExceptionRule;
import model.Vehicle;

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
            vehicleBuilder.buildQuantitySeatsForPassengers();
        } catch (ExceptionRule exceptionRule){
            System.out.println(exceptionRule.getMessage());
        }

        return vehicleBuilder.getVehicle();
    }

}
