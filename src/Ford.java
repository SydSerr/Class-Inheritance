//Ford class inherits from Car class
public  class Ford extends Car {
    //specific specs to Ford
    int fuelEfficiency;
    int horsePower;
    String terrain;
    String driveType;

    //constructor for inherited data and new Ford data
    public Ford (String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int wheels, String color, boolean spoiler, boolean stereo, int fuelEfficiency, int horsePower, String terrain, String driveType) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG, wheels, color, spoiler,  stereo);
        this.fuelEfficiency = fuelEfficiency;
        this.horsePower = horsePower;
        this.terrain = terrain;
        this.driveType = driveType;


    }
    //adds onto toString from Car
    public String toString() {
        String result = super.toString() + "\n" +
                "Fuel Efficiency (mph): " + fuelEfficiency + "\n" +
                "Horse Power (hp): " + horsePower + "\n" +
                "Terrain Type: " + terrain + "\n" +
                "Drive Type: " + driveType;
        return result;
    }

}