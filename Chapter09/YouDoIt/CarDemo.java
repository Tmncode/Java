package Chapter09.YouDoIt;

import Chapter09.YouDoIt.Car;

public class CarDemo {
    public static void main(String[] args) {
        Car firstCar = new Car(2014, Car.Model.MINIVAN, Car.Color.BLUE);
        Car secondCar = new Car(2017, Car.Model.CONVERTIBLE, Car.Color.RED);
        firstCar.display();
        secondCar.display();
    }
}
