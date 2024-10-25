public class Water_Transportation extends Transportation{
    private String dock;
    private String loadingTime;
    private String marina;
    private String departureTime;

    public Water_Transportation(String dock, String loadingTime, String marina, String departureTime, double purchasePrice,
                                double rentalPrice, double averageSpeed, int numPassengers){
        super(purchasePrice, rentalPrice, averageSpeed, numPassengers);
        this.dock = dock;
        this.loadingTime = loadingTime;
        this.marina = marina;
        this.departureTime = departureTime;
    }
    public String getDock(){return this.dock;}
    public String getLoadingTime() {return this.loadingTime;}
    public String getMarina() {return marina;}
    public String getDepartureTime() { return this.departureTime; }

    public void setDock(String dock){this.dock = dock;}
    public void setLoadingTime(String loadingTime) {this.loadingTime=loadingTime;}
    public void setMarina(String marina) { this.marina=marina;}
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }

    @Override
    public String get_arrival_info(){
        return "Arrive at " + getMarina() + " and wait at " + getDock() + " to be picked up at " + getDepartureTime();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%n%n|%-20s|%-20s|%-20s|%-20s|%n|%-20s|%-20s|%-20s|%-20s|", "Marina:", "Dock:",
                "Loading Time:", "Departure Time:", getMarina(), getDock(), getLoadingTime(), getDepartureTime());
    }

    @Override
    public String getName(){
        return "";
    };

}
