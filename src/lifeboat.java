//lifeboat class inherits from boat class
public class lifeboat extends boat {
    //lifeboat specific characteristics
    String durability;
    String equipment;
    boolean quickLaunch;
    String launchMethod;
    String certification;

    //super constructor with data from boat class and lifeboat data
    public lifeboat(String inBrand, double inSpeed, int inPassengers, double inCargo, String propulsion, int beam, int draft, String hullType, String durability, String equipment,boolean quickLaunch,String launchMethod, String certification) {
        super(inBrand, inSpeed, inPassengers, inCargo, propulsion, beam, draft, hullType);
            this.durability=durability;
            this.equipment=equipment;
            this.quickLaunch=quickLaunch;
            this.launchMethod=launchMethod;
            this.certification=certification;
    }
    //adds onto super toString from boat class
    public String toString() {
        String result = "\n" + super.toString() + "\n" +
                "Reinforcement: " + durability + "\n" +
                "Equipment: " +  equipment + "\n" +
                "Quick Launch?: " + quickLaunch + "\n" +
                "Launch Method: " + launchMethod + "\n" +
                "Certification: " + certification;
        return result;
    }




}
