//wheelSkateboard class inherits from skateboard class
public class wheelSkateboard extends skateboard {
       //specific characteristics to wheeled skateboards
        String type;
        int numWheels;
        int wheelSize;

    //super constructor for all data from wheelSkateboard and skateboard class
    public wheelSkateboard(String inBrand, double inSpeed, int inPassengers, double inCargo, int weight, double deckSize, String material, boolean wheels,String type,  int numWheels,int wheelSize) {
        super(inBrand, inSpeed, inPassengers, inCargo, weight, deckSize, material);

            this.type = type;
            this.numWheels = numWheels;
            this.wheelSize = wheelSize;
    }
    //adds onto super toString from skateboard
    public String toString() {
        String result = super.toString() + "\n" +
                "Board Type: " + type + "\n" +
                "# of wheels: " +  numWheels + "\n" +
                "Wheel Size (mm): " + wheelSize;

        return result;
    }
}
