package Methods;

public class PowerM {
	static int power(int base,int exp) {
		int power=1;
		for (int i=1;i<=exp;i++) {
			power=power*base;
		}
		return power;
		
	}
 
	 
}

