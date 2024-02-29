//Car class inherits from Vehicle
public class Car extends Vehicle {
   //general specs for Car
    int wheels = 4;
    String color;
    boolean spoiler = false;
    boolean stereo = false;
    double mpg = 0.0;

    //constructor for all data and inherited data from Vehicle
    public Car(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int wheels, String color, boolean spoiler, boolean stereo) {
        super(inBrand, inSpeed, inPassengers, inCargo);
        this.wheels = wheels;
        this.color = color;
        this.spoiler = spoiler;
        this.stereo = stereo;
        this.mpg = inMPG;

    }
    //getters and setters
    public void setSpoiler(boolean inSpoiler){
        spoiler = inSpoiler;
    }
    public boolean getSpoiler () {
        return spoiler;
    }

    public void setStereo(boolean inStereo){
        stereo = inStereo;
    }
    public boolean getStereo(){
        return stereo;
    }

    //overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (spoiler)
            return super.getSpeed() + 20;
        else
            return super.getSpeed();
    }
    //Mpg getters and setters
    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
    public double getMPG(){
        if(stereo)
            return mpg - (mpg / 10);
        else
            return mpg;
    }

    //use the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "MPG:\t\t\t" + this.getMPG() + "\n" +
                "# of wheels: " + wheels + "\n" +
                "Color: " + color + "\n" +
                "Spoiler?: " + spoiler + "\n" +
                "Stereo?: " + stereo;

        return result ;
    }
}
