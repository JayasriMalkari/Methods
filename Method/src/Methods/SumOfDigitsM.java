package Methods;

public class SumOfDigitsM {
	int FindSum(int num) {
		int Sum=0;
		int rem=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			Sum+=rem;
		}
		return Sum;
	}

}
