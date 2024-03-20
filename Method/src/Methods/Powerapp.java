package Methods;
import java.util.Scanner;
import java.lang.*;
public class Powerapp {
	public static void main(String[]args) { 
		System.out.println("Enter a Base and Exponent values");
		Scanner scan=new Scanner(System.in);
		int Base=scan.nextInt();
		int exp=scan.nextInt();
		int res=(int)Math.pow(Base,exp);
		System.out.println("Result of"+Base+"Raised with power"+res);
		//int res=PowerM.power(Base,exp);
		//System.out.println("Result of "+Base+"raised with power "+exp+"is "+res);
		
		
	
	}

}
