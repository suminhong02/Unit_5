public class CarTripTester {
    public static void main(String [] args){
        CarTrip car1 = new CarTrip();
        CarTrip car2 = new CarTrip(0, 400, 4, 70);

        System.out.println(car1.getTripDistance());
        System.out.println(car1.getAverageSpeed());
        System.out.println(car1. getGasMileage());
        System.out.println(car1.getTotalGasPrice(1.5));
        System.out.println(car1.toString());

        System.out.println();

        System.out.println(car2.getTripDistance());
        System.out.println(car2.getAverageSpeed());
        System.out.println(car2. getGasMileage());
        System.out.println(car2.getTotalGasPrice(1.5));
        System.out.println(car2.toString());

    }
}
