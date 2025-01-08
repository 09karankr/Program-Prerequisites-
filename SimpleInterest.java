import java.util.Scanner;

public class SimpleInterest{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Give the Principal");
	double P = sc.nextDouble();
	System.out.println("Give the Rate");
	double R = sc.nextDouble();
	System.out.println("Give the Time");
	double T = sc.nextDouble();
	double SI = (P*R*T)/100;
	System.out.println("Simple Interest is = " + SI);
	
	
  }
}