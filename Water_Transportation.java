public class Water_Transportation extends Transportation{
    private String dock;
    private String loadingTime;
    private String marina;

    public Water_Transportation(String dock, String loadingTime, String marina,double purchasePrice,
                                double rentalPrice, double averageSpeed, int numPassengers){
        super(purchasePrice, rentalPrice, averageSpeed, numPassengers);
        this.dock = dock;
        this.loadingTime = loadingTime;
        this.marina = marina;
    }
    public String getDock(){return dock;}
    public String getLoadingTime() {return loadingTime;}
    public String getMarina() {return marina;}

    public void setDock(String dock){this.dock = dock;}
    public void setLoadingTime(String loadingTime) {this.loadingTime=loadingTime;}
    public void setMarina(String marina) { this.marina=marina;}

    @Override
    public String get_arrival_info(){
        return "Arrive at " + getMarina() + " at " + getDock();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%n%n|%-20s|%-20s|%-20s|%n|%-20s|%-20s|%-20s|", "Marina:", "Dock:",
                "Loading Time:", getMarina(), getDock(), getLoadingTime());
    }

    @Override
    public String getName(){
        return "";
    };

}
