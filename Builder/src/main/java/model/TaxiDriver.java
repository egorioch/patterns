package model;

public class TaxiDriver extends Driver {
    private static Driver driver;

    public static synchronized Driver getDriver() {
        if(driver == null) {
            driver = new TaxiDriver();
        }

        return driver;
    };

    private TaxiDriver() {
        super();
    }
}
