public class Land_Transportation extends Transportation {
    private String fuelType;

    public Land_Transportation(double purchasePrice, double rentalPrice,
                               double averageSpeed, int numPassengers, String fuelType){
        super(purchasePrice, rentalPrice, averageSpeed, numPassengers);
        this.fuelType = fuelType;

    }

    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public String getFuelType() { return this.fuelType; }


    @Override
    public String toString() {
        return super.toString() + String.format("%n%n|%-20s|%n|%-20s|", "Fuel-Type: ", getFuelType());
    }

    @Override
    public String get_arrival_info(){
        return "";
    }

    @Override
    public String getName(){return super.getName();}
}
