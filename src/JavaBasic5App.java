
public class JavaBasic5App {
	public static void main(String[] args) {
		
		int a=1, b=2, c=3, d=4;
		
		b=c;
		c=a;
		a=d;
		d=b;
		
		System.out.println(a + " " + b + " " + c + " " + d);
	}

}
