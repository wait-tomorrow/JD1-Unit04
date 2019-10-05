package by.htp.Aggregation.Task02;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля. 
 */

public class Task02 {

    public static void main(String[] args) {
	Car car = new Car("BMW", new Engine("petrol", 250), new Wheel(18), 34.2);
	car.ride();

	CarLogic.fillTank(car, 22);

	System.out.println(car.getBrand());
    }
}
