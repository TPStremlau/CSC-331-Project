/**
 * Represents a transportation entity with attributes such as purchase price, rental price,
 * average speed, and passenger capacity. This class provides methods to access and modify
 * these attributes, calculate payment information based on rental or purchase, and
 * display information about the transportation.
 */

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

    // Create the toString method that is overridden by subclasses
    @Override
    public String toString(){
        return String.format("|%-20s|%-20s|%-20s|%-20s|%n|%-20.2f|%-20.2f|%-20.2f|%-20d|","Ticket Price",
                "Rental Price", "Average Speed","Passenger Count",getPurchasePrice(),
                getRentalPrice(),getAverageSpeed(), getNumPassengers());
    }

    // Calculates the total payment depending on whether the input is rent or purchase
    public String get_payment_info(int num_passengers, String rent_purchase){
        double price_tickets = 0.0;
        if (rent_purchase.equalsIgnoreCase("rent")){
            price_tickets = getRentalPrice();
        }
        if (rent_purchase.equalsIgnoreCase("purchase")){
            price_tickets = num_passengers * getPurchasePrice();
        }
        return String.format("%s%s%.2f","Your total cost is: ", "$", price_tickets);
    }

    public String get_arrival_info() {
        return "";
    }

    public String getName(){return "";};
}
