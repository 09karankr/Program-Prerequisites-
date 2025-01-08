import java.util.Scanner;

public class KmToMiles{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Km ");
        double first = scanner.nextDouble();
        double Miles = first * 0.621371;
        
        
		System.out.println("Distance in miles is = "+Miles);

        
        
    }
}