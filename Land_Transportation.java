public class Land_Transportation extends Transportation {
    private String fuelType;

    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    public String getFuelType() { return this.fuelType; }

    @Override
    public String toString() {
        return super.toString() + "\nFuel Type:" + getFuelType();
    }
}

