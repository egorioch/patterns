package builder;

import exception.ExceptionRule;
import model.Driver;
import model.License;
import model.Passenger;
import model.TaxiDriver;
import util.SetSeatForPassengers;
import util.UserScanner;

import java.util.ArrayList;

public class TaxiVehicleBuilder extends VehicleBuilder{

    @Override
    public void buildSeatForDriver() {
        vehicle.setSeatForDriver(1);
    }

    /*@Override
    public void buildQuantitySeatsForPassengers() throws ExceptionRule {
        System.out.print("Введите число пассажиров: ");
        int quantityOfPassengers = Integer.parseInt(UserScanner.getString());

        if (quantityOfPassengers > 4)
            throw new ExceptionRule(String.format("Число пассажиров не может быть больше, чем %d", 4));

        vehicle.setQuantitySeatsForPassengers(quantityOfPassengers);
    }*/

    @Override
    public void buildDriver() {
        TaxiDriver.getDriver().setLicense(License.A);

        vehicle.setDriver(TaxiDriver.getDriver());
    }

    @Override
    public void buildPassengers() throws ExceptionRule {
        System.out.print("Введите число пассажиров: ");
        int quantityOfPassengers = Integer.parseInt(UserScanner.getString());

        if (quantityOfPassengers > 4)
            throw new ExceptionRule(String.format("Число пассажиров не может быть больше, чем %d", 30));

        ArrayList<Passenger> passengers = SetSeatForPassengers.setPassengers(quantityOfPassengers);

        vehicle.setPassengers(passengers);
    }
}
