import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Choose a shape type: (1) Rectangle, (2) Circle, (3) Triangle, (4) Square, (5) Exit");
            choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter the name of the shape: ");
            String name = scanner.next();

            if (choice == 1) {
                System.out.print("Enter width and height of the rectangle: ");
                int w = scanner.nextInt();
                int h = scanner.nextInt();
                Rectangle rectangle = new Rectangle(w, h);
                System.out.println("Area: " + rectangle.getArea());
                System.out.println("Perimeter: " + rectangle.getPerimeter());
            } else if (choice == 2) {
                System.out.print("Enter the radius of the circle: ");
                int r = scanner.nextInt();
                Circle circle = new Circle(r);
                System.out.println("Area: " + circle.getArea());
                System.out.println("Perimeter: " + circle.getPerimeter());
            } else if (choice == 3) {
                System.out.print("Enter the lengths of the triangle's sides: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                Triangle triangle = new Triangle(a, b, c);
                System.out.println("Area: " + triangle.getArea());
                System.out.println("Perimeter: " + triangle.getPerimeter());
            } else if (choice == 4) {
                System.out.print("Enter the side length of the square: ");
                int x = scanner.nextInt();
                Square square = new Square(x);
                System.out.println("Area: " + square.getArea());
                System.out.println("Perimeter: " + square.getPerimeter());
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
