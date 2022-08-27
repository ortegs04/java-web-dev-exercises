package studios.areaofacircle;
import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What it the radius of the circle? ");
        double radOfCirc = input.nextDouble();
        double area = Circle.getArea(radOfCirc);
        System.out.println("The area of the circle " + radOfCirc + " is: " + area);
    }
}
