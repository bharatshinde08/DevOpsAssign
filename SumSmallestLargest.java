import java.util.Scanner;

public class SumSmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        double smallest = Math.min(num1, Math.min(num2, num3));
        double largest = Math.max(num1, Math.max(num2, num3));

        double sum = smallest + largest;

        System.out.println("The sum of the smallest and largest numbers is: " + sum);
        
        scanner.close();
    }
}
