package by.htp.Aggregation.Task02;

public class CarLogic {

    public static void fillTank(Car car, double amountFuel) {
	car.setFuelLevel(car.getFuelLevel() + amountFuel);
    }
}
