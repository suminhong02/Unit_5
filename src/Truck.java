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
        if(miles<(mpg*fuel)){

        }
    }

}
