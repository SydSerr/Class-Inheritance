//toboggan class inherits from sled class
public class toboggan extends sled {
    //specific toboggan characteristics
    boolean portability;
    String design;
    String reinforcement;

    //super constructor for sled and toboggan class data
    public toboggan(String inBrand, double inSpeed, int inPassengers, double inCargo, boolean runners, String terrain, String handles, boolean portability, String design, String reinforcement) {
        super(inBrand, inSpeed, inPassengers, inCargo, runners, terrain, handles);
            this.portability = portability;
            this.design = design;
            this.reinforcement = reinforcement;

    }
    //adds onto super toString from sled
    public String toString() {
        String result = "\n" + super.toString()  + "\n" +
                "Portable?: " + portability + "\n" +
                "Design: " +  design + "\n" +
                "Reinforcement Material: " + reinforcement;
        return result;
}
}