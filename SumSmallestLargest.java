import java.util.Scanner;

public class SumSmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double smallest = Math.min(num1, Math.min(num2, num3));
        double largest = Math.max(num1, Math.max(num2, num3));

        double sum = smallest + largest;

        System.out.println("The sum of the smallest and largest numbers is: " + sum);
        
        scanner.close();
    }
}
