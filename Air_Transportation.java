public class Air_Transportation extends Transportation{
    private String airport;
    private String departureTime;
    private String airline;
    private String arrivalTime;

    public Air_Transportation(String airport,String airline, String departureTime, String arrivalTime,String rentalOrPurchase,
                      double purchasePrice, double rentalPrice, double averageSpeed, int numPassengers){
        super(rentalOrPurchase, purchasePrice, rentalPrice, averageSpeed, numPassengers);
        this.airport = airport;
        this.airline = airline;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getAirport() {return this.airport;}
    public String getAirline() {return this.airline;}
    public String getDepartureTime() {return this.departureTime;}
    public String getArrivalTime() {return this.arrivalTime;}

    public void setAirport(String airport) {this.airport =airport;}
    public void setAirline(String airline) {this.airline = airline;}
    public void setDepartureTime(String departureTime) {this.departureTime = departureTime;}
    public void setArrivalTime(String arrivalTime) {this.arrivalTime=arrivalTime;}

    public String toString(){
        return super.toString() + String.format("\n\t%25s %10s %25s %10s %25s %10s %25s %10s", "Airport:", getAirport(), 
                                          "Airline:", getAirline(), "Departure Time:", getDepartureTime(), "Arrival Time:", 
                                           getArrivalTime());
    }
}
