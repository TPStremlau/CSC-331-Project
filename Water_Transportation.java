public class Water_Transportation extends Transportation{
    private int waterDisplacement;

    public void setWaterDisplacement(int waterDisplacement) { this.waterDisplacement = waterDisplacement; }
    public int getWaterDisplacement() {return this.waterDisplacement; }

    @Override
    public String toString() {
        return super.toString() + "\nWater Displacement:" + getWaterDisplacement() + "m^3";
    }
}