import java.util.Scanner;

public class AvgOfThreeNum {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first num: ");
        double first = scanner.nextDouble();
        System.out.print("Enter second num: ");
        double second = scanner.nextDouble();
		System.out.print("Enter third num: ");
        double third = scanner.nextDouble();
        double avg = (first+second+third)/3;
		System.out.println("AvgOfThreeNum is = " + avg);

        
        
    }
}