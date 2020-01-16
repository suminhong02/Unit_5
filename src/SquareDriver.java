import java.util.Scanner;

public class SquareDriver {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        double side = scan.nextDouble();
        Square square = new Square(side);
        System.out.println(square.calculateArea());
        System.out.println(square);
    }


}
