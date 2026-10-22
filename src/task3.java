import java.util.Locale;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        System.out.printf(Locale.US, "a = %.2f, b = %.2f, c = %.2f%n", a, b, c);

        if (a == 0) {
            System.out.println("This is not a quadratic equation. a cannot be zero.");
        } else {
            double delta = b * b - 4 * a * c;
            double x1, x2;
            int roots;

            if (delta > 0) {
                roots = 2;
            } else if (delta == 0) {
                roots = 1;
            } else {
                roots = 0;
            }

            switch (roots) {
                case 0:
                    System.out.println("No real roots.");
                    break;
                case 1:
                    x1 = -b / (2 * a);
                    System.out.printf(Locale.US, "x1 = x2 = %.2f%n", x1);
                    break;
                case 2:
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.printf(Locale.US, "x1 = %.2f, x2 = %.2f%n", x1, x2);
                    break;
            }
        }

        input.close();
    }
}
