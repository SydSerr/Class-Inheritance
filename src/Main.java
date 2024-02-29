public class Main {
    public static void main(String[] args) {

        //create Ford and flyingCar objects with specs assigned + printed out
        Ford mustang = new Ford("Ford Mustang", 250, 4, 20, 350, 4, "Black", true, true, 500, 350,"Road","Rear Wheel");
        System.out.println(mustang);
        flyingCar fCar = new flyingCar("Lenovo Flying Car",200,5,100,150,4,"White",true,true,true,"Retractable",7000,200,155);
        System.out.println(fCar);

        //create wheelSkateboard and hoverboard objects with specs assigned + printed out
        wheelSkateboard wskateboard = new wheelSkateboard("Santa Cruz Skateboard",8,1,100,5,8.25,"Wood",true,"Cruiser",4,60);
        System.out.println(wskateboard);
        hoverboard hboard = new hoverboard("Apple Hoverboard",30,1,100,3,9,"Plastic",false,2.5,20);
        System.out.println(hboard);

        //create yacht and lifeboat objects with specs assigned + printed out
        yacht voyager = new yacht("Ocean Voyager 75 Yacht",15,8,700,"Twin Diesel Engines",18,5,"Monohull","Salon, Cinema Room, Wi-Fi, and AC/Heater",10,8);
        System.out.println(voyager);
        lifeboat lb = new lifeboat("Survival Craft Lifeboat",6,10,100,"Outboard Motor",8,3,"Rigid Hull","Fiberglass","Life Jackets, Flares and First Aid Kit",true,"Gravity Davits","SOLAS");
        System.out.println(lb);

        //create dogSled and toboggan objects with specs assigned + printed out
        dogSled articRunner = new dogSled("Nome Sled Works Dogsled",20,2,20,true,"Snow, Ice, Uphill, Downhill, Flat Ground","Handlebar",8,"Leather with metal attachments",true,50);
        System.out.println(articRunner);
        toboggan tsled = new toboggan("Flexible Flyer Toboggan",15,2,20,true,"Snowy hills/slopes","Rope",true,"Curved front with a slim,long base","Polyethylene Plastic");
        System.out.println(tsled);
    }
}



