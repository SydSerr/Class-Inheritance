//yacht class inherits from boat class
public class yacht extends boat {
    //yacht specific characteristics
    String amenities;
    int crew;
    int rooms;

    //super constructor for all data from boat and yacht class
    public yacht(String inBrand, double inSpeed, int inPassengers, double inCargo, String propulsion, int beam, int draft, String hullType, String amenities,int crew, int rooms) {
        super(inBrand, inSpeed, inPassengers, inCargo, propulsion, beam, draft, hullType);
            this.amenities = amenities;
            this.crew = crew;
            this.rooms = rooms;

    }
    //adds onto super toString from boat class
    public String toString() {
        String result = "\n" + super.toString()  + "\n" +
                "Amenities: " + amenities + "\n" +
                "# of Crew Members: " +  crew + "\n" +
                "# of rooms: " + rooms;
        return result;
    }
}
