public class Car {
    int capacity;
    int gasAmount;
    Car(){
        capacity = 100;
        gasAmount = 0;
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