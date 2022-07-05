

public class StaticNonstatic {
	
	public static void test1() {
		
		int a=10;
		int b=20;
		int c=10+20;
		
		System.out.println(c);
	}
	
	public void main() {

		int d=5;
		int e=6;
		int s=d*e;
		
		System.out.println(s);
		
	}
	
	public static void main(String args[]) {
		
		StaticNonstatic.test1();
		
		StaticNonstatic obj = new StaticNonstatic();
		obj.main();
		
	}
	
	
}
