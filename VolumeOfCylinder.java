import java.util.Scanner;

public class VolumeOfCylinder{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Give the radius");
	double r = sc.nextDouble();
	System.out.println("Give the height");
	double h = sc.nextDouble();
	double Volume = 22.7*(r*r)*h;
	System.out.println("Volume of Cylinder is = " + Volume);
	
	
  }
}