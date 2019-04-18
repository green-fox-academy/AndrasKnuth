public class Station {
    int gasAmount;
    Station(int gasAmount){
        this.gasAmount = gasAmount;
    }

    private void refill(Car car){
        gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
        System.out.println(car.capacity);

    }

    public static void main(String[] args) {
        Car superCar = new Car();
        Station theBestStation = new Station(100);

        System.out.println(theBestStation.gasAmount);
        System.out.println(superCar.gasAmount);
        System.out.println(superCar.capacity);

        theBestStation.refill(superCar);

        System.out.println(theBestStation.gasAmount);
        System.out.println(superCar.gasAmount);
    }

}
/*Station:
 - gasAmount
 - refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
Car:
 - gasAmount
 - capacity
 - create constructor for Car where: initialize gasAmount -> 0
                                     initialize capacity -> 100 */