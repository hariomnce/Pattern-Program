package pattern;
import java.util.Scanner;

public class Program2 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 for Fahrenheit to Celsius");
        System.out.println("Type 2 for Celsius to Fahrenheit");
        int choice = sc.nextInt();
        double ft = 0.0, ct = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                ft = sc.nextDouble();
                ct = (ft - 32) * 5 / 9.0;
                System.out.println("Temperature in Celsius: " + ct);
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                ct = sc.nextDouble();
                ft = 9.0 / 5.0 * ct + 32;
                System.out.println("Temperature in Fahrenheit: " + ft);
                break;

            default:
                System.out.println("Incorrect Choice");
                break;
        }
    }

}
