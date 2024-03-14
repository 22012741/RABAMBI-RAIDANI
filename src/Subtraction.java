import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        double result = firstNumber - secondNumber;

        System.out.println("The result of subtraction is: " + result);

        scanner.close();
    }
}