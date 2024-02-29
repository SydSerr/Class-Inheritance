//hoverboard class inherits from skateboard class
public class hoverboard extends skateboard {
        //hoverboard specific characteristics
        double maxHover;
        int maxPower;
    //super constructor with inherited data + new data
    public hoverboard(String inBrand, double inSpeed, int inPassengers, double inCargo, int weight, double deckSize, String material, boolean wheels, double maxHover, int maxPower) {
        super(inBrand, inSpeed, inPassengers, inCargo, weight, deckSize, material);
            this.maxHover = maxHover;
            this.maxPower = maxPower;
    }
    //adds onto the super toString from skateboard class
    public String toString() {
        String result = super.toString() + "\n" +
                "Max Hover (ft): " + maxHover + "\n" +
                "Max Power (W):" +  maxPower;
        return result;
    }
}
