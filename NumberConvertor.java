import java.util.Scanner;

public class NumberConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number Converter");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to Hexadecimal");
        System.out.println("4. Binary to Decimal");
        System.out.println("5. Octal to Decimal");
        System.out.println("6. Hexadecimal to Decimal");
        System.out.print("Choose an option (1-6): ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter a decimal number: ");
                int decimalForBinary = scanner.nextInt();
                System.out.println("Binary: " + Integer.toBinaryString(decimalForBinary));
                break;
            case 2:
                System.out.print("Enter a decimal number: ");
                int decimalForOctal = scanner.nextInt();
                System.out.println("Octal: " + Integer.toOctalString(decimalForOctal));
                break;
            case 3:
                System.out.print("Enter a decimal number: ");
                int decimalForHex = scanner.nextInt();
                System.out.println("Hexadecimal: " + Integer.toHexString(decimalForHex).toUpperCase());
                break;
            case 4:
                System.out.print("Enter a binary number: ");
                String binaryString = scanner.next();
                int binaryToDecimal = Integer.parseInt(binaryString, 2);
                System.out.println("Decimal: " + binaryToDecimal);
                break;
            case 5:
                System.out.print("Enter an octal number: ");
                String octalString = scanner.next();
                int octalToDecimal = Integer.parseInt(octalString, 8);
                System.out.println("Decimal: " + octalToDecimal);
                break;
            case 6:
                System.out.print("Enter a hexadecimal number: ");
                String hexString = scanner.next();
                int hexToDecimal = Integer.parseInt(hexString, 16);
                System.out.println("Decimal: " + hexToDecimal);
                break;
            default:
                System.out.println("Invalid option. Please choose a number between 1 and 6.");
                break;
        }
    }
}


