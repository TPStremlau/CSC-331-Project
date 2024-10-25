public class Air_Transportation extends Transportation {
    private String airport;
    private String departureTime;
    private String airline;
    private String arrivalTime;

    Air_Transportation(String airport, String airline, String departureTime, String arrivalTime,
                       double purchasePrice, double rentalPrice, double averageSpeed, int numPassengers) {
        super(purchasePrice, rentalPrice, averageSpeed, numPassengers);
        this.airport = airport;
        this.airline = airline;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getAirport() {
        return this.airport;
    }

    public String getAirline() {
        return this.airline;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public String getArrivalTime() {
        return this.arrivalTime;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String get_arrival_info() {
        return "Arrive at " + getDepartureTime() + " at " + getAirport();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%n%n|%-20s|%-20s|%-20s|%-20s|%n|%-20s|%-20s|%-20s|%-20s|",
                "Airport:", "Airline:", "Departure Time:", "Arrival Time:" , getAirport(), getAirline(),  getDepartureTime(),
                getArrivalTime());
    }
}

