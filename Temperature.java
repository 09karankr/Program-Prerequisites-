import java.util.Scanner;

public class Temperature{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Temperature in Celcius");
	float celsius = sc.nextFloat();
	
	float fhrn= (celsius*9/5) + 32;
	System.out.println("Temperature in Fahrenheit is = " + fhrn);
	
	
  }
}