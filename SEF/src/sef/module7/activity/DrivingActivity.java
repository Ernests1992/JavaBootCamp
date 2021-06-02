package sef.module7.activity;

public class DrivingActivity {
    public static void main(String[] args) {
        Moving car = new Car();
        Moving motorcycle = new Motorcycle();
        Driver driver = new Driver("Ernests");

        driver.setDriversMoving(car);
        driver.driverStartsDriving();

        driver.setDriversMoving(motorcycle);
        driver.driverStartsDriving();
    }
}
