package variable;

public class StaticVariable {
	
	static int a= 10;
	static int b= 20;
	
	public static void test() {
		int c= a+b;
		System.out.println(c);
	}
	public void test1() {
		int d=a*b;
		System.out.println(d);
	}
	
	public static void main(String args[]) {
		StaticVariable.test();
		
		StaticVariable obj = new StaticVariable();
		obj.test1();
	}
}
