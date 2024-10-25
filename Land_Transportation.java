/**
 * Name: Haley Goldberg and Torin Stremlau
 * Date: 10/25/2024
 * Purpose: The purpose of this file is to create a subclass of Transportation, Land_Transportation, that will allow
 * for more specific instances of Transportation. These instances will be transportation methods specific to land.
 * Land_Transportation has one variable, fuelType, which specifies the fuel required for these classes. Its
 * constructor has the parameters fuelType and its parents' parameters, purchasePrice, rentalPrice, averageSpeed,
 * and numPassengers. Its parent class is called in the constructor and then its parameters are defined. There is a
 * getter and setter method for fuelType. There are no more variables in this class such as a pickup location or
 * departureTime b/c the subclasses will have varying types of pickup locations that cannot be generalized in this
 * class. For example, a Car will have a pickup location but a Train will have a train station.
 * toString(): The method toString() is overridden to allow for the table format when printed. The parent class'
 *             toString() is called and combined with the formatted String that displays fuel type.
 * get_arrival_info(): This method is called here b/c it will later be used by subclasses of Land_Transportation to
 *                     easily display the arrival information the user needs.
 * getName(): This method will be used to get the name of the subclasses to help display the information to the user.
 */

public class Land_Transportation extends Transportation {
    // Fuel type: will be diesel, biodiesel, electric, or None which can only be represented by String.
    private String fuelType;

    // This constructor calls the super constructor and then defines its variables.
    public Land_Transportation(double purchasePrice, double rentalPrice,
                               double averageSpeed, int numPassengers, String fuelType){
        super(purchasePrice, rentalPrice, averageSpeed, numPassengers);
        this.fuelType = fuelType;

    }

    // setter method
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    // getter method
    public String getFuelType() { return this.fuelType; }


    @Override
    public String toString() {
        // override the toString() method. Call the super's toString() and then display the info in a table format
        return super.toString() + String.format("%n%n|%-20s|%n|%-20s|", "Fuel-Type: ", getFuelType());
    }

    public String get_arrival_info(){
        // we have the get_arrival_info() to be inherited by the subclasses, but it is empty b/c, as mentioned above,
        // the subclasses will have varying types of arrival locations that can't be inherited uniformly.
        return "";
    }
    // this method will be used by subclasses to get the name of the class to be displayed for the user.
    public String getName(){return super.getName();}
}
