package builder;

import model.Driver;
import model.License;
import model.Passenger;

import java.util.ArrayList;

public class BusVehicleBuilder extends VehicleBuilder{
    @Override
    public void buildSeatForDriver() {
        vehicle.setSeatForDriver(1);
    }

    @Override
    public void buildQuantitySeatsForPassengers() {
        vehicle.setQuantitySeatsForPassengers(30);
    }

    @Override
    public void buildDriver() {
        Driver busDriver = new Driver();
        busDriver.setLicense(License.D);

        vehicle.setDriver(busDriver);
    }

    @Override
    public void buildPassengers() {
        ArrayList<Passenger> passengers = new ArrayList<>();

        vehicle.setPassengers(passengers);
    }
}
