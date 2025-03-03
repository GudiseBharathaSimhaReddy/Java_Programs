import java.util.Scanner;

public class CircleAreaPerimeter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius of the circle: ");
    double radius = scanner.nextDouble();

    double area = Math.PI * Math.pow(radius, 2);
    double perimeter = 2 * Math.PI * radius;

    System.out.println("Area of the circle: " + area);
    System.out.println("Perimeter of the circle: " + perimeter);
  }
}

