import java.util.Scanner;

public class AreaOfCircle{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Give the radius");
	double radius = sc.nextDouble();
	
	double Area= 22.7 *(radius*radius);
	System.out.println("Area is = " + Area);
	
	
  }
}