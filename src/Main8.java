import java.util.Locale;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        switch (scanner.next()) {
            case "triangle":
                getTriangleArea(scanner);
                break;
            case "rectangle":
                getRectangleArea(scanner);
                break;
            case "circle":
                getCircleArea(scanner);
                break;
        }
    }

    private static void getCircleArea(Scanner scanner) {
        double r = scanner.nextDouble();
        double s;
        s = 3.14 * Math.pow(r, 2);
        System.out.println(s);
    }

    private static void getRectangleArea(Scanner scanner) {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double s;
        s = a * b;

        System.out.println(s);
    }

    private static void getTriangleArea(Scanner scanner) {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p;
        p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(s);
    }
}
