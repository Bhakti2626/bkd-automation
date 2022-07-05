package VariableTypes;

public class LocalVariable2 {
	
	public void test() {
		 
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
	}
	
	public static void sample() {
		
		int x = 30;
		int y = 40;
		int d = x*y;
		System.out.println(d);
	}
	
	public static void main(String args[]) {
		LocalVariable obj = new LocalVariable();
		obj.test();
		LocalVariable.sample();
		
	}

}
