//boat class that inherits from Vehicle
public class boat extends Vehicle {
    //general boat specs (variables)
    String propulsion;
    int beam;
    int draft;
    String hullType;

    //constructor for all data from boat and Vehicle class
    public boat(String inBrand, double inSpeed, int inPassengers, double inCargo, String propulsion, int beam, int draft, String hullType) {
        //inherited specs from Vehicle
        super(inBrand, inSpeed, inPassengers, inCargo);
            this.propulsion = propulsion;
            this.beam = beam;
            this.draft = draft;
            this. hullType = hullType;

    }
    //boat toString for the general specs
    public String toString() {
        String result = "\n" + super.toString()  +
                "Propulsion: " + propulsion + "\n" +
                "Beam (ft): " +  beam + "\n" +
                "Draft (ft): " + draft + "\n" +
                "Hull: " + hullType;

        return result;
    }



}
