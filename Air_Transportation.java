public class Air_Transportation extends Transportation{
    private int altitude;

    public void setAltitude(int altitude) { this.altitude = altitude; }
    public int getAltitude() {return this.altitude; }

    @Override
    public String toString() {
        return super.toString() + "\nAltitude:" + getAltitude();
    }
}
