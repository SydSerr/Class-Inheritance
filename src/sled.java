//sled class inherits from Vehicle class
public class sled extends Vehicle {
    //general sled characteristics
    boolean runners;
    String terrain;
    String handles;

    //super constructor for Vehicle and sled data
    public sled (String inBrand, double inSpeed, int inPassengers, double inCargo, boolean runners, String terrain, String handles) {
        super(inBrand, inSpeed, inPassengers, inCargo);

        this.runners = runners;
        this.terrain = terrain;
        this.handles = handles;

    }
    //adds onto super toString from Vehicle
    public String toString() {
        String result = "\n" + super.toString()  +
                "Runners?: " +  runners + "\n" +
                "Terrain: " + terrain + "\n" +
                "Handles: " + handles;

        return result;
    }


    }


