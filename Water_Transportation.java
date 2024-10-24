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

    public String toString() {
        return super.toString() + String.format("%25s %10s %25s %10s %25s %10s", "Dock:", getDock(),
                "Loading Time:", getLoadingTime(), "Marina:", getMarina());
    }

    @Override
    public String getName(){
        return "";
    };

}
