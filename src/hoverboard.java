public class hoverboard extends skateboard {
        double maxHover;
        int maxPower;


    public hoverboard(String inBrand, double inSpeed, int inPassengers, double inCargo, int weight, double deckSize, String material, boolean wheels, double maxHover, int maxPower) {
        super(inBrand, inSpeed, inPassengers, inCargo, weight, deckSize, material);
            this.maxHover = maxHover;
            this.maxPower = maxPower;
    }
    public String toString() {
        String result = super.toString() + "\n" +
                "Max Hover: " + maxHover + "\n" +
                "Max Power " +  maxPower;
        return result;
    }
}
