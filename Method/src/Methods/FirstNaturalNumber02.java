package Methods;
import java.util.Scanner;
public class FirstNaturalNumber02{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		
		FirstNaturalNumber d=new FirstNaturalNumber();
		int res=d.FNaturalSum(n);
		System.out.println("The first"+n+"natural number is "+res);
		
		
	}

}
