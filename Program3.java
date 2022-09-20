package pattern;

import java.util.Scanner;

public class Program3 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();
        double amt = 0.0;
        if (units <= 100)
            amt = units * 0.8;
        else if (units <= 300)
            amt = (100 * 0.8) + ((units - 100) * 1);
        else
            amt = (100 * 0.8) + (200 * 1.0) + ((units - 300) * 2.5);
            
        amt += 500;
            
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount: " + amt);
    }
}
