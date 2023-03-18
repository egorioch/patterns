package model;

public class BusDriver extends Driver {
    private static Driver driver;

    public static synchronized Driver getDriver() {
        if(driver == null) {
            driver = new BusDriver();
        }

        return driver;
    };

    private BusDriver() {
        super();
    };
}
