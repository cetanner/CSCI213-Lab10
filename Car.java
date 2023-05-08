/**
 * Lab 10 Car class
 * @author Claire Tanner
 * 
 */
 
public class Car extends Vehicle {
    private int numDoors;
    private int numPassengers;

    public Car(String make, String model, String plate, int doors, int passengers) {
        super(make, model, plate);
        this.numDoors = doors;
        this.numPassengers = passengers;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public int getNumPassengers() {
        return this.numPassengers;
    }

    @Override
    public String toString() {
        return String.format("%d-door %s %s with license %s.", numDoors, getMake(), getModel(), getPlate());
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Car) {
            Car car = (Car) other;
            return this.numDoors == car.numDoors && this.numPassengers == car.numPassengers && super.equals(car);
        }
        return false;
    }

    public Car copy() {
        return new Car(getMake(), getModel(), getPlate(), numDoors, numPassengers);
    }
}
