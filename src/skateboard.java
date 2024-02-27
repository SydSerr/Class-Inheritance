public class skateboard extends Vehicle {
    //skateboard specific specs variables
    int weight;
    double deckSize;
    String material;



    public skateboard (String inBrand, double inSpeed, int inPassengers, double inCargo, int weight, double deckSize,String material) {
        super(inBrand, inSpeed, inPassengers, inCargo);

        this.weight = weight;
        this.deckSize = deckSize;
        this.material = material;




    }
    public String toString() {
        String result = "\n" + super.toString()  +
                "Weight: " + weight + "\n" +
                "Deck Size: " +  deckSize + "\n" +
                "Deck Material: " + material;

        return result;
    }

}