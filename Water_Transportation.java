/**
 * Name: Haley Goldberg and Torin Stremlau
 * Date: 10/25/2024
 * Purpose: The purpose of this file is to create a subclass of Transportation that creates more specific instances
 * of transportation. The classes that will inherit this class will be transportation that travels by water. This
 * class has private variables dock, loadingTime, marina, and departureTime. Its constructor has its parameters as well
 * as its super class, Transportation, parameters. The super class is called first, then its parameters are defined.
 * There are getter and setter methods for each of its variables.
 * get_arrival_info(): This method allows us to easily display the arrival information to the user. each subclass of
 *                     Water_Transportation will then be able to easily display its arrival information. Since all
 *                     methods of water transportation will have a dock and a marina, we included this info in this
 *                     class. This method has no parameters and returns a String that displays instructions to the user.
 * toString(): This method overrides the toString() method and displays information that can fit into a table to be
 *             displayed to the user. This method has no parameters and returns a formatted String.
 * getName(): This method will display the name of the subclasses to allow for user readability in the table. It has
 *            no parameters and returns a String.
 */
public class Water_Transportation extends Transportation{
    // private variables dock, loadingTime, marina, and departureTime
    private String dock;
    private String loadingTime;
    private String marina;
    private String departureTime;
    
    // Water_Transportation constructor
    public Water_Transportation(String dock, String loadingTime, String marina, String departureTime, double purchasePrice,
                                double rentalPrice, double averageSpeed, int numPassengers){
        // call the super first
        super(purchasePrice, rentalPrice, averageSpeed, numPassengers);
        // define parameters
        this.dock = dock;
        this.loadingTime = loadingTime;
        this.marina = marina;
        this.departureTime = departureTime;
    }
    // getter methods
    public String getDock(){return this.dock;}
    public String getLoadingTime() {return this.loadingTime;}
    public String getMarina() {return marina;}
    public String getDepartureTime() { return this.departureTime; }
    
    // setter methods
    public void setDock(String dock){this.dock = dock;}
    public void setLoadingTime(String loadingTime) {this.loadingTime=loadingTime;}
    public void setMarina(String marina) { this.marina=marina;}
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }

    @Override
    public String get_arrival_info(){
        // display the arrival information for Water_Transportation by using getters
        return "Arrive at " + getMarina() + " and wait at " + getDock() + " to be picked up at " + getDepartureTime();
    }

    @Override
    public String toString() {
        // format the toString by calling super.toString() and then a formatted string to make a table w/ info
        // use getters to get the info
        return super.toString() + String.format("%n%n|%-20s|%-20s|%-20s|%-20s|%n|%-20s|%-20s|%-20s|%-20s|", "Marina:", "Dock:",
                "Loading Time:", "Departure Time:", getMarina(), getDock(), getLoadingTime(), getDepartureTime());
    }

    public String getName(){
        // for now, empty b/c it will later be the name of the subclasses to display to the user
        return "";
    };

}
