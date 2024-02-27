public class flyingCar extends Car {

    boolean flight = false;
    String wings;
    int maxAlt;
    int flyRange;
    int airSpeed;

    public flyingCar(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int wheels, String color, boolean flight, String wings, int maxAlt, int flyRange, int airSpeed) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG, wheels, color);
        this.flight = flight;
        this.wings = wings;
        this.maxAlt = maxAlt;
        this.flyRange = flyRange;
        this.airSpeed = airSpeed;

    }
    public String toString() {
        String result = "\n" + super.toString() + "\n" +
                "Can fly?: " + flight + "\n" +
                "Wings: " +  wings + "\n" +
                "Max Altitude: " + maxAlt + "\n" +
                "Flight Range: " + flyRange + "\n" +
                "Air Speed: " + airSpeed;

        return result;
    }
}