public class Water_Transportation extends Transportation{
    private String dock;
    private String loadingTime;
    private String marina;

    Water_Transportation(String dock, String loadingTime, String marina,String rentalOrPurchase,double purchasePrice,
                         double rentalPrice, double averageSpeed, int numPassengers){
        super(rentalOrPurchase, purchasePrice, rentalPrice, averageSpeed, numPassengers);
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

}
