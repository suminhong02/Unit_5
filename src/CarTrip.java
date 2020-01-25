public class CarTrip {
    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip(){
        myStartOdometer = 0.0;
        myEndOdometer = 0.0;
        myTime = 0.0;
        myGallonsUsed = 0.0;
    }

    public CarTrip(int s, int e, double t, double g) {
        myStartOdometer = s;
        myEndOdometer = e;
        myTime = t;
        myGallonsUsed = g;
    }

    public double getMyStartOdometer(){
        return myStartOdometer;
    }

    public double getMyEndOdometer(){
        return myEndOdometer;
    }

    public double getMyTime(){
        return myTime;
    }

    public double getMyGallonsUsed(){
        return myGallonsUsed;
    }

    public double getTripDistance(){
        return myEndOdometer - myStartOdometer;
    }
    public double getAverageSpeed(){
        if(myTime!= 0) {
            return getTripDistance() / myTime;
        }
        else{
            return myTime;
        }
    }
    public double getGasMileage(){
        if(myGallonsUsed != 0){
        return getTripDistance()/myGallonsUsed;}
        else{
            return myGallonsUsed;
        }
    }
    public double getTotalGasPrice(double pricePerGallon){
        return myGallonsUsed*pricePerGallon;
    }
    public String toString(){
        return "Distance traveled: " + getTripDistance() + " miles";
    }
}

