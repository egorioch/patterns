package builder;

import exception.ExceptionRule;
import model.BusDriver;
import model.Driver;
import model.License;
import model.Passenger;
import util.UserScanner;

import java.util.ArrayList;

public class BusVehicleBuilder extends VehicleBuilder{
    @Override
    public void buildSeatForDriver() {
        vehicle.setSeatForDriver(1);
    }

    @Override
    public void buildQuantitySeatsForPassengers() throws ExceptionRule {
        System.out.print("Введите число пассажиров: ");
        int quantityOfPassengers = Integer.parseInt(UserScanner.getString());

        if (quantityOfPassengers > 30)
            throw new ExceptionRule(String.format("Число пассажиров не может быть больше, чем %d", 30));

        vehicle.setQuantitySeatsForPassengers(quantityOfPassengers);
    }

    @Override
    public void buildDriver() {
        BusDriver.getDriver().setLicense(License.D);

        vehicle.setDriver(BusDriver.getDriver());
    }

    @Override
    public void buildPassengers() {
        ArrayList<Passenger> passengers = new ArrayList<>();

        vehicle.setPassengers(passengers);
    }
}
