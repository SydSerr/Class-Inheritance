public class wheelSkateboard extends skateboard {
        String type;
        int numWheels;
        int wheelSize;



    public wheelSkateboard(String inBrand, double inSpeed, int inPassengers, double inCargo, int weight, double deckSize, String material, boolean wheels,String type,  int numWheels,int wheelSize) {
        super(inBrand, inSpeed, inPassengers, inCargo, weight, deckSize, material);

            this.type = type;
            this.numWheels = numWheels;
            this.wheelSize = wheelSize;
    }

    public String toString() {
        String result = super.toString() + "\n" +
                "Board Type: " + type + "\n" +
                "# of wheels: " +  numWheels + "\n" +
                "Wheel Size: " + wheelSize;

        return result;
    }
}
