package builder;

import model.Driver;
import model.License;
import model.Passenger;

import java.util.ArrayList;

public class TaxiVehicleBuilder extends VehicleBuilder{

    @Override
    public void buildSeatForDriver() {
        vehicle.setSeatForDriver(1);
    }

    @Override
    public void buildQuantitySeatsForPassengers() {
        vehicle.setQuantitySeatsForPassengers(4);
    }

    @Override
    public void buildDriver() {
        Driver taxiDriver = new Driver();
        taxiDriver.setLicense(License.A);

        vehicle.setDriver(taxiDriver);
    }

    @Override
    public void buildPassengers() {
        ArrayList<Passenger> passengers = new ArrayList<>();

        vehicle.setPassengers(passengers);
    }
}
