package Methods;

public class M01 {
	public static void main(String[]args) {
		M1 d=new M1();
		d.add();
		d.sub (20,10);
		int res=d.mul();
		System.out.println(res);
		int res1=d.div(10,2);
		System.out.println(res1);
	}

}
