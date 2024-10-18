

public class Transportation {
    private String rentalOrPurchase;
    private double purchasePrice;
    private double rentalPrice;
    private double averageSpeed;
    private int numPassengers;

    Transportation(String rentalOrPurchase, double purchasePrice, double rentalPrice, double averageSpeed, int numPassengers) {
        this.rentalOrPurchase = rentalOrPurchase;
        this.purchasePrice = purchasePrice;
        this.rentalPrice = rentalPrice;
        this.averageSpeed = averageSpeed;
        this.numPassengers = numPassengers;
    }

    // accessors
    public String getRentalOrPurchase() {return rentalOrPurchase;}
    public double getPurchasePrice() { return purchasePrice; }
    public double getRentalPrice() { return rentalPrice; }
    public double getAverageSpeed() { return averageSpeed; }
    public int getNumPassengers() { return numPassengers; }

    // mutators
    public void setRentalOrPurchase(String rentalOrPurchase) {this.rentalOrPurchase = rentalOrPurchase;}
    public void setPurchasePrice(double purchasePrice) {this.purchasePrice=purchasePrice;}
    public void setRentalPrice(double rentalPrice) { this.rentalPrice = rentalPrice;}
    public void setAverageSpeed(double averageSpeed) { this.averageSpeed = averageSpeed;}
    public void setNumPassengers(int numPassengers) {this.numPassengers = numPassengers;}

    @Override
    public String toString(){
        return String.format("%-25s%-10s%-25s%-10f%-25s%-10f%-25s%-10f%-25s%-10d","Rental or Purchase:",getRentalOrPurchase(),
                "Purchase price:",getPurchasePrice(),"Rental price:",getRentalPrice(),"Average speed:",
                getAverageSpeed(),"Num of passengers:",getNumPassengers());
    }
}
