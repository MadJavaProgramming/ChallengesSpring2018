/**
 * Class representing a vehicle which could be a car, truck, motorcycle, etc.
 * This class was created for in-class mini-team challenge in week 3
 *
 * @author Paula Waite
 */
public class Vehicle {
    double wheelDiameter; // in inches
    String make;
    String model;
    int year;
    String color;

    /**
     * Prints out a description of the vehicle: color, year, make, model and wheel diameter.
     */
    public void display() {
        String vehicleDesctiption = "The vehicle is a " + year + " " + make + " " + model + " with wheelDiameter -inch wheels";
        System.out.println(color);
    }

}
