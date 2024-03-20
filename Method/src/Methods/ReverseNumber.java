package Methods;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=scan.nextInt();
		Reverse obj=new Reverse();
		int rev=obj.Reversenum(num);
		System.out.println("Reverse of a given number"+num+"is "+rev);
	}

}
