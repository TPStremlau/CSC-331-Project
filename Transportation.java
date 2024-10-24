

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
        return String.format("|%-25s|%-25s|%-25s|%-25s|%n|%-25.2f|%-25.2f|%-25.2f|%-25d|","Purchase Price",
                "Rental Price", "Average Speed","Num of Passengers",getPurchasePrice(),
                getRentalPrice(),getAverageSpeed(), getNumPassengers());
    }
    public String get_payment_info(int num_passengers, String rent_purchase){
        double price_tickets = 0.0;
        if (rent_purchase.equalsIgnoreCase("rent")){
            price_tickets = num_passengers*getRentalPrice();
        }
        if (rent_purchase.equalsIgnoreCase("purchase")){
            price_tickets = num_passengers*getPurchasePrice();
        }
        return String.format("%s%s%.2f","Your total cost is: ", "$", price_tickets);
    }
    String getName(){return "";}
}
