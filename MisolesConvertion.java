import java.util.Scanner;

public class MisolesConvertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Number System Conversion and Operations");
            System.out.println("1. Convert a number between Binary, Decimal, Octal, and Hexadecimal");
            System.out.println("2. Perform basic mathematical operations");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertNumber(scanner);
                    break;
                case 2:
                    performMathOperations(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("\nDo you want to continue? (yes/no): ");
            input = scanner.next();
        } while (input.equalsIgnoreCase("yes"));
        scanner.close();
    }

    private static void convertNumber(Scanner scanner) {
        System.out.print("Enter the number: ");
        String number = scanner.next();
        System.out.println("Enter the base of the input number:");
        System.out.println("2 for Binary, 8 for Octal, 10 for Decimal, 16 for Hexadecimal");
        int base = scanner.nextInt();

        try {
            int decimalValue = Integer.parseInt(number, base);
            System.out.println("Decimal: " + decimalValue);
            System.out.println("Binary: " + Integer.toBinaryString(decimalValue));
            System.out.println("Octal: " + Integer.toOctalString(decimalValue));
            System.out.println("Hexadecimal: " + Integer.toHexString(decimalValue).toUpperCase());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number or base. Please try again.");
        }
    }

    private static void performMathOperations(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation choice. Please try again.");
        }
    }
}