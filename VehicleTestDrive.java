/**
 * Creates two vehicles and displays them.
 * This class was created for in-class mini-team challenge in week 3
 *
 * @author Paula Waite
 */
public class VehicleTestDrive {
    /**
     * Instantiate a vehicle
     * Assign values for year, make, model and wheel diameter
     * Call the display method on the vehicle
     *
     * Expected output: The vehicle is a black 2012 Toyota 4Runner with 20.0-inch wheels
     *
     * @param args command line arguments (not used in this case)
     */

        // instantiate a vehicle
        Vehicle myVehicle = new Vehicle();

        // set instance variable values using dot notation
        myvehicle.make = "Toyota";
        myvehicle.model = 4Runner;
        myvehicle.year(2012);
        myvehicle.DiameterOfWheel = 20.0;

        // call the display method on the vehicle
        myVehicle.disply();


}
