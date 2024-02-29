//dogSled class inherits from sled
public class dogSled extends sled {
    //specific characteristics for dogSleds
    int dogs;
    String harness;
    boolean breaks;
    int distance;

    //constructor for new data and inherited data from the "super"
    public dogSled(String inBrand, double inSpeed, int inPassengers, double inCargo, boolean runners, String terrain, String handles, int dogs, String harness, boolean breaks, int distance) {
        super(inBrand, inSpeed, inPassengers, inCargo, runners, terrain, handles);
            this.dogs = dogs;
            this. harness = harness;
            this.breaks = breaks;
            this.distance = distance;

    }
    //adds onto super toString
    public String toString() {
        String result = "\n" + super.toString()  + "\n" +
                "# of Dogs: " + dogs + "\n" +
                "Harness: " +  harness + "\n" +
                "Breaks?: " + breaks + "\n" +
                "Max Distance (miles): " + distance;
        return result;
    }
}
