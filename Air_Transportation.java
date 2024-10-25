/**
 * Name: Haley Goldberg and Torin Stremlau
 * Date: 10/25/2024
 * Purpose: The purpose of this file is to create a subclass of the Transportation class, called Air_Transportation
 * that will create more specific instances of Transportation that travel by air. This class has variables airport,
 * departureTime, airline, and arrivalTime. This class also inherits the vars from Transportation. It also has getter
 * and setter methods for each of its variables and inherits getters and setters from its parent class, Transportation.
 * The toString() method is Overridden to display info about each air transportation. Additionally, there is a
 * get_arrival_info method to display arrival information. There is also a getName() method that will later return the
 * name of the subclasses of air transportation.
 * toString(): Override the toString() method to display Air_Transportation's information, airport and departureTime.
 *           Call the parent class, Transportation, toString() method as well to display all the information about
 *           Air_Transportation.
 * get_arrival_info(): This method will allow for easy access to arrival information for all air transportations
 *                     subclasses. it uses getters to display the arrival time and airport to the user
 * getName(): This method will be useful for subclasses of AIr_Transportation when displaying the name of the subclass
 *            to the user.
 */

// This is the main class Air_Trans. that extends its parent class
public class Air_Transportation extends Transportation{
    /**
     * private variables airport, departureTime, airline, and arrivalTime. The constructor has these parameters
     * as well as its parent class' parameters, Transportation.
     */
    // private variables
    private String airport;
    private String departureTime;
    private String airline;
    private String arrivalTime;

    // class constructor, has its own parameters as well as parent class parameters
    Air_Transportation(String airport, String airline, String departureTime, String arrivalTime,
                       double purchasePrice, double rentalPrice, double averageSpeed, int numPassengers){
        // call the parent class
        super(purchasePrice, rentalPrice, averageSpeed, numPassengers);
        this.airport = airport;
        this.airline = airline;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    // getter methods
    public String getAirport() {return this.airport;}
    public String getAirline() {return this.airline;}
    public String getDepartureTime() {return this.departureTime;}
    public String getArrivalTime() {return this.arrivalTime;}

    // setter methods
    public void setAirport(String airport) {this.airport =airport;}
    public void setAirline(String airline) {this.airline = airline;}
    public void setDepartureTime(String departureTime) {this.departureTime = departureTime;}
    public void setArrivalTime(String arrivalTime) {this.arrivalTime=arrivalTime;}

    // override the toString method so we can format the air transportations in a table
    @Override
    public String toString(){
        // call the parent toString as well
        return super.toString() + String.format("%-25s%-25s%-25s%-25s","Airport:",getAirport(),"Departure time:",
                getDepartureTime());
    }
    // this method returns the arrival information for air transportation
    public String get_arrival_info(){
        return "Arrive at "+getDepartureTime()+" at "+getAirport();
    }
    // this will later be Overridden by air transportation subclasses to display the name of the
    // subclasses for the table
    String getName(){return "";}
}
