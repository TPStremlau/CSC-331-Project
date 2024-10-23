public class Land_Transportation extends Transportation {
    private String fuelType;

    Land_Transportation(String rentalOrPurchase, double purchasePrice, double rentalPrice, double averageSpeed,
            int numPassengers, String fuelType){
        super(rentalOrPurchase, purchasePrice, rentalPrice, averageSpeed, numPassengers);
        this.fuelType = fuelType;
    }

    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    public String getFuelType() { return this.fuelType; }

    @Override
    public String toString() {
        return super.toString() + String.format("%25s %10s", "Fuel-Type:", getFuelType());
    }
}

