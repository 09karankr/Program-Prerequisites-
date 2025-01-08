import java.util.Scanner;

public class PerimeterOfRectangle{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Give the length");
	double l = sc.nextDouble();
	System.out.println("Give the width");
	double w = sc.nextDouble();
	double Perimeter = 2 * (l + w );
	System.out.println("Perimeter is = " + Perimeter);
	
	
  }
}