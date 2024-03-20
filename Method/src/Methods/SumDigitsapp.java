package Methods;
import java.util.Scanner;
public class SumDigitsapp {
	public static void main(String[]args) {
		System.out.println("Enter the value");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		SumOfDigitsM res=new SumOfDigitsM();
		int Sum=res.FindSum(num);
		System.out.println("The sum of digits of a given number is: "+Sum);
		
	}

}
