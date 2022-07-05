
public class StaticVariable2 {
	
    static int age = 50;
	static int marks = 100;
	
	static int a = 10;
	static int b = 20;
	
	public void addition() {
		
//		int a = 10;
//		int b = 20;
     	int c = a+b;
		System.out.println(c);
		System.out.println(age);
	}

	public static void mul() {
		
//		int x = 20;
//		int y = 30;
		int c = a*b;
		System.out.println(c);
		System.out.println(marks);
	}
	public static void main(String args[]) {
		
		StaticVariable.mul();
		StaticVariable obj = new StaticVariable();
		obj.addition();
	}
}
