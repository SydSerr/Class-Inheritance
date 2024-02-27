public  class Ford extends Car {

    int fuelEfficiency;
    int horsePower;
    String terrain;

    String driveType;

    public Ford (String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int wheels, String color, int fuelEfficiency, int horsePower, String terrain, String driveType) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG, wheels, color);
        this.fuelEfficiency = fuelEfficiency;
        this.horsePower = horsePower;
        this.terrain = terrain;
        this.driveType = driveType;


    }

    public String toString() {
        String result = super.toString() + "\n" +
                "Fuel Efficiency: " + fuelEfficiency + "\n" +
                "Horse Power: " + horsePower + "\n" +
                "Terrain Type: " + terrain + "\n" +
                "Drive Type: " + driveType;
        return result;
    }

}