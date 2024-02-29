//flyingCar class inherits from Car
public class flyingCar extends Car {
    //specific characteristics for flyingCars
    boolean flight = false;
    String wings;
    int maxAlt;
    int flyRange;
    int airSpeed;

    //super constructor for inherited data and new data
    public flyingCar(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int wheels, String color, boolean spoiler, boolean stereo,  boolean flight, String wings, int maxAlt, int flyRange, int airSpeed) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG, wheels, color, spoiler, stereo);
        this.flight = flight;
        this.wings = wings;
        this.maxAlt = maxAlt;
        this.flyRange = flyRange;
        this.airSpeed = airSpeed;

    }
    //adds onto the super toString
    public String toString() {
        String result = "\n" + super.toString() + "\n" +
                "Can fly?: " + flight + "\n" +
                "Wing Type: " +  wings + "\n" +
                "Max Altitude (ft): " + maxAlt + "\n" +
                "Flight Range (miles): " + flyRange + "\n" +
                "Air Speed (mph): " + airSpeed;

        return result;
    }
}