public class Truck {

    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;
    private static final double CAPACITY = 20.0;
    private static double totalFuel = 0;

    public Truck(String name){
        truckID = name;
    }
    public Truck(String name, double o, double m, double f){
        truckID = name;
        odometer = o;
        mpg = m;
        fuel = f;

    }
    public String getTruckID(){
        return truckID;
    }
    public double getOdometer(){
        return odometer;
    }
    public double getMpg(){
        return mpg;
    }
    public double getFuel(){
        return fuel;
    }
    public void setMpg(double m){
        mpg = m;
    }
    public boolean enoughFuel(double miles){
        if(miles<=(mpg*fuel)){
            return true;
        }
        else return false;
    }
    public String drive(double miles){
        if(enoughFuel(miles)){
            odometer += miles;
            fuel -= (miles/mpg);
            return "Success";
        }
        else return truckID+" does not have enough fuel to drive "+miles+ " miles.";
    }
    public void fill(){
        CAPACITY - fuel;
    }
    public String fill(double gallon){
        if()
    }

}
