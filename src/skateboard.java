//skateboard class inherits from Vehicle class
public class skateboard extends Vehicle {
    //skateboard specific specs variables
    int weight;
    double deckSize;
    String material;

    //super constructor with data from skateboard and Vehicle class
    public skateboard (String inBrand, double inSpeed, int inPassengers, double inCargo, int weight, double deckSize,String material) {
        super(inBrand, inSpeed, inPassengers, inCargo);

        this.weight = weight;
        this.deckSize = deckSize;
        this.material = material;

    }
    //adds onto super toString from Vehicle class
    public String toString() {
        String result = "\n" + super.toString()  +
                "Board Weight (lbs): " + weight + "\n" +
                "Deck Size (in): " +  deckSize + "\n" +
                "Deck Material: " + material;

        return result;
    }

}