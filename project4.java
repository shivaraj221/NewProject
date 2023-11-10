import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coefficient of x^2: ");
        double a = input.nextDouble();
        System.out.print("Enter the coefficient of x: ");
        double b = input.nextDouble();
        System.out.print("Enter the constant term: ");
        double c = input.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are: " + root1 + ", " + root2);
        } else {
            System.out.println("The roots are complex.");
        }
    }
}
