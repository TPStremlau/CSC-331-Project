public class Transportation {
    private double purchasePrice;
    private double rentalPrice;
    private double averageSpeed;
    private int numPassengers;

    Transportation(double purchasePrice, double rentalPrice, double averageSpeed, int numPassengers) {
        this.purchasePrice = purchasePrice;
        this.rentalPrice = rentalPrice;
        this.averageSpeed = averageSpeed;
        this.numPassengers = numPassengers;
    }

    // accessors
    public double getPurchasePrice() { return purchasePrice; }
    public double getRentalPrice() { return rentalPrice; }
    public double getAverageSpeed() { return averageSpeed; }
    public int getNumPassengers() { return numPassengers; }

    // mutators
    public void setPurchasePrice(double purchasePrice) {this.purchasePrice=purchasePrice;}
    public void setRentalPrice(double rentalPrice) { this.rentalPrice = rentalPrice;}
    public void setAverageSpeed(double averageSpeed) { this.averageSpeed = averageSpeed;}
    public void setNumPassengers(int numPassengers) {this.numPassengers = numPassengers;}

    @Override
    public String toString(){
        return String.format("%-25s%-10f%-25s%-10f%-25s%-10f%-25s%-10d",
                "Ticket purchase price:",getPurchasePrice(),"Rental price:",getRentalPrice(),"Average speed:",
                getAverageSpeed(),"Num of passengers:",getNumPassengers());
    }

    public String getName() {
        return "";
    }
}
